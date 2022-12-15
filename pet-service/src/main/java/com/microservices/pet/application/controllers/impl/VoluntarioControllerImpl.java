package com.microservices.pet.application.controllers.impl;

import com.microservices.pet.application.controllers.contracts.VoluntarioController;
import com.microservices.pet.domain.models.entities.Voluntario;
import com.microservices.pet.domain.repositories.VoluntarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/voluntarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VoluntarioControllerImpl implements VoluntarioController {

    private VoluntarioRepository voluntarioRepository;
    @Override
    public ResponseEntity<Voluntario> create(Voluntario voluntario) {
        Voluntario created = this.voluntarioRepository.save(voluntario);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Voluntario>> getAll() {
        List<Voluntario> fromDb = this.voluntarioRepository.getAll();
        return new ResponseEntity<>(fromDb, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Voluntario> getOne(Long id) {
        Voluntario retrieved = this.voluntarioRepository.getById(id);
        return new ResponseEntity<>(retrieved, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Voluntario> update(Voluntario voluntario) {
        Voluntario created = this.voluntarioRepository.save(voluntario);
        return new ResponseEntity<>(created, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.voluntarioRepository.deleteById(id);
        return null;
    }
}
