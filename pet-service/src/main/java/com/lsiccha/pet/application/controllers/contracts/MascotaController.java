package com.lsiccha.pet.application.controllers.contracts;

import com.lsiccha.pet.domain.models.Mascota;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MascotaController {

    @PostMapping
    ResponseEntity<Mascota> create(@RequestBody Mascota mascota);

    @GetMapping
    ResponseEntity<List<Mascota>> getAll();

    @GetMapping(path = "/{id}")
    ResponseEntity<Mascota> getOne(@PathVariable("id") Long id);

    @PutMapping()
    ResponseEntity<Mascota> update(@RequestBody Mascota mascota);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

}
