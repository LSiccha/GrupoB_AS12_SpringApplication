package com.lsiccha.pet.infrastructure.repositories.jpa;

import com.lsiccha.pet.domain.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {
}
