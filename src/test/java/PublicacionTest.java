import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
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
    void testPublicacionAtributos() {
        Publicacion pub = new Publicacion("Publicacion 1", 2000);
        assertEquals("Publicacion 1", pub.getTitulo());
        assertEquals(2000, pub.getAnio());
    }

    @Test
    void testPublicacionMostrarInfo() {
        Publicacion pub = new Publicacion("Publicacion 2", 2010);
        assertEquals("Título: Publicacion 2\nAño de Publicación: 2010", pub.mostrarInfo());
    }
}
