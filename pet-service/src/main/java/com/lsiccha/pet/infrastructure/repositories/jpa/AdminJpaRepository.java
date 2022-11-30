package com.lsiccha.pet.infrastructure.repositories.jpa;

import com.lsiccha.pet.domain.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Admin, Long> {
}
