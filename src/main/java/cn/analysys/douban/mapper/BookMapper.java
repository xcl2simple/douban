package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.Book;

import java.util.List;

public interface BookMapper {

    List<Book> selectBook();
}
