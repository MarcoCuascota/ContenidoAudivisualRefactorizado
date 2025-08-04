package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentalTest {
    private Documental documental;

    @BeforeEach
    public void setUp() {
        documental = new Documental("Planeta Tierra", 50, "Naturaleza", "Ecosistemas", "Biología");
    }

    @Test
    public void testGetTema() {
        assertEquals("Ecosistemas", documental.getTema());
    }

    @Test
    public void testGetCampoInvestigacion() {
        assertEquals("Biología", documental.getCampoInvestigacion());
    }

    @Test
    public void testToCSV() {
        String csv = documental.toCSV();
        assertTrue(csv.contains("Documental"));
        assertTrue(csv.contains("Ecosistemas"));
    }
}
