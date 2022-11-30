package com.lsiccha.pet.infrastructure.repositories.jpa;

import com.lsiccha.pet.domain.models.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoluntarioJpaRepository extends JpaRepository<Voluntario, Long> {
}
