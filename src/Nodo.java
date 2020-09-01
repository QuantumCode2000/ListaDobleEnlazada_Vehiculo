public class Nodo { // Campos
    Vehiculo dato;
    Nodo ant, sig;

    // Constructor por defecto
    public Nodo() {
        dato = null;
        sig = null;
        ant = null;
    }

    // Constructor ordinario
    public Nodo(Vehiculo vd) {
        dato = vd;
        sig = null;
        ant = null;
    }
}
