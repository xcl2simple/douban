package cn.analysys.douban.service;

import cn.analysys.douban.mapper.BookMapper;
import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookmapper;

    public List<Book> selectBook() {
        return bookmapper.selectBook();
    }

}
