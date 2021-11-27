package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.genre.GenreEntity;
import com.yamangulov.bookshop.data.genre.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 12:02
 */
@Controller
public class GenresPageController {
    public final GenreService genreService;

    @Autowired
    public GenresPageController(GenreService genreService) {
        this.genreService = genreService;
    }

    @ModelAttribute("levelZeroGenres")
    List<GenreEntity> levelZeroGenres() {
        return genreService.getLevelZeroGenres();
    }

    @GetMapping("/genres")
    public String genresPage() {
        return "genres/index";
    }
}
