package com.example.demo.controller;

import com.example.demo.mapper.BookMapper;
import com.example.demo.model.BookEntity;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    EditorRepository editorRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    BookMapper bookMapper;
    @Autowired
    EditorRepository editorRepository;

    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/booksDTO")
    List<BookDTO> booksDTO(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }



}
