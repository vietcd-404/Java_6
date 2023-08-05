package com.example.asm_java_6.service;


import com.example.asm_java_6.entity.Authority;

import java.util.List;

public interface AuthorityService {
    List<Authority> findAuthoritiesOfAdmin();

    List<Authority> findAll();

    Authority create(Authority authority);

    void delete(Integer id);
}
