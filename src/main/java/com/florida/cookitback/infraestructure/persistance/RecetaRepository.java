package com.florida.cookitback.infraestructure.persistance;

import com.florida.cookitback.domain.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
    List<Receta> findAllByCategoriaId(Long categoriaId);
}
