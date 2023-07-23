package com.libms.mapper;

import com.libms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user_info where username = #{username} and password = #{password}")
    User getById(String username,String password);

    @Select("select * from user_info")
    List<User> listUsers();

}
