package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Andrey.Yamangulov
 * Date: 12.09.2021
 * Time: 12:53
 */
@Controller
public class CartPageController {
    private final UserService userService;

    @Autowired
    public CartPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }
}
