package cn.analysys.douban.service.impl;

import cn.analysys.douban.mapper.BookMapper;
import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;
import cn.analysys.douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> selBook() {
        return bookMapper.selBook();
    }

    @Override
    public List<BookEssay> selBookEssay(Integer id) {
        return bookMapper.selBookEssay(id);
    }

    @Override
    public List<BookReview> selBookReview(Integer id) {
        return bookMapper.selBookReview(id);
    }
}
