package com.libms.controller;

import com.libms.pojo.Lend;
import com.libms.pojo.Result;
import com.libms.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/lend")
public class LendController {
    @Autowired
    LendService lendService;
    @GetMapping
    public Result list(String rname,String bname){
        List<Lend> l = lendService.list(rname,bname);
        return Result.success(l);
    }



}
