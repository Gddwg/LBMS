package com.libms.controller;



import com.libms.pojo.Book;
import com.libms.pojo.Result;
import com.libms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public Result list(Integer bid,
                       String bname,
                       String author){
        List<Book> books = bookService.list(bid,bname,author);
        return Result.success(books);
    }
    @GetMapping("/lend")
    public Result lendbook(String rname,String bname){
        bookService.lendbook(rname,bname);
        return Result.success();
    }
    @GetMapping("/back")
    public Result lendbook(String bname){
        bookService.backbook(bname);
        return Result.success();
    }
    @DeleteMapping
    public Result delete(Integer bid){
        bookService.delete(bid);
        return Result.success();
    }
}
