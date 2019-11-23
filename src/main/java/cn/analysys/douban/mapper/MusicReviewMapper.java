package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.MusicReview;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicReviewMapper {

    List<MusicReview> selectTop10(Integer id);

}