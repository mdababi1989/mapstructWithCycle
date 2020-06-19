package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class EditorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            mappedBy = "editor",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List< BookEntity > bookList;

}
