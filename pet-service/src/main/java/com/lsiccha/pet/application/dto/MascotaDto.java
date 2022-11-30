package com.lsiccha.pet.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.lsiccha.pet.domain.models.Mascota} entity
 */
@Data
public class MascotaDto implements Serializable {
    private Long id;
    private String nombres;
    private String raza;
    private String tamanio;
    private Boolean adoptada;
}