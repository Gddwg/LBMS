package com.libms.mapper;



import com.libms.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper/*<Book>*//* extends BaseMapper<Book> */{
    //@Select("select * from book_info")
    List<Book> list(Integer bid,
                    String bname,
                    String author);
    @Select("call lendbook(#{rname},#{bname},'null')")
    void lendbook(String rname,String bname);

    @Select("call backbook(#{bname})")
    void backbook(String bname);

    @Delete("delete from book_info where bid = #{bid}")
    void delete(Integer bid);

    @Update("update book_info set bname = #{bname}, author = #{author}, publish = #{publish}")
    void updata(Book book);

    @Insert("insert into book_info(bname, author, publish) VALUE (#{bname},#{author},#{publish}) ")
    void insert(Book book);
}
