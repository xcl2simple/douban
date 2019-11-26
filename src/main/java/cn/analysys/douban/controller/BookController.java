package cn.analysys.douban.controller;

import cn.analysys.douban.pojo.Book;
import cn.analysys.douban.pojo.BookEssay;
import cn.analysys.douban.pojo.BookReview;
import cn.analysys.douban.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *Description: 电影Controller
 *
 * @author xuyimin
 * @version 1.0
 * @since JDK 1.8
 */

@Api("书籍接口")
@RequestMapping("/book")
@RestController
@Slf4j
public class BookController {

    @Autowired
    BookService bookService;

    @ApiOperation(value = "最火的读书类目小说评论top10",notes = "无接受参数")
    @GetMapping("")
    public List<Book> showBook(){
        log.debug("访问api接口：/book");
        List<Book> listbooks=bookService.selBook();
        return listbooks;
    }

    @ApiOperation(value = "获取书评详情",notes = "根据影评id获取影评详情信息")
    @ApiImplicitParam(name = "essayId",value = "影评id",dataType = "String",required = true)
    @GetMapping ("/essay/{essayId}")
    public List<BookEssay> showBookEssay(@PathVariable("essayId") int id){
        log.debug("访问api接口：/book"+"/essay/"+id);
        List<BookEssay> listBookEssay=bookService.selBookEssay(id);
        return  listBookEssay;
    }

    @ApiOperation(value = "获取书籍基本信息和短评",notes = "根据书籍id获取基本信息和短评")
    @ApiImplicitParam(name = "reviewId",value = "查询短评id",dataType = "int",required = true)
    @GetMapping("/review/{reviewId}")
    public List<BookReview> showBookReview(@PathVariable("reviewId") int id){
        log.debug("访问api接口：/book"+"/review/"+id);
        List<BookReview> listBookReview=bookService.selBookReview(id);
        return listBookReview;
    }
}
