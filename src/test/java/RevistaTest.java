import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {
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
    void testRevistaAtributos() {
        Revista revista = new Revista("Revista 1", 2021, 101, "Nombre Revista 1");
        assertEquals("Revista 1", revista.getTitulo());
        assertEquals(2021, revista.getAnio());
        assertEquals(101, revista.getNumeroRevista());
        assertEquals("Nombre Revista 1", revista.getNombreRevista());
    }

    @Test
    void testRevistaMostrarInfo() {
        Revista revista = new Revista("Revista 2", 2022, 102, "Nombre Revista 2");
        assertEquals("Título: Revista 2\nAño de Publicación: 2022\nNúmero de la Revista: 102\nNombre de la Revista: Nombre Revista 2", revista.mostrarInfo());
    }

}
