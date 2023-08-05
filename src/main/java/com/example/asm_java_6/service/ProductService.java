package com.example.asm_java_6.service;

import com.example.asm_java_6.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ProductService {
    public List<Product> findAll();

    Product findById(Integer id);

    List<Product> findCategoryId(String cid);

    Page<Product> getPage(Pageable pageable);

    Product create(Product product);

    Product update(Product product);

    void delete(Integer id);
}
