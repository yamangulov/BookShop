package com.yamangulov.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Andrey.Yamangulov
 * Date: 14.09.2021
 * Time: 8:10
 */
@Controller
public class AboutPageController {
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}
