package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.service.MusicService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @ApiOperation(value = "获取评论热度前50的音乐信息",notes = "无接受参数")
    @GetMapping ("/rankingList")
    public List<Music> rankingList(){
        List<Music> musicList =musicService.findTop50();
        return musicList;
    }

    @ApiOperation(value = "获取音乐基本信息和短评",notes = "根据音乐id获取音乐基本信息和短评")
    @ApiImplicitParam(name ="musicid", value = "音乐id", dataType="Integer", required = true)
    @GetMapping("/detail/{musicid}")
    public MusicDetail selectDetail(@PathVariable() Integer musicid){
        MusicDetail musicDetail =musicService.selectDetail(musicid);

        return musicDetail;
    }
}
