package com.microservices.pet.domain.services;

import com.microservices.pet.domain.models.entities.Solicitud;

import java.util.List;

public interface SolicitudService {
    Solicitud createSolicitud(Solicitud solicitud);
    List<Solicitud> getALl();
    Solicitud getOne(Long id);

}