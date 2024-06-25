package com.db.msApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.msApp.models.Role;
import com.db.msApp.repositories.RoleRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Role getMethodName(@PathVariable String id) {
        return roleRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Role createRol(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @PutMapping("/{id}")
    public Role updatRole(@PathVariable String id, @RequestBody Role role) {
        role.setId(id);
        return roleRepository.save(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable String id) {
        roleRepository.deleteById(id);
    }
}
