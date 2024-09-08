package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    // TODO: Aquí va el código que inicializa tu aplicación.
        String autor;
        int npagina;
    public Libro(String titulo, int anio, String autor,int numeroP) {
        super(titulo, anio);
        this.autor = autor;
        this.npagina = npagina;
 
    }
    
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Numero de páginas: " + npagina );

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpagina() {
        return npagina;
    }

    public void setNpagina(int npagina) {
        this.npagina = npagina;
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
