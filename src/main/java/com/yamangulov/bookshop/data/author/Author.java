package com.yamangulov.bookshop.data.author;

import com.yamangulov.bookshop.data.book.Book;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 03.09.2021
 * Time: 20:47
 */
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String author;

    @Transient
    String firstLetter;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", firstLetter='" + firstLetter + '\'' +
                '}';
    }
}
