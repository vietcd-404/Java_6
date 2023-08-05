package com.example.asm_java_6.service.impl;

import com.example.asm_java_6.repository.AccountRepository;
import com.example.asm_java_6.repository.AuthorityRepository;
import com.example.asm_java_6.entity.Account;
import com.example.asm_java_6.entity.Authority;
import com.example.asm_java_6.service.AuthorityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Authority> findAuthoritiesOfAdmin() {

        List<Account> accounts = accountRepository.getAdmin();
        return authorityRepository.authorities(accounts);
    }

    @Override
    public List<Authority> findAll() {
        return authorityRepository.findAll();
    }

    @Override
    public Authority create(Authority authority) {
        return authorityRepository.save(authority);
    }

    @Override
    public void delete(Integer id) {
        authorityRepository.deleteById(id);
    }
}
