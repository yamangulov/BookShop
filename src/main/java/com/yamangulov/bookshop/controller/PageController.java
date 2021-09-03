package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.AuthorService;
import com.yamangulov.bookshop.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrey.Yamangulov
 * Date: 28.08.2021
 * Time: 12:18
 */
@Controller
@RequestMapping("/bookshop")
public class PageController {
    private final BookService bookService;
    private final AuthorService authorService;

    @Autowired
    public PageController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("bookData", bookService.getBooksData());
        return "index";
    }

    @GetMapping("/genres")
    public String genresPage() {
        return "genres/index";
    }

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("authorsMap", authorService.authorsByFirstLetter());
        return "authors/index";
    }
}