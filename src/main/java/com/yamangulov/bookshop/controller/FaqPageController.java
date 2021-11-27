package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.other.FaqEntity;
import com.yamangulov.bookshop.data.other.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 14.09.2021
 * Time: 8:13
 */
@Controller
public class FaqPageController {
    private final FaqService faqService;

    @Autowired
    public FaqPageController(FaqService faqService) {
        this.faqService = faqService;
    }

    @ModelAttribute("faq")
    public List<FaqEntity> getFaqs() {
        return faqService.getFaqs();
    }

    @GetMapping("/faq")
    public String faqPage() {
        return "faq";
    }
}
