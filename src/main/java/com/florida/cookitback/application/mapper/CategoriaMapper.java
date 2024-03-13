package com.florida.cookitback.application.mapper;

import com.florida.cookitback.application.dto.CategoriaDto;
import com.florida.cookitback.domain.entity.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntidadMapper<CategoriaDto, Categoria> {
    default  Categoria fromId(Long id) {
        if (id == null) return  null;

        Categoria categoria = new Categoria();
        categoria.setId(id);
        return categoria;
    }
}
