package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Account;
import com.example.asm_java_6.entity.Authority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
    @Query("SELECT DISTINCT a from  Authority a where a.account in ?1")
    List<Authority> authorities(List<Account> accounts);
}