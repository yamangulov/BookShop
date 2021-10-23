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
 * Time: 11:54
 */
@Controller
public class PostponedPageController {
    private final BookService bookService;

    @Autowired
    public PostponedPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("postponedBooks")
    private List<Book> postponedBooks() {
        return bookService.getPostponedBooks();
    }

    @GetMapping("/postponed")
    public String postponedPage() {
        return "postponed";
    }

}
