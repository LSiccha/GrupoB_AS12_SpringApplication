package com.lsiccha.pet.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.lsiccha.pet.domain.models.Usuario} entity
 */
@Data
public class UsuarioDto implements Serializable {
    private final Long id;
    private final String email;
}