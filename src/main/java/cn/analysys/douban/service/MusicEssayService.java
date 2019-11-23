package cn.analysys.douban.service;

import cn.analysys.douban.mapper.MusicEssayMapper;
import cn.analysys.douban.pojo.MusicEssay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicEssayService {

    @Autowired
    private MusicEssayMapper essayMapper;


    public MusicEssay selectById(Integer id){
        MusicEssay musicEssay = essayMapper.selectEssay(id);
        System.out.println(musicEssay);
        return musicEssay;
    }
}
