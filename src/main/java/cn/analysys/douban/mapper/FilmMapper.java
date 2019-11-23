package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Film;
import cn.analysys.douban.pojo.FilmParam;

import java.util.List;

public interface FilmMapper {
    List<Film> selectFromTimeAndArea(FilmParam fact);
}
