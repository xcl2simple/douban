package cn.analysys.douban.service;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;

import java.util.List;

public interface BookService {
    public List<Book> selBook();
    public List<BookEssay> selBookEssay(Integer id);
    public List<BookReview> selBookReview(Integer id);
}
