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
    // TODO: Aquí va el código que inicializa tu aplicación.
}
