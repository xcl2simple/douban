package cn.analysys.douban.service;
import cn.analysys.douban.pojo.Film;
import cn.analysys.douban.mapper.FilmMapper;
import cn.analysys.douban.pojo.FilmParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmMapper filmMapper;
    public List<Film> selectFromTimeAndArea(Date d, Integer area_id, Integer limitnum){
//            DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            String pd=sdf.format(d);
            FilmParam filmParam=new FilmParam();
            filmParam.setArea_id(area_id);
            filmParam.setDate(d);
            filmParam.setLimitnum(limitnum);
            return filmMapper.selectFromTimeAndArea(filmParam);
    }
}
