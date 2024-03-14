package com.florida.cookitback.application.services.impl;

import com.florida.cookitback.application.dto.CategoriaDto;
import com.florida.cookitback.application.mapper.CategoriaMapper;
import com.florida.cookitback.application.services.CategoriaService;
import com.florida.cookitback.domain.entity.Categoria;
import com.florida.cookitback.domain.persistence.CategoriaPersistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaPersistance categoriaPersistance;
    private final CategoriaMapper categoriaMapper;

    @Autowired
    public CategoriaServiceImpl(CategoriaPersistance categoriaPersistance, CategoriaMapper categoriaMapper) {
        this.categoriaPersistance = categoriaPersistance;
        this.categoriaMapper = categoriaMapper;
    }

    @Override
    public List<CategoriaDto> getAllCategorias() {
        List<Categoria> categorias = this.categoriaPersistance.getAllCategorias();
        return categoriaMapper.toDto(categorias);
    }

    @Override
    public Optional<CategoriaDto> getCategoriaById(Long categoriaId) {
        return  this.categoriaPersistance.getCategoriaById(categoriaId).map(categoriaMapper::toDto);

    }

    @Override
    public CategoriaDto saveCategoria(CategoriaDto categoriaDto) {
        Categoria categoria = this.categoriaPersistance.saveCategoria(this.categoriaMapper.toEntity((categoriaDto)));
        return this.categoriaMapper.toDto(categoria);
    }

    @Override
    public void deleteCategoria(Long categoriaId) {
        this.categoriaPersistance.deleteCategoria(categoriaId);
    }
}
