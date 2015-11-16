
package boletin93;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos93 {
    
    public float pedirBase(){
        float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce a base"));
        return base;
    }
    public float pedirAltura(){
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce a altura"));
        return altura;
    }
    public void calcularAltura(float base, float altura){
        if (base<0)
            JOptionPane.showMessageDialog(null, "Non permítense bases negativas");
        else if (altura<0)
            JOptionPane.showMessageDialog(null, "Non permítense alturas negativas");
        else
            JOptionPane.showMessageDialog(null, "A área é "+(base*altura));
    }
}
