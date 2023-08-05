package com.example.asm_java_6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart/view")
public class CartController {

    @GetMapping
    public String cart(){
        return "cart/view";
    }
}
