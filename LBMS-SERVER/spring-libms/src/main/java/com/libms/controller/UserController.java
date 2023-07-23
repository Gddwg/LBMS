package com.libms.controller;

import com.libms.pojo.Result;
import com.libms.pojo.User;
import com.libms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public Result listUsers(){
        List<User> users = userService.listUsers();
        return Result.success(users);
    }
}
