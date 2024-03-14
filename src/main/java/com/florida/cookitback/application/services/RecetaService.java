package com.florida.cookitback.application.services;

import com.florida.cookitback.application.dto.RecetaDto;

import java.util.List;
import java.util.Optional;

public interface RecetaService {
    List<RecetaDto> getAllRecetas();
    List<RecetaDto> getAllRecetasByCategoria(Long categoryId);
    Optional<RecetaDto> getRecetaById(Long recetaId);
    RecetaDto saveReceta(RecetaDto Receta);
    void deleteReceta(Long RecetaId);
}
