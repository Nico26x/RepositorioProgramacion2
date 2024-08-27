package co.edu.uniquindio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        var cliente = new Cliente("Nicolas", "1090273004", 1);
        

        cliente.reservarHabitacion(new Simple(26, 150000.0), LocalDate.of(2024, 5, 28), LocalDate.of(2024, 5, 31));
        
        

    }
}