package co.edu.uniquindio;

import java.time.LocalDate;

public class Reserva {
    
    private final Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    
    public Reserva(Habitacion habitacion, LocalDate localDate, LocalDate localDate2) {
        this.habitacion = habitacion;
        this.fechaEntrada = localDate;
        this.fechaSalida = localDate2;
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
