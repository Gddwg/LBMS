package com.libms.mapper;

import com.libms.pojo.Lend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LendMapper {

//    @Select("select * from lend_list where rname = #{rname}")
//    List<Lend> getByRname(String rname);

    List<Lend> list(String rname,String bname);

}
