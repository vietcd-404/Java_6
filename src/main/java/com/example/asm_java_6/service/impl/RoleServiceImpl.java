package com.example.asm_java_6.service.impl;

import com.example.asm_java_6.repository.RoleRepository;
import com.example.asm_java_6.entity.Role;
import com.example.asm_java_6.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
