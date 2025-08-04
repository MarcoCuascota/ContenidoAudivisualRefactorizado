package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PeliculaTest {
    private Pelicula pelicula;

    @BeforeEach
    public void setUp() {
        pelicula = new Pelicula("Matrix", 136, "Ciencia Ficción", "Lana Wachowski");
    }

    @Test
    public void testGetDirector() {
        assertEquals("Lana Wachowski", pelicula.getDirector());
    }

    @Test
    public void testToCSV() {
        String csv = pelicula.toCSV();
        assertTrue(csv.contains("Pelicula"));
        assertTrue(csv.contains("Lana Wachowski"));
    }
}
