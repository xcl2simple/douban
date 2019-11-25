package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;
import cn.analysys.douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping ("/bookEssay/{id}")
    public List<BookEssay> showBookEssay(@PathVariable("id") int id){
        List<BookEssay> listBookEssay=bookService.selBookEssay(id);
        return  listBookEssay;
    }

    @GetMapping("/bookReview/{id}")
    public List<BookReview> showBookReview(@PathVariable("id") int id){
        List<BookReview> listBookReview=bookService.selBookReview(id);
        return listBookReview;
    }
}
