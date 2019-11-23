package cn.analysys.douban.service;

import cn.analysys.douban.pojo.FilmEssay;
import cn.analysys.douban.mapper.FilmEssayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmEssayService {
    @Autowired
    FilmEssayMapper filmEssayMapper;
    public List<FilmEssay> selectfilmEssay(Integer id){
        return filmEssayMapper.selectfilmEssay(id);
    }
}
