package com.example.demo.dto;

import lombok.Data;

import java.util.List;
@Data
public class BookDTO {
    private Long id;
    private String title;
    private EditorDTO editor;
    private List< CategoryDTO > categoryList;
}
