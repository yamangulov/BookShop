package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.Book;
import com.yamangulov.bookshop.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 28.08.2021
 * Time: 12:18
 */
@Controller
public class MainPageController {
    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks() {
        return bookService.getBooksData();
    }

    @ModelAttribute("recentBooks")
    public List<Book> recentBooks() {
        return bookService.getRecentBooks();
    }

    @ModelAttribute("popularBooks")
    public List<Book> popularBooks() {
        return bookService.getPopularBooks();
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

}
