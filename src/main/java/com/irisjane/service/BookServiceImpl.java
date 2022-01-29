package com.irisjane.service;

import com.irisjane.dao.BookMapper;
import com.irisjane.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JANE
 * @Date:2022/1/28 - 01 - 28 - 17:54
 * @Description:
 * @Version:1.0
 */

public class BookServiceImpl implements BookService{
    BookMapper bookMapper;


    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book getBook(int bookID) {
        return bookMapper.getBook(bookID);
    }

    @Override
    public int deleteBook(int bookID) {
        return bookMapper.deleteBook(bookID);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
}
