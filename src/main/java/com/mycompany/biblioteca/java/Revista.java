package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {

    int numeroRevista;
    String nombreRevista;

    public Revista(String nombreRevista, String titulo, int anio, int numeroRevista) {
        super(titulo, anio);
        this.nombreRevista = nombreRevista;
        this.numeroRevista = numeroRevista;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de revista: "+ numeroRevista);
        System.out.println("Nombre de revista: "+ nombreRevista);

    }
}


