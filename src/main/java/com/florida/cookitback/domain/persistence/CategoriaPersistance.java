package com.florida.cookitback.domain.persistence;

import com.florida.cookitback.domain.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaPersistance {
    List<Categoria> getAllCategorias();
    Optional<Categoria> getCategoriaById(Long CategoriaId);
    Categoria saveCategoria(Categoria Categoria);
    void deleteCategoria(Long CategoriaId);
}
