package test;

import java.util.Arrays;  // Importa Arrays para utilizar asList()

public class Asiento {
    String color;
    int precio;
    int registro;

    public void cambiarColor(String NuevoColor) {
        String[] coloresPermitidos = { "rojo", "verde", "amarillo", "negro", "blanco" };

        // Verifica si el nuevo color está en los colores permitidos
        if (Arrays.asList(coloresPermitidos).contains(NuevoColor)) {
            this.color = NuevoColor;
        }
    }
}
