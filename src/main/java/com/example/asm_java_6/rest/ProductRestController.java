package com.example.asm_java_6.rest;

import com.example.asm_java_6.entity.Product;
import com.example.asm_java_6.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductRestController {
    @Autowired
    ProductServiceImpl productService;

//    @GetMapping()
//    public List<Product> getAll() {
//        return productService.findAll();
//    }
    @GetMapping()
    public Page<Product> getAll(Pageable pageable) {
        return productService.getPage(pageable);
    }

//    @GetMapping()
//    public Page<Product> getAllProducts(@RequestParam int page,
//                                              @RequestParam int size) {
//        PageRequest pr = PageRequest.of(page,size);
//        Pageable pageable = PageRequest.of(page, size);
//        return productService.getPage(pr);
////        Page<Product> products = productService.getPage(pageable);
////        int previousPage = Math.max(1, page - 1);
////        int nextPage = Math.min(products.getTotalPages(), page + 1);
////        Map<String, Object> response = new HashMap<>();
////        response.put("content", products.getContent());
////        response.put("totalPages", products.getTotalPages());
////        response.put("currentPage", page);
////        response.put("previousPage", previousPage);
////        response.put("nextPage", nextPage);
////        return response;
//    }

//    @GetMapping("/next")
//    public Page<Product> getNextPage(@RequestParam int currentPage, @RequestParam int size) {
//        if (currentPage < 0) {
//            throw new IllegalArgumentException("currentPage must be greater than or equal to 0");
//        }
//        Pageable nextPageable = PageRequest.of(currentPage + 1, size);
//        return productService.getPage(nextPageable);
//    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("{id}")
    public Product getOne(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    @PutMapping("{id}")
    public Product update(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        productService.delete(id);
    }
}
