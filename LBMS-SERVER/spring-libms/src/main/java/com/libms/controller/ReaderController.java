package com.libms.controller;

import com.libms.pojo.Reader;
import com.libms.pojo.Result;
import com.libms.pojo.User;
import com.libms.service.ReaderService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/reader")
public class ReaderController {
    @Autowired
    ReaderService readerService;
    @GetMapping
    public Result getById(Integer rid){
        Reader r = readerService.getById(rid);
        return Result.success(r);
    }
    @PostMapping
    public Result list(@RequestBody Reader reader){
        System.out.println(reader);
        List<Reader> list = readerService.list(reader);
        return Result.success(list);
    }
    @DeleteMapping
    public Result delete(Integer rid){
        readerService.delete(rid);
        return Result.success();
    }

}
