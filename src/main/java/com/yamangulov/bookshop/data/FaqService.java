package com.yamangulov.bookshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 14.09.2021
 * Time: 8:14
 */
@Service
public class FaqService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FaqService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Faq> getFaqs() {
        return null;
    }
}
