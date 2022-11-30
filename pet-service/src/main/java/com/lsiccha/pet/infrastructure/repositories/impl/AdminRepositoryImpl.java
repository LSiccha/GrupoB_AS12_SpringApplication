package com.lsiccha.pet.infrastructure.repositories.impl;

import com.lsiccha.pet.domain.models.Admin;
import com.lsiccha.pet.domain.repositories.AdminRepository;
import com.lsiccha.pet.infrastructure.repositories.jpa.AdminJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class AdminRepositoryImpl implements AdminRepository {

    private AdminJpaRepository adminJpaRepository;

    @Override
    public Admin save(Admin entity) {
        return this.adminJpaRepository.save(entity);
    }

    @Override
    public List<Admin> getAll() {
        return this.adminJpaRepository.findAll();
    }

    @Override
    public Admin getById(Long id) {
        return this.adminJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO HAY XD " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.adminJpaRepository.deleteById(id);
    }
}
