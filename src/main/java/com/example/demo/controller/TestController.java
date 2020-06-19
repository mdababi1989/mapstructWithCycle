package com.example.demo.controller;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.EditorDTO;
import com.example.demo.mapper.BookMapper;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.mapper.EditorMapper;
import com.example.demo.model.BookEntity;
import com.example.demo.model.CategoryEntity;
import com.example.demo.model.EditorEntity;
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
    EditorMapper editorMapper;
    @Autowired
    CategoryMapper categoryMapper;

    @GetMapping("/books")
    List<BookEntity> books(){
        return this.bookRepository.findAll();
    }
    @GetMapping("/booksDTO")
    List<BookDTO> booksDTO(){
        return this.bookMapper.toDTOList(bookRepository.findAll());
    }

    @GetMapping("/editor")
    List<EditorEntity> editor(){
        return this.editorRepository.findAll();
    }
    @GetMapping("/editorDTO")
    List<EditorDTO> editorDTO(){
        return this.editorMapper.toDTOList(editorRepository.findAll());
    }


    @GetMapping("/categories")
    List<CategoryEntity> categories(){
        return this.categoryRepository.findAll();
    }
    @GetMapping("/categoriesDTO")
    List<BookDTO> categoriesDTO(){
        return this.bookMapper.toDTOList(bookRepository.findAll());
    }

}
