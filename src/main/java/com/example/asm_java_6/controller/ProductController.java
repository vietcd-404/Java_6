package com.example.asm_java_6.controller;

import com.example.asm_java_6.entity.Category;
import com.example.asm_java_6.entity.Product;
import com.example.asm_java_6.service.CategoryService;
import com.example.asm_java_6.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller

public class ProductController {
   @Autowired
    ProductServiceImpl  productService;

   @Autowired
    CategoryService categoryService;
    @RequestMapping("product/list")
    public String list(Model model, @RequestParam(value = "cid", required = false) Optional<String> cid) {
        if (cid.isPresent()) {
            List<Product> list = productService.findCategoryId(cid.get());
            model.addAttribute("items", list);
        } else {
            List<Product> list = productService.findAll();
            model.addAttribute("items", list);
        }
        List<Category> list = categoryService.findAll();
        model.addAttribute("category", list);
        return "product/list";
    }

    @GetMapping("product/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Product item = productService.findById(id);
        model.addAttribute("item", item);
        return "product/detail";
    }
}
