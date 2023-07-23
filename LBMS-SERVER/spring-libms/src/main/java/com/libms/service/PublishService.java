package com.libms.service;

import com.libms.pojo.Publish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublishService {

    List<Publish> list();

    void delete(Integer pid);
}
