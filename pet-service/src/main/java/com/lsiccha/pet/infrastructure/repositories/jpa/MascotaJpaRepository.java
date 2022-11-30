package com.lsiccha.pet.infrastructure.repositories.jpa;

import com.lsiccha.pet.domain.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaJpaRepository extends JpaRepository<Mascota, Long> {
}
