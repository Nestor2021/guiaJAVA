
package com.mycompany.perimetroarea;
import javax.swing.JOptionPane;
public class PerimetroArea {

    public static void main(String[] args) {
        double base =Double.parseDouble( JOptionPane.showInputDialog("Ingresa la base del rectangulo: "));
        double altura =Double.parseDouble( JOptionPane.showInputDialog("Ingresa la altura del rectangulo"));
        
        double area = base *  altura;
        double perimetro = 2 * (base + altura);
        
        JOptionPane.showMessageDialog (null,"El area del rectangulo es: " + area + "\n"
                + "El perimetro es: " + perimetro,"Resultado",JOptionPane.PLAIN_MESSAGE );
        
    }
}
