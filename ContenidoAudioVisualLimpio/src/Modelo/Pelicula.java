package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Película: " + getTitulo());
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        actores.forEach(actor -> System.out.println(" - " + actor));
    }

    @Override
    public String toCSV() {
        return "Pelicula," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + director;
    }
}
