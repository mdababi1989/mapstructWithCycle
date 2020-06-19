package com.example.demo.repository;

import com.example.demo.model.EditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorRepository extends JpaRepository<EditorEntity, Long> {
}
