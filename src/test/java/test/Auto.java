package test;

public class Auto {
    String modelo;         
    int precio;
    Asiento[] asientos;
    String marca;           
    Motor motor;            
    int registro;
    static String cantidadCreados;

    public int cantidadAsientos() {
        return asientos.length; // Retorna el tamaño del arreglo de asientos
    }

    public String verificarIntegridad() {
        // Recorre cada asiento del array asientos
        for (Asiento asiento : asientos) {
            // Verifica que todos los registros sean iguales
            if (asiento.registro != this.registro || asiento.registro != motor.registro) {
                return "Las piezas no son originales";
            }
        }
        // Verifica que el registro del Auto y Motor sean iguales
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}