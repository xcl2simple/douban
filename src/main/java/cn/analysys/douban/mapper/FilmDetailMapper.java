package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.FilmDetail;
import cn.analysys.douban.pojo.FilmDetailParam;

import java.util.List;

public interface FilmDetailMapper {
    List<FilmDetail> selectMessageById(FilmDetailParam filmDetailParam);
}
