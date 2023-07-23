package com.libms.service.impl;

import com.libms.mapper.LendMapper;
import com.libms.pojo.Lend;
import com.libms.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LendServiceImpl implements LendService {

    @Autowired
    LendMapper lendMapper;
    @Override
    public List<Lend> list(String rname,String bname) {
        return lendMapper.list(rname,bname);
    }

}
