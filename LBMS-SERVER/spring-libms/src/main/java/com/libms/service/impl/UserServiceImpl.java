package com.libms.service.impl;

import com.libms.mapper.UserMapper;
import com.libms.pojo.Publish;
import com.libms.pojo.User;
import com.libms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }

    @Override
    public User getById(String username, String password) {
        return userMapper.getById(username,password);
    }


}
