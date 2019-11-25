package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;

import java.util.List;

public interface BookMapper {
    List<Book> selBook();
    List<BookEssay> selBookEssay(Integer id);
    List<BookReview> selBookReview(Integer id);
}
