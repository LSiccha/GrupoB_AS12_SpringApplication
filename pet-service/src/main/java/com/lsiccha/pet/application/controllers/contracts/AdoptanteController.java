package com.lsiccha.pet.application.controllers.contracts;

import com.lsiccha.pet.domain.models.dto.AdoptanteDto;
import com.lsiccha.pet.domain.models.dto.FavoritoDto;
import com.lsiccha.pet.domain.models.entities.Favorito;
import com.lsiccha.pet.domain.models.entities.PerfilAdoptante;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface AdoptanteController {

    // endpoint -> adoptante
    @GetMapping
    ResponseEntity<List<AdoptanteDto>> getAll();

    @GetMapping(path = "/{id}")
    ResponseEntity<AdoptanteDto> getOne(@PathVariable("id") Long id);

    // endpoint -> perfil
    @PostMapping(path = "/perfil")
    ResponseEntity<PerfilAdoptante> createPerfil(@RequestBody PerfilAdoptante perfilAdoptante);

    @GetMapping(path = "/perfil/{adoptanteId}")
    ResponseEntity<PerfilAdoptante> getPerfil(@PathVariable("adoptanteId") Long id);

    @PutMapping(path = "/perfil")
    ResponseEntity<PerfilAdoptante> updatePerfil(@RequestBody PerfilAdoptante perfilAdoptante);

    // endpoint -> favoritos
    @PostMapping(path = "/favoritos")
    ResponseEntity<FavoritoDto> createFavorito(@RequestBody Favorito favorito);

    @GetMapping(path = "/favoritos/{adoptanteId}")
    ResponseEntity<List<FavoritoDto>> getFavoritosByAdoptanteId(@PathVariable("adoptanteId") Long id);

    @GetMapping(path = "/favoritos/{favoritoId}")
    ResponseEntity<List<FavoritoDto>> deleteFavorito(@PathVariable("favoritoId") Long id);

}
