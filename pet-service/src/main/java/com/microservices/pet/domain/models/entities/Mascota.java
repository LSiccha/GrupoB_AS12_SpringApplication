package com.microservices.pet.domain.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "raza")
    private String raza;

    @Column(name = "tamanio")
    private String tamanio;

    @Column(name = "adoptada")
    private Boolean adoptada;

    @JsonIgnore
    @OneToMany(
            mappedBy = "mascota",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Solicitud> solicitudes;
}
