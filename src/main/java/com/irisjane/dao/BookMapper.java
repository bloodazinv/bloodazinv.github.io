package com.irisjane.dao;

import com.irisjane.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: JANE
 * @Date:2022/1/28 - 01 - 28 - 17:38
 * @Description:
 * @Version:1.0
 */
public interface BookMapper {

    //查询全部
    List<Book> getAllBooks();

    //查询byid
    Book getBook(@Param("bookID") int bookID);

    //删除byid
    int deleteBook(@Param("bookID") int bookID);

    //更新
    int updateBook(Book book);

    //增加
    int addBook(Book book);
}
