package com.yamangulov.bookshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 28.08.2021
 * Time: 15:46
 */
@Service
public class BookService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksData() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books", (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }

    // заглушка, которая выводит просто 20 книг из таблицы books, так как изменения в структурах таблиц еще
    // не производились к 4 модулю, предполагаю, что они будут в заданиях к следующим модулям, а здесь
    // достаточно вывести просто любые данные, чтобы показать правильную работу themyleaf на фронте
    public List<Book> getRecentBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books LIMIT 20", (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }

    // заглушка, которая выводит просто 20 книг из таблицы books, так как изменения в структурах таблиц еще
    // не производились к 4 модулю, предполагаю, что они будут в заданиях к следующим модулям, а здесь
    // достаточно вывести просто любые данные, чтобы показать правильную работу themyleaf на фронте
    public List<Book> getPopularBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books LIMIT 20", (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }

    public List<Book> getPostponedBooks() {
        return null;
    }

    //заготовка, параметры и реализация будут добавлены позже
    public List<Book> getBooksByParams() {
        return null;
    }
}
