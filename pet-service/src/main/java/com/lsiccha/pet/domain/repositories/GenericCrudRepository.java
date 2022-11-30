package com.lsiccha.pet.domain.repositories;

import java.util.List;

public interface GenericCrudRepository<T, U> {

    T save(T entity);
    List<T> getAll();
    T getById(U id);
//    T update(T entity);
    void deleteById(U id);
}
