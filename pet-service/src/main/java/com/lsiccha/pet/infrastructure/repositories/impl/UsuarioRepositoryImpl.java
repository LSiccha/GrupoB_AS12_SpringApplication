package com.lsiccha.pet.infrastructure.repositories.impl;

import com.lsiccha.pet.domain.models.Usuario;
import com.lsiccha.pet.domain.repositories.UsuarioRepository;
import com.lsiccha.pet.infrastructure.repositories.jpa.UsuarioJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private UsuarioJpaRepository usuarioJpaRepository;

    @Override
    public Usuario save(Usuario entity) {
        return this.usuarioJpaRepository.save(entity);
    }

    @Override
    public List<Usuario> getAll() {
        return this.usuarioJpaRepository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return this.usuarioJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.usuarioJpaRepository.deleteById(id);
    }
}
