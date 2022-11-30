package com.lsiccha.pet.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "adoptante")
public class Adoptante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "usuario_id",
            foreignKey = @ForeignKey(name = "FK_adoptante_usuario")
    )
    private Usuario usuario;

    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaRegistro;

}
