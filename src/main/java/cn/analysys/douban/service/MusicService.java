package cn.analysys.douban.service;

import cn.analysys.douban.mapper.MusicReviewMapper;
import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.pojo.MusicReview;
import cn.analysys.douban.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private MusicReviewMapper reviewMapper;

    public List<Music> findTop50() {
        List<Music> musics = musicMapper.selectTop50();
        for(Music music : musics){
            System.out.println(music);
        }
        return musics;
    }

    public MusicDetail selectDetail(Integer id){

        List<MusicReview> reviews = reviewMapper.selectTop10(id);

        Music music = musicMapper.selectById(id);

        MusicDetail musicDetail = new MusicDetail(music,reviews);

        return musicDetail;
    }
}
