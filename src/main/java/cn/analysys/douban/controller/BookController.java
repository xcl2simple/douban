package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;
import cn.analysys.douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *Description: 电影Controller
 *
 * @author xuyimin
 * @version 1.0
 * @since JDK 1.8
 */

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> showBook(){
        List<Book> listbooks=bookService.selBook();
        return listbooks;
    }

    @GetMapping ("/bookEssay")
    public List<BookEssay> showBookEssay(){
        List<BookEssay> listBookEssay=bookService.selBookEssay(1000016);
        return  listBookEssay;
    }

    @GetMapping("/bookReview")
    public List<BookReview> showBookReview(){
        List<BookReview> listBookReview=bookService.selBookReview(1007433);
        return listBookReview;
    }
}
