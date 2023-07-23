package com.libms.service.impl;

import com.libms.mapper.ReaderMapper;
import com.libms.pojo.Reader;
import com.libms.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    ReaderMapper readerMapper;

    @Override
    public List<Reader> list(Reader reader) {
        Integer rid = reader.getRid();
        String rname = reader.getRname();
        String sex = reader.getSex();
        return readerMapper.list(rid,rname,sex);
    }

    @Override
    public Reader getById(Integer rid) {
        return readerMapper.getById(rid);
    }

    @Override
    public Reader Login(String username, String password) {
        return readerMapper.Login(username, password);
    }

    @Override
    public void delete(Integer rid) {
        readerMapper.delete(rid);
    }

}
