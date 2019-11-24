package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.service.MusicService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/music")
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

    @ApiOperation(value = "将评论热度前50的音乐信息打印到excel表中",notes = "无接受数据")
    @GetMapping("/export")
    public ResponseEntity<Resource> MusicReport() throws IOException {
        File file = musicService.export();
        Resource resource = new FileSystemResource(file);
        return ResponseEntity.ok(resource);
    }
}
