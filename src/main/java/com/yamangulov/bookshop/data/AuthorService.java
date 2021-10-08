package com.yamangulov.bookshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
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
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private List<Author> getAuthors() {
        List<Author> authors =
                jdbcTemplate.query("SELECT * from authors", (ResultSet rs, int rowNub) -> {
                    Author author = new Author();
                    author.setId(rs.getInt("id"));
                    author.setAuthor(rs.getString("author"));
                    author.setFirstLetter(author.getAuthor().substring(0, 1).toUpperCase());
                    return author;}
                );
        return new ArrayList<>(authors);
    }

    public Map<String, List<Author>> authorsByFirstLetter() {
        return getAuthors().stream().collect(Collectors.groupingBy(Author::getFirstLetter));
    }
}
