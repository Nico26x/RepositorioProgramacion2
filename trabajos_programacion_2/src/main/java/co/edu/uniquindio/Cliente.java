package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.Collection;

public class Cliente {
    
    private final Collection<Reserva> reservas;
    private final String nombre;
    private final String dni;
    private final int reservasActivas;
    
    public Cliente(String nombre, String dni, int reservasActivas) {
    
        this.reservas = null;
        this.nombre = nombre;
        this.dni = dni;
        this.reservasActivas = reservasActivas;
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

    public Reserva reservarHabitacion(Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida){

        var reserva = new Reserva(new Simple(26, 150000.0), LocalDate.of(2024, 5, 28), LocalDate.of(2024, 5, 31));

        System.out.println("Reserva realizada con éxito: " + reserva.toString());
        return reserva;

    }

    
}
