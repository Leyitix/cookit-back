package com.florida.cookitback.infraestructure.persistance;

import com.florida.cookitback.domain.entity.Receta;
import com.florida.cookitback.domain.persistence.RecetaPersistance;

import java.util.List;
import java.util.Optional;

public class RecetaPersistanceImpl implements RecetaPersistance {
    private final  RecetaRepository recetaRepository;

    public RecetaPersistanceImpl(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    /**
     * Obtenemos todas las recetas
     *
     * @return
     */
    @Override
    public List<Receta> getAllRecetas() {
        return this.recetaRepository.findAll();
    }

    /**
     * Obtenemos todas las recetas por id de categoria
     *
     * @param categoryId
     * @return
     */
    @Override
    public List<Receta> getAllRecetasByCategoria(Long categoryId) {
        return this.recetaRepository.findAllByCategoriaId(categoryId);
    }

    /**
     * Obtenemos receta por id
     *
     * @param recetaId
     * @return
     */
    @Override
    public Optional<Receta> getRecetaById(Long recetaId) {
        return this.recetaRepository.findById(recetaId);
    }

    /**
     * Creamos una receta nueva
     *
     * @param receta
     * @return
     */
    @Override
    public Receta saveReceta(Receta receta) {
        return this.recetaRepository.save(receta);
    }

    /**
     * Eliminamos una receta por id
     *
     * @param recetaId
     */
    @Override
    public void deleteReceta(Long recetaId) {
        this.recetaRepository.deleteById(recetaId);
    }
}
