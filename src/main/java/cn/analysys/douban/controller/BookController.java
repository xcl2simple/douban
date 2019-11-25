package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;
import cn.analysys.douban.service.BookEssayService;
import cn.analysys.douban.service.BookReviewService;
import cn.analysys.douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookEssayService bookEssayService;

    @Autowired
    BookReviewService bookReviewService;

    @GetMapping("/book")
    public List<Book> showBook(){
        List<Book> listbooks=bookService.selectBook();
        return listbooks;
    }

    @GetMapping ("/bookEssay")
    public List<BookEssay> showBookEssay(){
        List<BookEssay> listBookEssay=bookEssayService.selBookEssayById(1000016);
        return  listBookEssay;
    }

    @GetMapping("/bookReview")
    public List<BookReview> showBookReview(){
        List<BookReview> listBookReview=bookReviewService.selBookReview(1007433);
        return listBookReview;
    }
}
