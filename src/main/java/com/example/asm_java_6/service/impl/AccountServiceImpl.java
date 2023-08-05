package com.example.asm_java_6.service.impl;

import com.example.asm_java_6.repository.AccountRepository;
import com.example.asm_java_6.entity.Account;
import com.example.asm_java_6.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findById(String username) {
        return this.accountRepository.getAccount(username);
    }

    @Override
    public List<Account> getAdmin() {
        return this.accountRepository.getAdmin();
    }

    @Override
    public List<Account> findAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account create(Account acc) {
        return this.accountRepository.save(acc);
    }

    @Override
    public Account update(Account acc) {
        return this.accountRepository.save(acc);
    }

    @Override
    public void delete(Account acc) {
        this.accountRepository.delete(acc);
    }
}
