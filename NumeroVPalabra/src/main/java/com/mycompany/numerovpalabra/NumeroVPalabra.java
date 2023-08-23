
package com.mycompany.numerovpalabra;
import javax.swing.JOptionPane;
public class NumeroVPalabra {

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        int numeroV =Integer.parseInt( JOptionPane.showInputDialog("Ingrese el numero de veces: "));
        
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numeroV; i++) {
            resultado.append(palabra).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
        
    }
}
