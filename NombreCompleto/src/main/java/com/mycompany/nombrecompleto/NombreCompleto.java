
package com.mycompany.nombrecompleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class NombreCompleto {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        
        LocalDate fechaActual = LocalDate.now();
        String fechaFormateada = fechaActual.format(DateTimeFormatter.ofPattern("d LLLL yyyy"));

        JOptionPane.showMessageDialog (null,"Su nombre es: " + nombre + " " +apellido + " " +fechaFormateada ,"Resultado",JOptionPane.PLAIN_MESSAGE );
    }
}
