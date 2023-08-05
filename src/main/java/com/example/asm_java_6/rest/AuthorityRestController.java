package com.example.asm_java_6.rest;


import com.example.asm_java_6.entity.Authority;
import com.example.asm_java_6.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/authorities")
public class AuthorityRestController {
    @Autowired
    AuthorityService authorityService;

    @GetMapping
    public List<Authority> getAll(@RequestParam("admin") Optional<Boolean> admin) {
        if (admin.orElse(false)) {
            return authorityService.findAuthoritiesOfAdmin();
        }
        return authorityService.findAll();
    }

    @PostMapping
    public Authority post(@RequestBody Authority authority) {
        return authorityService.create(authority);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        authorityService.delete(id);
    }
}
