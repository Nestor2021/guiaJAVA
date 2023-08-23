
package com.mycompany.numeromayor;
import javax.swing.JOptionPane;
public class NumeroMayor {

    public static void main(String[] args) {
        double numero1 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el primer numero: "));
        double numero2 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        double numero3 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el tercer numero: "));
        
        double numeroMayor = Math.max(numero1, Math.max(numero2, numero3));
        
        JOptionPane.showMessageDialog (null,"El numero mayor es: " + numeroMayor ,"Resultado",JOptionPane.PLAIN_MESSAGE );
    }
}
