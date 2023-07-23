package com.libms.service;

import com.libms.pojo.Lend;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LendService {
    List<Lend> list(String rname,String bname);

}
