package com.example.demo.dto;

import lombok.Data;

import java.util.List;
@Data
public class EditorDTO {

    private Long id;
    private String name;
    private List< BookDTO > bookList;
}
