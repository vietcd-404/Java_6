package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}