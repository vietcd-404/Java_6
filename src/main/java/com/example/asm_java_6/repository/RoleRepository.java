package com.example.asm_java_6.repository;

import com.example.asm_java_6.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}