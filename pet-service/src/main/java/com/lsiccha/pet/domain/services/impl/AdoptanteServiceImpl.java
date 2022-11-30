package com.lsiccha.pet.domain.services.impl;

import com.lsiccha.pet.domain.models.dto.AdoptanteDto;
import com.lsiccha.pet.domain.models.dto.FavoritoDto;
import com.lsiccha.pet.domain.models.entities.Favorito;
import com.lsiccha.pet.domain.repositories.AdoptanteRepository;
import com.lsiccha.pet.domain.repositories.FavoritoRepository;
import com.lsiccha.pet.domain.repositories.PerfilAdoptanteRepository;
import com.lsiccha.pet.domain.services.AdoptanteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdoptanteServiceImpl implements AdoptanteService {

    private AdoptanteRepository adoptanteRepository;
    private PerfilAdoptanteRepository perfilAdoptanteRepository;
    private FavoritoRepository favoritoRepository;


    @Override
    public List<AdoptanteDto> getAllAdoptantes() {
        return null;
    }

    @Override
    public AdoptanteDto getAdoptanteById(Long id) {
        return null;
    }

    @Override
    public FavoritoDto createFavorito(FavoritoDto favoritoDto) {
        FavoritoDto tosave = favoritoDto;
//        Favorito savedToDb = this.favoritoRepository.save(t);
        return null;
    }

    @Override
    public List<FavoritoDto> getFavoritosByAdoptanteId(Long id) {
        return null;
    }

    @Override
    public void deleteFavoritoById(Long id) {

    }
}
