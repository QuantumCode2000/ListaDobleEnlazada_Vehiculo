class Vehiculo {
    String placa, marca;
    int modelo;

    public Vehiculo() {
        placa = null;
        marca = null;
        modelo = 0;
    }

    public void leer() {
        System.out.print("placa=");
        placa = Leer.dato();
        System.out.print("marca=");
        marca = Leer.dato();
        System.out.print("modelo=");
        modelo = Leer.datoInt();
    }

    public void mostrar() {
        System.out.print("placa=" + placa + "\n marca=" + marca + "\n modelo=" + modelo);
    }
}
