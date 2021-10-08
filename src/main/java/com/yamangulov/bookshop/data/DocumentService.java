package com.yamangulov.bookshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 14.09.2021
 * Time: 8:00
 */
@Service
public class DocumentService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DocumentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Document> getDocuments() {
        return null;
    }
}
