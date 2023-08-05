package com.example.asm_java_6.service.impl;

import com.example.asm_java_6.repository.CategoryRepository;
import com.example.asm_java_6.entity.Category;
import com.example.asm_java_6.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
