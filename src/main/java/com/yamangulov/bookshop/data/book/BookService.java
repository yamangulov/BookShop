package com.yamangulov.bookshop.data.book;

import com.yamangulov.bookshop.data.author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 28.08.2021
 * Time: 15:46
 */
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<Book> getBooksData() {
        // return bookRepository.findAll();
        // я подготовил 500 книг в БД, но вывод их всех на первую страницу страшно подгружает браузер,
        // поэтому для удобства я ограничил вывод и здесь тоже, вместо вывода всех книг из БД
        return bookRepository.findTop20ByOrderById();
    }

    // заглушка, которая выводит просто 20 книг из таблицы books, так как изменения в структурах таблиц еще
    // не производились к 4 модулю, предполагаю, что они будут в заданиях к следующим модулям, а здесь
    // достаточно вывести просто любые данные, чтобы показать правильную работу themyleaf на фронте
    public List<Book> getRecentBooks() {
        return bookRepository.findTop20ByOrderById();
    }

    // заглушка, которая выводит просто 20 книг из таблицы books, так как изменения в структурах таблиц еще
    // не производились к 4 модулю, предполагаю, что они будут в заданиях к следующим модулям, а здесь
    // достаточно вывести просто любые данные, чтобы показать правильную работу themyleaf на фронте
    public List<Book> getPopularBooks() {
        return bookRepository.findTop20ByOrderById();
    }

    private String getAuthorByAuthorId(int author_id) {
        return authorRepository.getById(author_id).getAuthor();
    }

    public List<Book> getPostponedBooks() {
        return null;
    }

    //заготовка, параметры и реализация будут добавлены позже
    public List<Book> getBooksByParams() {
        return null;
    }
}
