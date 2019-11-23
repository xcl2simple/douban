package cn.analysys.douban.service;

import cn.analysys.douban.pojo.Film;
import cn.analysys.douban.pojo.FilmDetail;
import cn.analysys.douban.pojo.FilmEssay;

import java.util.Date;
import java.util.List;


public interface FilmService {

    public List<Film> selectFromTimeAndArea(Date d, Integer area_id, Integer limitnum);

    public List<FilmDetail> selectMessageById(String id, Integer limitnum);

    public List<FilmEssay> selectfilmEssay(String id);
}
