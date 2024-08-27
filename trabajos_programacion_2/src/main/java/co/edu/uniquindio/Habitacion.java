package co.edu.uniquindio;

public  abstract class Habitacion {

    private final int numero;
    private final double precio;
    
    public Habitacion(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

}
