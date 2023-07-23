package com.libms.service.impl;

import com.libms.mapper.BookMapper;

import com.libms.pojo.Book;
import com.libms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> list(Integer bid,
                           String bname,
                           String author) {
        return bookMapper.list(bid,bname,author);
    }

    @Override
    public void lendbook(String rname, String bname) {
        bookMapper.lendbook(rname,bname);
    }

    @Override
    public void backbook(String bname) {
        bookMapper.backbook(bname);
    }

    @Override
    public void delete(Integer bid) {
         bookMapper.delete(bid);
    }
}
