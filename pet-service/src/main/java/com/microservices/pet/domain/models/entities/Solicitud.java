package com.microservices.pet.domain.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "solicitud")
public class Solicitud {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
//            (
////            cascade = CascadeType.ALL
//    )
    @JoinColumn(
            name = "mascota_id",
            foreignKey = @ForeignKey(name = "FK_solicitud_mascota")
    )
    public Mascota mascota;

    @ManyToOne
    @JoinColumn(
            name = "adoptante_id",
            foreignKey = @ForeignKey(name = "FK_solicitud_adoptante")
    )
    private Adoptante adoptante;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "fecha_solicitud")
    private LocalDate fechaSolicitud;

    @Column(name = "aceptada")
    private Boolean aceptada;

    @Column(name = "en_espera")
    private Boolean enEspera;

    @Column(name = "mensaje")
    private String mensaje;

}
