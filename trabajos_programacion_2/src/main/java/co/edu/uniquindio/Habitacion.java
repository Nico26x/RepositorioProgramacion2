package co.edu.uniquindio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Habitacion {

    private final int numero;
    private TipoHabitacion tipoHabitacion;
    
    /**
     * Método constructor de la clase abstracta Habitacion
     * 
     * @param numero, el numero de la habitacion
     * @param precio el tipo de habitación
     */
    public Habitacion(int numero, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
    }

     /**
     * Método para obtener el valor del numero de la habitacion
     * 
     * @return valor del numero de la habitacion
     */
    public int getNumero() {
        return numero;
    }
    
    /*
     * Método para otener el tipo de habitación seleccionado
     * @return tipo de habitación seleccionado
     */
    public TipoHabitacion getTipoHabitacion(){
        return tipoHabitacion;
    }

    /*
     * Método encargado de calcular el precio de la reserva, de acuerdo al tipo de habitación
     * 
     * @param tipoHabitacion el tipo de habitación elegida
     */
    public double calcularPrecio(){


        switch (tipoHabitacion){

            case SIMPLE:

                return 100000.0;
                
            case DOBLE: 
                return 170000.0;
                
            case SUITE:

                return 230000.0;
               
            default:

                throw new IllegalArgumentException("El tipo de habitación ingresado NO EXISTE");
        }
       
    }

    /*
     * Método para calcular el total a pagar de acuerdo a la habitacion y los dias de hospedaje
     * @param fechaEntrada la fecha de entrada al hotel
     * @param fechaSalida la fecha de salida del hotel
     */

    public double calcularTotalPagar (LocalDate fechaEntrada, LocalDate fechaSalida){

        long diasHospedaje = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        double precioPorDia = calcularPrecio();

        return diasHospedaje * precioPorDia;


     }

}