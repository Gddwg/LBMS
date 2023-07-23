package com.libms.controller;


import com.libms.pojo.Publish;
import com.libms.pojo.Result;
import com.libms.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    PublishService publishService;

    @GetMapping
    public Result list(){
        List<Publish> list = publishService.list();
        return Result.success(list);
    }
    @DeleteMapping
    public Result delete(Integer pid){
        publishService.delete(pid);
        return Result.success();
    }
}
