
package boletin95;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin95 {


    public static void main(String[] args) {

        int i = 0;
        int constante1= 2;
        int valorS = 0;
        int numElementos;
        
        Metodos95 obx=new Metodos95();
        numElementos=obx.pedirElementos();
        obx.primeraSerie(i, numElementos);
    }
    
}
