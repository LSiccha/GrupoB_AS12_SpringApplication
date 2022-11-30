package com.lsiccha.pet.domain.mappers;

import com.lsiccha.pet.domain.models.dto.FavoritoDto;
import com.lsiccha.pet.domain.models.entities.Favorito;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FavoritoMapper {

    FavoritoMapper INSTANCE = Mappers.getMapper(FavoritoMapper.class);

    FavoritoDto favoritoToFavoritoDto(Favorito favorito);
    Favorito favoritoDtoToFavorito(FavoritoDto favoritoDto);
}
