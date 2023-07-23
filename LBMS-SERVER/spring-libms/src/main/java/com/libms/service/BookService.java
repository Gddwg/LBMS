package com.libms.service;


import com.libms.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> list(Integer bid,
                    String bname,
                    String author);

    void lendbook(String rname,String bname);

    void backbook(String bname);

    void delete(Integer bid);
}
