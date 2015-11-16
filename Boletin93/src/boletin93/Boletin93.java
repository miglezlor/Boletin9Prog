
package boletin93;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin93 {


    public static void main(String[] args) {

        float base, altura;
        Metodos93 obx=new Metodos93();
        base=obx.pedirBase();
        altura=obx.pedirAltura();
        
        obx.calcularAltura(base, altura);
        
    }
    
}
