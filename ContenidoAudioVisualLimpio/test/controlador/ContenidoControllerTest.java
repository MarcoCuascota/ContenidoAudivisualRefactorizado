package controlador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.util.List;

public class ContenidoControllerTest {
    private ContenidoController controller;

    @BeforeEach
    public void setUp() {
        controller = new ContenidoController();
    }

    @Test
    public void testAgregarPelicula() {
        controller.agregarContenido(new Pelicula("Inception", 148, "Ciencia Ficción", "Nolan"));
        List<ContenidoAudiovisual> lista = controller.getListaContenidos();
        assertEquals(1, lista.size());
        assertTrue(lista.get(0) instanceof Pelicula);
    }

    @Test
    public void testGuardarYCargarContenido() {
        controller.agregarContenido(new Pelicula("Tenet", 150, "Acción", "Nolan"));
        controller.guardarCSV("test_contenidos.csv");

        ContenidoController nuevoController = new ContenidoController();
        nuevoController.cargarCSV("test_contenidos.csv");

        assertFalse(nuevoController.getListaContenidos().isEmpty());
    }
}
