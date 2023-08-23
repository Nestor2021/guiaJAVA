

package com.mycompany.operacionesbasicas;
import javax.swing.JOptionPane;
public class OperacionesBasicas {

    public static void main(String[] args) {
        double numero1 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el primer numero: "));
        double numero2 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        String divicion;
        if(numero2 ==0){
            divicion = ("No se puede dividir");
        }else{
            divicion = String.valueOf(numero1 / numero2);
        }
        JOptionPane.showMessageDialog (null,"La suma de " + numero1 + " + " + numero2 + " es => "+suma + "\n"
                + "La resta de " + numero1 + " - " + numero2 + " es => " + resta +"\n"
                + "La multiplicacion de " + numero1 + " * " + numero2 + " es => " + multiplicacion +"\n"
                + "La divicion de " + numero1 + " / " + numero2 + " es => " + divicion +"\n"
                ,"Resultado",JOptionPane.PLAIN_MESSAGE );
         
        
        
    }
}
