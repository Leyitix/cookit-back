package com.florida.cookitback.application.mapper;

import com.florida.cookitback.application.dto.RecetaDto;
import com.florida.cookitback.domain.entity.Receta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CategoriaMapper.class)
public interface RecetaMapper extends EntidadMapper<RecetaDto, Receta> {
    // mapeamos los valores de nombre e id de la categoria al dto de receta
    // de esta forma podemos relacionar ambas tablas

    @Override
    @Mapping(source = "categoriaId", target = "categoria")
    Receta toEntity(RecetaDto dto);

    @Override
    @Mapping(source = "categoria.id", target = "categoriaId")
    @Mapping(source = "categoria.nombre", target = "categoriaNombre")
    RecetaDto toDto(Receta receta);


}