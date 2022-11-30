package com.lsiccha.pet.infrastructure.repositories.impl;

import com.lsiccha.pet.domain.models.Mascota;
import com.lsiccha.pet.domain.repositories.MascotaRepository;
import com.lsiccha.pet.infrastructure.repositories.jpa.MascotaJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class MascotaRepositoryImpl implements MascotaRepository {

    MascotaJpaRepository mascotaJpaRepository;

    @Override
    public Mascota save(Mascota entity) {
        return this.mascotaJpaRepository.save(entity);
    }

    @Override
    public List<Mascota> getAll() {
        return this.mascotaJpaRepository.findAll();
    }

    @Override
    public Mascota getById(Long id) {
        return this.mascotaJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.mascotaJpaRepository.deleteById(id);
    }
}
