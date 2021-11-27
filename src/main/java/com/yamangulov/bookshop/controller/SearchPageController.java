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
 * Date: 14.09.2021
 * Time: 7:43
 */
@Controller
public class SearchPageController {
    private final BookService bookService;

    @Autowired
    public SearchPageController(BookService bookService) {
        this.bookService = bookService;
    }

    //заготовка, параметры и реализация будут добавлены позже
    @ModelAttribute("searchResult")
    public List<Book> searchResult() {
        return bookService.getBooksByParams();
    }

    //временная заглушка, выводящая на статическую страницу поиска,
    //будет заменена в заданиях к следующим модулям курса
    @GetMapping("/search")
    public String searchPage() {
        return "search/index";
    }

}
