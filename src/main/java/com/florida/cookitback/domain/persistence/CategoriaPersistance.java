package com.florida.cookitback.domain.persistence;

import com.florida.cookitback.domain.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaPersistance {
    List<Categoria> getAllCategorias();
    Optional<Categoria> getCategoriaById(Long categoriaId);
    Categoria saveCategoria(Categoria categoria);
    void deleteCategoria(Long categoriaId);
}
