package com.libms.service.impl;

import com.libms.mapper.PublishMapper;
import com.libms.pojo.Publish;
import com.libms.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PublishServiceImpl implements PublishService {
    @Autowired
    PublishMapper publishMapper;


    @Override
    public List<Publish> list() {
        return publishMapper.list();
    }

    @Override
    public void delete(Integer pid) {
        publishMapper.delete(pid);
    }
}
