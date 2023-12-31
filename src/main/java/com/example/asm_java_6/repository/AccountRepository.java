package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    @Query("select distinct a.account from Authority a where a.role.id in ('DIRE','STAF')")
    List<Account> getAdmin();

    @Query("SELECT acc FROM Account acc WHERE acc.username = :user")
    public Account getAccount(@Param("user") String username);
}