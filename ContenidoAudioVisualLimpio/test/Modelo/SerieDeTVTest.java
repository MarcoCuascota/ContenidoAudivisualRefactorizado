package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerieDeTVTest {
    private SerieDeTV serie;

    @BeforeEach
    public void setUp() {
        serie = new SerieDeTV("Breaking Bad", 47, "Drama");
        serie.agregarTemporada(new Temporada(1, 7));
        serie.agregarTemporada(new Temporada(2, 13));
    }

    @Test
    public void testCantidadTemporadas() {
        assertEquals(2, serie.getTemporadas().size());
    }

    @Test
    public void testToCSV() {
        String csv = serie.toCSV();
        assertTrue(csv.contains("SerieDeTV"));
        assertTrue(csv.contains("Temporada 1"));
    }
}
