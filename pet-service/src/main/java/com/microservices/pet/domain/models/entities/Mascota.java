package com.microservices.pet.domain.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

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
}
