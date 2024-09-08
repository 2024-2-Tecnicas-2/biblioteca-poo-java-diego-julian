package com.mycompany.biblioteca.java;

public class Publicacion {
    // TODO: Aquí va el código de tu clase

    String titulo;
    int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anio);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

}
