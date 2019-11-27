package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicEssay;
import cn.analysys.douban.pojo.MusicReview;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicMapper {

    List<Music> selectTop50();

    Music selectById(Integer id);

    MusicEssay selectEssay(Integer id);

    List<MusicReview> selectTop10(Integer id);

}