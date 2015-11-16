
package boletin92;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos92 {
    
    public void calcularSuma(int i, int valorS){
        while (i>=10 & i<=90){
            valorS=i+valorS;
            i++;
        }
        JOptionPane.showMessageDialog(null, "A suma é: "+valorS);
    }
    public void calcularProducto(int i, double valorP){
        while (i>=10 & i<=90){
            valorP=i*valorP;
            i++;
        }
        JOptionPane.showMessageDialog(null, "O producto é: "+valorP);
    }
       
}
