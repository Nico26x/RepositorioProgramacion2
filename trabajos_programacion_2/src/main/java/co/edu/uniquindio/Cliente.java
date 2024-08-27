package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;



public class Cliente {
    
    private final Collection<Reserva> reservas;
    private final String nombre;
    private final String dni;
    private int reservasActivas;
    
    public Cliente(String nombre, String dni, int reservasActivas) {
    
        this.reservas = new ArrayList<>();
        this.nombre = nombre;
        this.dni = dni;
        this.reservasActivas = 0;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getReservasActivas() {
        return reservasActivas;
    }

    public Reserva reservarHabitacion(Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida ){

        Reserva reserva = new Reserva(habitacion, fechaEntrada, fechaSalida);
        reservas.add(reserva);
        reservasActivas++;

        return reserva;
    }
}


    

