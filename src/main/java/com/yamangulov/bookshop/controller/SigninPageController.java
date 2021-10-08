package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 12:57
 */
@Controller
public class SigninPageController {
    private final UserService userService;

    @Autowired
    public SigninPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signin")
    public String signinPage() {
        return "signin";
    }
}
