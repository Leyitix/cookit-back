package com.florida.cookitback.application.services.impl;

import com.florida.cookitback.application.dto.RecetaDto;
import com.florida.cookitback.application.mapper.RecetaMapper;
import com.florida.cookitback.application.services.RecetaService;
import com.florida.cookitback.domain.entity.Receta;
import com.florida.cookitback.domain.persistence.RecetaPersistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaServiceImpl implements RecetaService {
    private final RecetaPersistance recetaPersistance;
    private final RecetaMapper recetaMapper;

    @Autowired
    public RecetaServiceImpl(RecetaPersistance recetaPersistance, RecetaMapper recetaMapper) {
        this.recetaPersistance = recetaPersistance;
        this.recetaMapper = recetaMapper;
    }

    @Override
    public List<RecetaDto> getAllRecetas() {
        List<Receta> recetas = this.recetaPersistance.getAllRecetas();
        return this.recetaMapper.toDto(recetas);
    }

    @Override
    public List<RecetaDto> getAllRecetasByCategoria(Long categoryId) {
        List<Receta> recetas = this.recetaPersistance.getAllRecetasByCategoria(categoryId);
        return this.recetaMapper.toDto(recetas);

    }

    @Override
    public Optional<RecetaDto> getRecetaById(Long recetaId) {
        return this.recetaPersistance.getRecetaById(recetaId).map(recetaMapper::toDto);
    }

    @Override
    public RecetaDto saveReceta(RecetaDto recetaDto) {
        Receta recetaSaved = this.recetaPersistance.saveReceta(this.recetaMapper.toEntity(recetaDto));
        return this.recetaMapper.toDto(recetaSaved);
    }

    @Override
    public void deleteReceta(Long recetaId) {
        this.recetaPersistance.getRecetaById(recetaId);
    }
}
