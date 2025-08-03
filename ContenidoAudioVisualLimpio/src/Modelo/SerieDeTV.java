package Modelo;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracion, String genero) {
        super(titulo, duracion, genero);
    }

    public void agregarTemporada(Temporada temp) {
        temporadas.add(temp);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo());
        temporadas.forEach(Temporada::mostrarDetalles);
    }

    @Override
    public String toCSV() {
        return "Serie," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero();
    }
}