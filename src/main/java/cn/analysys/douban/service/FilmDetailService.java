package cn.analysys.douban.service;

import cn.analysys.douban.pojo.FilmDetailParam;
import cn.analysys.douban.mapper.FilmDetailMapper;
import cn.analysys.douban.pojo.FilmDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmDetailService {
    @Autowired
    FilmDetailMapper filmDetailMapper;
    public List<FilmDetail> selectMessageById(String id,Integer limitnum){
        FilmDetailParam filmDetailParam = new FilmDetailParam();
        filmDetailParam.setId(id);
        filmDetailParam.setLimitnum(limitnum);
        return filmDetailMapper.selectMessageById(filmDetailParam);
    }
}
