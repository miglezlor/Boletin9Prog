
package boletin94;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos94 {
    int i=1;
    int valor=0;
    public int pedirNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero"));
        return numero;
    }
    public void taboaMult(int i, int numero){
        if (numero==0)
            JOptionPane.showMessageDialog(null, "Fin do programa");
        else
            while (i<=10){
                valor=i*numero;
                System.out.println(numero+" * "+i+" = "+ valor);
                i++;
            }
        
    }
}
