package com.florida.cookitback.application.mapper;

import java.util.List;

public interface EntidadMapper<D, E>{
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntity(List<D> dtoList);
    List<D> toDto(List<E> entityList);
}