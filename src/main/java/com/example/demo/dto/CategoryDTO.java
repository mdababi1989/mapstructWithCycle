package com.example.demo.dto;

import lombok.Data;

import java.util.List;
@Data
public class CategoryDTO {

    private Long id;

    private String category;

    private List< BookDTO > bookList;
}
