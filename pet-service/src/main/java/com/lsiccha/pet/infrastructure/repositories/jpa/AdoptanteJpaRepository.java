package com.lsiccha.pet.infrastructure.repositories.jpa;


import com.lsiccha.pet.domain.models.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptanteJpaRepository extends JpaRepository<Adoptante, Long> {
}
