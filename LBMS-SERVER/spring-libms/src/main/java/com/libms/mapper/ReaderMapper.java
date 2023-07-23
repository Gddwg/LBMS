package com.libms.mapper;

import com.libms.pojo.Reader;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReaderMapper {

    //@Select("select * from reader_info")
    List<Reader> list(Integer rid,String rname,String sex);


    @Select("select * from reader_info where username = #{username} and password = #{password} ")
    Reader Login(String username,String password);


    @Select("select * from reader_info where rid = #{rid}")
    Reader getById(Integer rid);

    @Delete("delete from reader_info where rid = #{rid}")
    void delete(Integer rid);

    @Update("update reader_info set username = #{username}, password = #{password}, rname = #{rname}, sex = #{sex}, phone = #{phone}")
    void updata(Reader reader);

    @Insert("insert into reader_info(username, password, rname, sex, phone) value (#{username},#{password},#{rname},#{sex},#{phone})")
    void insert(Reader reader);
}
