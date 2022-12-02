package com.microservices.pet.domain.services.impl;

import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.services.SolicitudService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SolicitudServiceImpl implements SolicitudService {
    @Override
    public Solicitud createSolicitud(Solicitud solicitud) {
        return null;
    }

    @Override
    public List<Solicitud> getALl() {
        return null;
    }

    @Override
    public Solicitud getOne(Long id) {
        return null;
    }
}
