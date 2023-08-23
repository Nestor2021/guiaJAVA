
package com.mycompany.areavolumen;
import javax.swing.JOptionPane;
public class AreaVolumen {

    public static void main(String[] args) {
        double radio =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el radio : "));
        double area =Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        JOptionPane.showMessageDialog (null,"El área de la circunferencia es: " + area + "\n"
                + "El volumen de la esfera con ese radio es: " + volumen ,"Resultado",JOptionPane.PLAIN_MESSAGE );
        
    }
}
