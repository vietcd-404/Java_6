package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p from Product p where p.category.id =?1")
    List<Product> findByCategoryId(String cid);

//    @Query("SELECT e FROM Product e")
//    Page<Product> findProduct(Pageable pageable);
}