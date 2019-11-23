package cn.analysys.douban.service;

import cn.analysys.douban.pojo.Film;
import java.util.Date;
import java.util.List;


public interface FilmService {

    public List<Film> selectFromTimeAndArea(Date d, Integer area_id, Integer limitnum);

}
