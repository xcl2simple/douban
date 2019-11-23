package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Film;
import cn.analysys.douban.pojo.FilmDetail;
import cn.analysys.douban.pojo.FilmEssay;
import cn.analysys.douban.service.FilmDetailService;
import cn.analysys.douban.service.FilmEssayService;
import cn.analysys.douban.service.FilmService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Description: 电影Controller
 *
 * @author Mr.Du
 * @version 1.0
 * @date 2019/11/21 17:14
 * @since JDK 1.8
 */

@Api("电影接口")
@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @Autowired
    FilmDetailService filmDetailService=new FilmDetailService();

    @Autowired
    FilmEssayService filmEssayService=new FilmEssayService();

    @ApiOperation(value = "获取当前一周评论最多的50部电影的降序排行",notes = "无接受参数")
    @GetMapping("/film")
    public List<Film> filmShow() throws ParseException {
        Film f=new Film();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf.parse("2012-11-11");
        List<Film> films;
        films=filmService.selectFromTimeAndArea(d, 13,50);
        return films;
    }

    @ApiOperation(value = "获取电影基本信息和短评",notes = "根据电影id获取基本信息和短评")
    @ApiImplicitParam(name = "filmId",value = "查询电影id",dataType = "Integer",required = true)
    @GetMapping("/filmDetail/{filmId}")
    public List<FilmDetail> filmDetailShow(@PathVariable String filmId) throws ParseException {
        List<FilmDetail> filmDetailList;
        filmDetailList=filmDetailService.selectMessageById(filmId,10);
        return filmDetailList;
    }

    @ApiOperation(value = "获取影评详情",notes = "根据影评id获取影评详情信息")
    @ApiImplicitParam(name = "essayId",value = "影评id",dataType = "Integer",required = true)
    @GetMapping("/filmEssay/{essayId}")
    public List<FilmEssay> filmEssayShow(@PathVariable Integer essayId) throws ParseException{
        List<FilmEssay> filmEssayList;
        filmEssayList=filmEssayService.selectfilmEssay(essayId);
        return filmEssayList;
    }
}
