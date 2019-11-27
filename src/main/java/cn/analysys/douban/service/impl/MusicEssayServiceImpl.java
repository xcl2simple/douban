package cn.analysys.douban.service.impl;

import cn.analysys.douban.mapper.MusicMapper;
import cn.analysys.douban.pojo.MusicEssay;
import cn.analysys.douban.service.MusicEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicEssayServiceImpl implements MusicEssayService {

    @Autowired
    private MusicMapper musicMapper;

    @Override
    public MusicEssay selectById(Integer id){
        MusicEssay musicEssay = musicMapper.selectEssay(id);
        System.out.println(musicEssay);
        return musicEssay;
    }
}
