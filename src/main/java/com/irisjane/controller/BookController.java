package com.irisjane.controller;

import com.irisjane.pojo.Book;
import com.irisjane.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: JANE
 * @Date:2022/1/28 - 01 - 28 - 20:13
 * @Description:
 * @Version:1.0
 */
@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String getAll(Model model){
        List<Book> allBooks = bookService.getAllBooks();
        model.addAttribute("list", allBooks);
        return "allBooks";
    }

    @RequestMapping("/bookByID")
    public String getBookByID(int id, Model model){
        Book book = bookService.getBook(id);
        model.addAttribute("book",book);
        return "bookByID";
    }

    @RequestMapping("/deleteBook")
    public String deleteBookByID(int id, Model model){
        bookService.deleteBook(id);
        return "redirect:/books/allBook" ;
    }

    @RequestMapping("/addBook")
    public String addBook(Book book, Model model){
        bookService.addBook(book);
        return "redirect:/books/allBook" ;
    }


}
