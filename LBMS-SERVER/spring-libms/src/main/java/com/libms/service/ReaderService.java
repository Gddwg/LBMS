package com.libms.service;

import com.libms.pojo.Reader;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReaderService {

    List<Reader> list(Reader reader);

    Reader getById(Integer rid);

    Reader Login(String username,String password);


    void delete(Integer rid);
}
