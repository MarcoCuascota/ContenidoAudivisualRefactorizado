package app;

import controlador.ContenidoController;

public class Main {
    public static void main(String[] args) {
        ContenidoController controlador = new ContenidoController();
        controlador.cargarEjemplos();
        controlador.iniciar();
    }
}
