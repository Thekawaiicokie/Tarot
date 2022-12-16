package com.example.evaluacion4charlottegabriel.Dao;

public class Carta {

    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }


    private String descripcion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Carta() {

    }
    public Carta(String titulo, String descripcion){
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
}
