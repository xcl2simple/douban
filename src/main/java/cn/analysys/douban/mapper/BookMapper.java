package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookReview;

import java.util.List;

public interface BookMapper {

    List<Book> selectBook();
}
