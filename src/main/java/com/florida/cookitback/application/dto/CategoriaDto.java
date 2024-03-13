package com.florida.cookitback.application.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class CategoriaDto implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;
    private byte[] imagen;

    public CategoriaDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
