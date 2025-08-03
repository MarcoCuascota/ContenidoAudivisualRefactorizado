package vista;

import java.util.*;

public class ConsolaVista {
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n1. Listar contenidos\n2. Guardar archivo\n3. Salir");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
