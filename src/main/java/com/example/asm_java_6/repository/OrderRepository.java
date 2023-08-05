package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByAccount_Username(String username);
}