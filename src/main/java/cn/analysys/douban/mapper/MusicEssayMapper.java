package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.MusicEssay;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicEssayMapper {

    MusicEssay selectEssay(Integer id);
}