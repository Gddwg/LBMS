package com.libms.controller;

import com.libms.pojo.Reader;
import com.libms.pojo.Result;
import com.libms.pojo.User;
import com.libms.service.ReaderService;
import com.libms.service.UserService;
import com.libms.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    ReaderService readerService;


    @GetMapping("/user")
    public Result userlogin(String username,String password){
        User u = userService.getById(username,password);
        if(u != null){
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("xxx","user");
            String jwt = JwtUtils.generateJwt(claims);
            return Result.success(u);
        }

        return Result.error("用户名或密码错误");
    }
    @GetMapping("/reader")
    public Result readerlogin(String username,String password){
        Reader r = readerService.Login(username, password);
        if(r != null){
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("id","reader");
            String jwt = JwtUtils.generateJwt(claims);
            return Result.success(r);
        }

        return Result.error("用户名或密码错误");
    }
}
