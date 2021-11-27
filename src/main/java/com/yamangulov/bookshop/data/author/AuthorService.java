package com.yamangulov.bookshop.data.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Andrey.Yamangulov
 * Date: 03.09.2021
 * Time: 20:53
 */
@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    private List<Author> getAuthors() {
        List<Author> authors = authorRepository.findAll();
        authors.forEach(author -> {
            author.setFirstLetter(author.getAuthor().substring(0, 1).toUpperCase());
        });
        return authors;
    }

    public Map<String, List<Author>> authorsByFirstLetter() {
        return getAuthors().stream().collect(Collectors.groupingBy(Author::getFirstLetter));
    }
}
