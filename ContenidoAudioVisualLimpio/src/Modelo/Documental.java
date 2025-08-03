package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private String campoInvestigacion;
    private List<Investigador> investigadores = new ArrayList<>();

    public Documental(String titulo, int duracion, String genero, String tema, String campoInvestigacion) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.campoInvestigacion = campoInvestigacion;
    }

    public void agregarInvestigador(Investigador inv) {
        investigadores.add(inv);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo());
        System.out.println("Tema: " + tema);
        System.out.println("Campo de investigación: " + campoInvestigacion);
        investigadores.forEach(inv -> System.out.println(" - " + inv));
    }

    @Override
    public String toCSV() {
        return "Documental," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema + "," + campoInvestigacion;
    }
}
