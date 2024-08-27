package co.edu.uniquindio;

public abstract class Habitacion {

    private final int numero;
    private final double precio;
    
    /**
     * Método constructor de la clase abstracta Habitacion
     * 
     * @param numero, el numero de la habitacion
     * @param precio, precio de la habitacion
     */
    public Habitacion(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

     /**
     * Método para obtener el valor del numero de la habitacion
     * 
     * @return valor del numero de la habitacion
     */
    public int getNumero() {
        return numero;
    }

     /**
     * Método para obtener el valor del precio de la habitacion
     * 
     * @return valor del precio de la habitacion
     */
    public double getPrecio() {
        return precio;
    }

}
