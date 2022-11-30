package com.lsiccha.pet.domain.services;

import com.lsiccha.pet.domain.models.dto.AdoptanteDto;
import com.lsiccha.pet.domain.models.dto.FavoritoDto;

import java.util.List;

public interface AdoptanteService {

    List<AdoptanteDto> getAllAdoptantes();
    AdoptanteDto getAdoptanteById(Long id);
    FavoritoDto createFavorito(FavoritoDto favoritoDto);

    List<FavoritoDto> getFavoritosByAdoptanteId(Long id);
    void deleteFavoritoById(Long id);

}
