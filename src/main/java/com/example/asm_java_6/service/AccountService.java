package com.example.asm_java_6.service;



import com.example.asm_java_6.entity.Account;

import java.util.List;

public interface AccountService {
    public Account findById(String username);

    List<Account> getAdmin();

    List<Account> findAll();

    public Account create(Account acc);

    public Account update(Account acc);

    public void delete(Account acc);
}
