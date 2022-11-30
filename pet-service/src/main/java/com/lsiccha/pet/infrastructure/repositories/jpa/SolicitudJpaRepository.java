package com.lsiccha.pet.infrastructure.repositories.jpa;


import com.lsiccha.pet.domain.models.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudJpaRepository extends JpaRepository<Solicitud, Long> {
    List<Solicitud> getSolicitudByAceptada(Boolean isAccepted);
}
