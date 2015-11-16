
package boletin91;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Numero91 {
    
    int numNeg=0;
    int numPos=0;
    int numCero=0;
    
    public int pedirNumero(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        return num;
    }
    

}
