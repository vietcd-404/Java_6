package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}