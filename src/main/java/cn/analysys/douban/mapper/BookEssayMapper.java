package cn.analysys.douban.mapper;

import cn.analysys.douban.pojo.BookEssay;

import java.util.List;

public interface BookEssayMapper {
    List<BookEssay> selBookEssayById(Integer id);
}
