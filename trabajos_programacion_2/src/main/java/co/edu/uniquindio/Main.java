package co.edu.uniquindio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        var cliente = new Cliente("Nicolas", "1090273004", 1);
        LocalDate fechaEntrada = LocalDate.of(2024, 9, 10);
        LocalDate fechaSalida = LocalDate.of(2024, 11, 10);

        cliente.reservarHabitacion(26);
        
        System.out.println("Hello world!");

    }
}