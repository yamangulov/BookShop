package com.yamangulov.bookshop.data.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 12:07
 */
@Service
public class GenreService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GenreService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public List<GenreEntity> getLevelZeroGenres() {
        return null;
    }

    //будет использовано в заданиях для следующих модулей
    public List<GenreEntity> getLevelNGenresByParent(GenreEntity genre, int n) {
        return null;
    }
}
