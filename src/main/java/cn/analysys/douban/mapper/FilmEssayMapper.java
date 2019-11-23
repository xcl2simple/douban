package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.FilmEssay;

import java.util.List;

public interface FilmEssayMapper {
    List<FilmEssay> selectfilmEssay(Integer id);
}
