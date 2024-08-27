package co.edu.uniquindio;

import java.time.LocalDate;

public class Reserva {
    
    private final Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    
    public Reserva(Habitacion habitacion, int i, int j) {
        this.habitacion = habitacion;
        this.fechaEntrada = i;
        this.fechaSalida = j;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
