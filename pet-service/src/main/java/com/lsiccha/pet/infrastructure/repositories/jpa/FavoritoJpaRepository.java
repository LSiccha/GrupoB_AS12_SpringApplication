package com.lsiccha.pet.infrastructure.repositories.jpa;

import com.lsiccha.pet.domain.models.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoJpaRepository extends JpaRepository<Favorito, Long> {
}
