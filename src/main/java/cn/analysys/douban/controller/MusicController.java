package cn.analysys.douban.controller;

import cn.analysys.douban.exception.BusinessException;
import cn.analysys.douban.exception.EmBusinessError;
import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.pojo.MusicVO;
import cn.analysys.douban.service.MusicService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
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
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @ApiOperation(value = "获取评论热度前50的音乐信息",notes = "无接受参数")
    @GetMapping ("/rankingList")
    public ResponseEntity<List<MusicVO>> rankingList(){
        List<Music> musicList =musicService.findTop50();
        List<MusicVO> musicVOS = convertFormMusicList(musicList);
        return ResponseEntity.ok(musicVOS);
    }

    @ApiOperation(value = "获取音乐基本信息和短评",notes = "根据音乐id获取音乐基本信息和短评")
    @ApiImplicitParam(name ="musicId", value = "音乐id", dataType="Integer", required = true)
    @GetMapping("/detail/{musicId}")
    public ResponseEntity<MusicDetail> selectDetail(@PathVariable() Integer musicId) throws BusinessException {
        MusicDetail musicDetail =musicService.selectDetail(musicId);
//        if (musicDetail == null){
//            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
//        }
        System.out.println(musicDetail.getMusic());
        return ResponseEntity.ok(musicDetail);
    }

    @ApiOperation(value = "将评论热度前50的音乐信息打印到excel表中",notes = "无接受数据")
    @GetMapping("/export")
    public ResponseEntity<Resource> MusicReport() throws IOException {
        File file = musicService.export();
        Resource resource = new FileSystemResource(file);
        return ResponseEntity.ok(resource);
    }

    /**
     * 转换Music的list集合成为MusicVO的list集合
     *
     * @param musics
     * @return List<MusicVO>
     */
    private List<MusicVO> convertFormMusicList(List<Music> musics){
        List<MusicVO> musicVOS = new ArrayList<>();

        for (Music music : musics){
            MusicVO musicVO = new MusicVO();
            BeanUtils.copyProperties(music,musicVO);
            musicVOS.add(musicVO);
        }

        return musicVOS;
    }
}
