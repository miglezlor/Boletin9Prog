
package boletin95;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos95 {
    int i=0;
    int constante1=2;
    int valorS=0;
    public int pedirElementos(){
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de elementos"));
        return numElementos;
    }
    public void primeraSerie(int i, int numElementos){
        while (i<numElementos){
            valorS=constante1+valorS;
            System.out.println(valorS);
            i++;
        }
        
    }
    public void terceraSerie(int i, int numElementos){
        while (i<numElementos){
            
                                 
        }
    }
}
