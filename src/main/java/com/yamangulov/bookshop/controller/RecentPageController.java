package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.book.Book;
import com.yamangulov.bookshop.data.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 11:36
 */
@Controller
public class RecentPageController {
    private final BookService bookService;

    @Autowired
    public RecentPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("recentBooks")
    public List<Book> recentBooks() {
        return bookService.getRecentBooks();
    }

    @GetMapping("/books/recent")
    public String recentPage() {
        return "books/recent";
    }

}
