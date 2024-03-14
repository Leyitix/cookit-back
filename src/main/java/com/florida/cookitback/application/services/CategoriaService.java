package com.florida.cookitback.application.services;

import com.florida.cookitback.application.dto.CategoriaDto;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<CategoriaDto> getAllCategorias();
    Optional<CategoriaDto> getCategoriaById(Long CategoriaId);
    CategoriaDto saveCategoria(CategoriaDto Categoria);
    void deleteCategoria(Long CategoriaId);
}
