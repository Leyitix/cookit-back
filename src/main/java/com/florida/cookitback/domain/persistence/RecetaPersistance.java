package com.florida.cookitback.domain.persistence;

import com.florida.cookitback.domain.entity.Receta;

import java.util.List;
import java.util.Optional;

public interface RecetaPersistance {
    List<Receta> getAllRecetas();
    List<Receta> getAllRecetasByCategoria(Long categoryId);
    Optional<Receta> getRecetaById(Long recetaId);
    Receta saveReceta(Receta Receta);
    void deleteReceta(Long RecetaId);
}
