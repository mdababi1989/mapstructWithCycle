package com.example.demo;

import com.example.demo.model.BookEntity;
import com.example.demo.model.CategoryEntity;
import com.example.demo.model.EditorEntity;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;
    @Autowired
    EditorRepository editorRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        BookEntity bookEntity1 = new BookEntity();
        bookEntity1.setTitle("book1");
        BookEntity bookEntity2 = new BookEntity();
        bookEntity2.setTitle("book2");

        EditorEntity editorEntity = new EditorEntity();
        editorEntity.setName("editor");

        CategoryEntity categoryEntity1 = new CategoryEntity();
        categoryEntity1.setCategory("category1");
        CategoryEntity categoryEntity2 = new CategoryEntity();
        categoryEntity2.setCategory("category2");

        bookEntity1 = bookRepository.save(bookEntity1);
        bookEntity2 = bookRepository.save(bookEntity2);
        editorEntity = editorRepository.save(editorEntity);
        categoryEntity1 = categoryRepository.save(categoryEntity1);
        categoryEntity2 = categoryRepository.save(categoryEntity2);


    }
}
