import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
//    @Test
//    public void testMultiplicarPositivos() {
//        int valorEsperado = 15;
//        CuentaBancaria miCuenta = new CuentaBancaria();
//        int valorActual = miCuenta.multiplicar(3, 5);
//        assertEquals(valorEsperado, valorActual);
//    }
    
     @Test
    void testLibroAtributos() {
        Libro libro = new Libro("Libro 1", 2001, "Autor 1", 300);
        assertEquals("Libro 1", libro.getTitulo());
        assertEquals(2001, libro.getAnio());
        assertEquals("Autor 1", libro.getAutor());
        assertEquals(300, libro.getNpagina());
    }

    @Test
    public void testLibroMostrarInfo() {
        Libro libro = new Libro("Libro 2", 2002, "Autor 2", 400);
        assertEquals("Título: Libro 2\nAño de Publicación: 2002\nAutor: Autor 2\nNúmero de Páginas: 400", libro.mostrarInfo());
    }

}