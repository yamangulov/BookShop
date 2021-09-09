package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.Author;
import com.yamangulov.bookshop.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Map;

/**
 * Created by Andrey.Yamangulov
 * Date: 11.09.2021
 * Time: 11:49
 */
@Controller
public class AuthorsController {
    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @ModelAttribute("authorsMap")
    Map<String, List<Author>> authorsMap() {
        return authorService.authorsByFirstLetter();
    }

    @GetMapping("/authors")
    public String authorsPage() {
        return "authors/index";
    }
}
