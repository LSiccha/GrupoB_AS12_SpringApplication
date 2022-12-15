package com.microservices.pet.application.controllers.contracts;

import com.microservices.pet.domain.models.dto.MascotaDto;
import com.microservices.pet.domain.models.entities.Voluntario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface VoluntarioController {
    @PostMapping
    ResponseEntity<Voluntario> create(@RequestBody Voluntario voluntario);

    @GetMapping
    ResponseEntity<List<Voluntario>> getAll();

    @GetMapping(path = "/{id}")
    ResponseEntity<Voluntario> getOne(@PathVariable("id") Long id);

    @PutMapping()
    ResponseEntity<Voluntario> update(@RequestBody Voluntario voluntario);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
}
