package com.lsiccha.pet.infrastructure.repositories.jpa;


import com.lsiccha.pet.domain.models.entities.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptanteJpaRepository extends JpaRepository<Adoptante, Long> {
}
