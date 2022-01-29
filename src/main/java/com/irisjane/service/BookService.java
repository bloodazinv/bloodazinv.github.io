package com.irisjane.service;

import com.irisjane.pojo.Book;

import java.util.List;

/**
 * @Author: JANE
 * @Date:2022/1/28 - 01 - 28 - 17:54
 * @Description:
 * @Version:1.0
 */
public interface BookService {
    //查询全部
    List<Book> getAllBooks();

    //查询byid
    Book getBook(int bookID);

    //删除byid
    int deleteBook(int bookID);

    //更新
    int updateBook(Book book);

    //增加
    int addBook(Book book);

}
