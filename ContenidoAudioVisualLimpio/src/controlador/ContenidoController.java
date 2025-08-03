package controlador;

import vista.ConsolaVista;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Actor;
import Modelo.ContenidoAudiovisual;
import Modelo.Documental;
import Modelo.Investigador;
import Modelo.Pelicula;
import Modelo.SerieDeTV;
import Modelo.Temporada;

public class ContenidoController {
    private final List<ContenidoAudiovisual> contenidos = new ArrayList<>();
    private final ConsolaVista vista = new ConsolaVista();

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch(opcion) {
                case 1 -> mostrarContenidos();
                case 2 -> guardarArchivo();
            }
        } while(opcion != 3);
    }

    private void mostrarContenidos() {
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }

    private void guardarArchivo() {
        try (PrintWriter pw = new PrintWriter("contenidos.csv")) {
            for (ContenidoAudiovisual c : contenidos) {
                pw.println(c.toCSV());
            }
            vista.mostrarMensaje("Archivo guardado correctamente.");
        } catch (IOException e) {
            vista.mostrarMensaje("Error al guardar archivo: " + e.getMessage());
        }
    }

    public void cargarEjemplos() {
        Pelicula peli = new Pelicula("Inception", 148, "Sci-Fi", "Christopher Nolan");
        peli.agregarActor(new Actor("Leonardo DiCaprio", 49));

        SerieDeTV serie = new SerieDeTV("Stranger Things", 45, "Drama");
        serie.agregarTemporada(new Temporada(1, 8));

        Documental doc = new Documental("Planeta Tierra", 50, "Naturaleza", "Ecosistemas", "Biología");
        doc.agregarInvestigador(new Investigador("Jane Goodall", "Primatología"));

        contenidos.addAll(List.of(peli, serie, doc));
    }
}
