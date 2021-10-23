package com.yamangulov.bookshop.controller;

import com.yamangulov.bookshop.data.other.DocumentEntity;
import com.yamangulov.bookshop.data.other.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Andrey.Yamangulov
 * Date: 14.09.2021
 * Time: 7:57
 */
@Controller
public class DocumentsPageController {
    private final DocumentService documentService;

    @Autowired
    public DocumentsPageController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @ModelAttribute("documents")
    public List<DocumentEntity> documents() {
        return documentService.getDocuments();
    }

    @GetMapping("/documents")
    public String documentsPage() {
        return "/documents/index";
    }
}
