package Modelo;


public class Temporada {
    private int numero;
    private int capitulos;

    public Temporada(int numero, int capitulos) {
        this.numero = numero;
        this.capitulos = capitulos;
    }

    public void mostrarDetalles() {
        System.out.println("Temporada " + numero + " con " + capitulos + " capítulos.");
    }
}