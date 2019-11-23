package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicMapper {

    List<Music> selectTop50();

    Music selectById(Integer id);
}