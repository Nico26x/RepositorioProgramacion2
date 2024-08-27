package co.edu.uniquindio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //Se debe crear un cliente
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String dni = JOptionPane.showInputDialog("Ingrese su DNI: ");
        Cliente cliente = new Cliente(nombre, dni, 0);

        //Pedir los datos al usuario por medio de JOption
        String numeroHabitacionString = JOptionPane.showInputDialog("Ingrese el número de la habitación: ");
        int numero = Integer.parseInt(numeroHabitacionString);

        //Selección del tipo de habitación utilizando un inputDialog
        String[] opcionesTipoHabitacion = {"SIMPLE", "DOBLE", "SUITE"};
        String tipoHabitacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Qué tipo de habitación desea? :", "Tipo Habitación", JOptionPane.QUESTION_MESSAGE, null, opcionesTipoHabitacion, opcionesTipoHabitacion[0]);

        TipoHabitacion tipoHabitacion = TipoHabitacion.valueOf(tipoHabitacionSeleccionada);

        Habitacion habitacion = new Habitacion(numero, tipoHabitacion) { };

        //Pedirle al usuario que ingrese la fecha de entrada y la fecha de salida
        String fechaEntradaString = JOptionPane.showInputDialog("Ingrese la fecha de entrada; ");
        String fechaSalidaString = JOptionPane.showInputDialog("Ingrese la fecha de salida: ");

        //Covertimos las fechas, esta clase se utiliza para poder convertir a texto y covertir a objetos
        //de tipo "LocalDate", "LocalDateTime"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaEntrada = LocalDate.parse(fechaEntradaString, formatter);
        LocalDate fechaSalida = LocalDate.parse(fechaSalidaString, formatter);

        //Realizar o crear la reserva
        Reserva reserva = cliente.reservarHabitacion(habitacion, fechaEntrada, fechaSalida);
       
        //Por medio del metodo "calcularTotalPagar" se calcula el total a pagar
        double totalAPagar = habitacion.calcularTotalPagar(fechaEntrada, fechaSalida);


        //Por ultimo se le muestra al usuario la confirmacion de la reserva
        JOptionPane.showMessageDialog(null, "Su reserva ha sido realizada con exito: \n" + reserva + "\n" + "Número de la habitación: \n" + habitacion.getNumero() + "\n" + "Tipo de habitación: " + habitacion.getTipoHabitacion() + "\n" 
                                        + "Total a pagar: " + totalAPagar + "\n" + "Fecha de entrada: " + fechaEntrada + "\n" + "Fecha de salida: " 
                                        + fechaSalida + "\n" + "Nombre del cliente: " + cliente.getNombre() + "\n" + "DNI del cliente: " + cliente.getDni());
                            
           
    }
        
       
       
}
