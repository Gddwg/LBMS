package com.libms.mapper;

import com.libms.pojo.Publish;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PublishMapper {
    @Select("select * from publish_info")
    List<Publish> list();

    @Delete("delete from publish_info where pid =#{pid}")
    void delete(Integer pid);

    @Update("update publish_info set pname = #{pname}, paddress = #{paddress}, phone = #{phone}")
    void updata(Publish publish);

    @Insert("insert into publish_info(pname, paddress, phone) VALUE (#{pname},#{paddress},#{phone})")
    void insert(Publish publish);
}
