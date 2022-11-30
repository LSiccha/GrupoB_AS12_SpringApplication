package com.lsiccha.pet.application.controllers.contracts;

import com.lsiccha.pet.domain.models.PerfilAdoptante;
import com.lsiccha.pet.domain.models.Solicitud;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface AdoptanteController {

    @GetMapping
    ResponseEntity<List<Solicitud>> getAll();

    @GetMapping(path = "/{id}")
    ResponseEntity<Solicitud> getOne(@PathVariable("id") Long id);

    @PostMapping(path = "/perfil")
    ResponseEntity<PerfilAdoptante> createPerfil(@RequestBody PerfilAdoptante perfilAdoptante);

    @GetMapping(path = "/perfil/{adoptanteId}")
    ResponseEntity<PerfilAdoptante> getPerfil(@PathVariable("adoptanteId") Long id);

    @PutMapping(path = "/perfil")
    ResponseEntity<PerfilAdoptante> updatePerfil(@RequestBody PerfilAdoptante perfilAdoptante);

}
