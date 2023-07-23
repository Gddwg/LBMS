package com.libms.service;

import com.libms.mapper.UserMapper;
import com.libms.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> listUsers();

    User getById(String username,String password);
}
