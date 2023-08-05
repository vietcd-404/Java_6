package com.example.asm_java_6.service;

import com.example.asm_java_6.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public interface OrderService {
    Order create(JsonNode orderData);

    Object findById(Long id);

    List<Order> findByCus(String name);
}
