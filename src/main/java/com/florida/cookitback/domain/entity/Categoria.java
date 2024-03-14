package com.florida.cookitback.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity()
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriaSequence") // generamos el id
    private Long id;

    @Column(length = 100, nullable = false) // no puede ser nulo
    @Size(min = 3, max = 100)
    private String nombre;

    @Column(length = 2000)
    private String descripcion;

    @Lob
    private byte[] imagen;

    public Categoria() {
        // generamos un constructor vacio
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
