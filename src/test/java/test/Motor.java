package test;

public class Motor {
    int numeroCilindros;  // Corregido: 'cilinbros' a 'cilindros'
    String tipo;
    int registro;

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;  // Asigna el nuevo número de registro
    }

    public void asignarTipo(String nuevoTipo) {
        // Verifica que el tipo solo pueda ser eléctrico o gasolina
        if (nuevoTipo.equals("eléctrico") || nuevoTipo.equals("gasolina")) {
            this.tipo = nuevoTipo;  // Cambia el tipo de motor si es válido
        } else {
            System.out.println("Tipo de motor no válido. Solo se aceptan 'eléctrico' o 'gasolina'.");
        }
    }
}
