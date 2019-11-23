package cn.analysys.douban.service;

import cn.analysys.douban.mapper.BookEssayMapper;
import cn.analysys.douban.pojo.BookEssay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookEssayService {

    @Autowired
    BookEssayMapper bookEssayMapper;

    public List<BookEssay> selBookEssayById(Integer id){
        return bookEssayMapper.selBookEssayById(id);
    }
}
