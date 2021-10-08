package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.Book;
import com.yamangulov.bookshop.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 11:48
 */
@Controller
public class PopularPageController {
    public final BookService bookService;

    @Autowired
    public PopularPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("popularBooks")
    public List<Book> popularBooks() {
        return bookService.getPopularBooks();
    }

    @GetMapping("/books/popular")
    public String popularPage() {
        return "books/popular";
    }
}
