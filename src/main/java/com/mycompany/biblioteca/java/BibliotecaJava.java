package com.mycompany.biblioteca.java;

public class BibliotecaJava {
    public static void main(String[] args) {
    
        // TODO: Aquí va el código que inicializa tu aplicación.
        
        Libro libro = new Libro("La vida del bicho", 2023, "Santiago Roa", 500);
        Revista revista = new Revista ("Su publicación", 2023, 45, "La historia del bicho");

        // Mostrar información del libro y la revista
        System.out.println("Información del Libro:");
        libro.mostrarInfo();

        System.out.println("\nInformación de la Revista:");
        revista.mostrarInfo();
    }
    
}
