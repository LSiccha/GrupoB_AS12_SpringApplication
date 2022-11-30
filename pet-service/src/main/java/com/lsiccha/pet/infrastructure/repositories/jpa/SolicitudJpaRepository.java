package com.lsiccha.pet.infrastructure.repositories.jpa;


import com.lsiccha.pet.domain.models.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudJpaRepository extends JpaRepository<Solicitud, Long> {
}
