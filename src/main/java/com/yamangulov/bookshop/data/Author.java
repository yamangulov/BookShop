package com.yamangulov.bookshop.data;

import java.util.Locale;

/**
 * Created by Andrey.Yamangulov
 * Date: 03.09.2021
 * Time: 20:47
 */
public class Author {
    Integer id;
    String author;
    String firstLetter;

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
