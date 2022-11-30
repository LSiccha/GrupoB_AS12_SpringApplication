package com.lsiccha.pet.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.lsiccha.pet.domain.models.Admin} entity
 */
@Data
public class AdminDto implements Serializable {
    private final Long id;
    private final UsuarioDto usuario;
    private final String nombres;
    private final String dni;
}