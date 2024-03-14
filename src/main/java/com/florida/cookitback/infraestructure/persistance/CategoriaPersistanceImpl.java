package com.florida.cookitback.infraestructure.persistance;

import com.florida.cookitback.domain.entity.Categoria;
import com.florida.cookitback.domain.persistence.CategoriaPersistance;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaPersistanceImpl implements CategoriaPersistance {
    private final CategoriaRepository categoriaRepository;

    public CategoriaPersistanceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    /**
     * Obtenemos todas las categorias
     *
     * @return
     */
    @Override
    public List<Categoria> getAllCategorias() {
        return this.categoriaRepository.findAll();
    }

    /**
     * Obtenemos categoria por id
     *
     * @param categoriaId
     * @return
     */
    @Override
    public Optional<Categoria> getCategoriaById(Long categoriaId) {
        return this.categoriaRepository.findById(categoriaId);
    }

    /**
     * Creamos una categoria nueva
     *
     * @param categoria
     * @return
     */
    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    /**
     * Eliminamos una categoria por id
     *
     * @param categoriaId
     */
    @Override
    public void deleteCategoria(Long categoriaId) {
        this.categoriaRepository.deleteById(categoriaId);
    }
}
