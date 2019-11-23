package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.*;

import java.util.List;

public interface FilmMapper {
    List<Film> selectFromTimeAndArea(FilmParam fact);

    List<FilmDetail> selectMessageById(FilmDetailParam filmDetailParam);

    List<FilmEssay> selectfilmEssay(String id);
}
