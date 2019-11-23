package cn.analysys.douban.service.impl;

import cn.analysys.douban.mapper.FilmMapper;
import cn.analysys.douban.pojo.Film;
import cn.analysys.douban.pojo.FilmParam;
import cn.analysys.douban.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author mochuting
 * @version 1.0
 * @date 2019/11/23 20:42
 * @since JDK 1.8
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmMapper filmMapper;

    public List<Film> selectFromTimeAndArea(Date d, Integer area_id, Integer limitnum){
//            DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            String pd=sdf.format(d);
        FilmParam filmParam=new FilmParam();
        filmParam.setArea_id(area_id);
        filmParam.setDate(d);
        filmParam.setLimitnum(limitnum);
        return filmMapper.selectFromTimeAndArea(filmParam);
    }

}
