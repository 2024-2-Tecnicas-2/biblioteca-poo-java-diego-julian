package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {

    int numeroRevista;
    String nombreRevista;

    public Revista(String nombreRevista, int anio, int numeroRevista, String titulo) {
        super(titulo, anio);
        this.nombreRevista = nombreRevista;
        this.numeroRevista = numeroRevista;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de revista: "+ numeroRevista);
        System.out.println("Nombre de revista: "+ nombreRevista);

    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }
    
    
}


