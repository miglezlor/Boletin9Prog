
package boletin91;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin91 {


    public static void main(String[] args) {

        int i=0;
        int numeros=10;
        int num;
        int numNeg=0;
        int numPos=0;
        int numCero=0;
        
        
        while(i<numeros){
            Numero91 obx=new Numero91();
            num=obx.pedirNumero();
            
            if (num<0)
                numNeg++;
            else if (num>0)
                numPos++;
            else 
                numCero++;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Hai "+numPos+ " positivos");
        JOptionPane.showMessageDialog(null, "Hai "+numNeg+ " negativos");
        JOptionPane.showMessageDialog(null, "Hai "+numCero+ " ceros");
    }
    
}
