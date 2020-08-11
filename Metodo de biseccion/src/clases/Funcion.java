package clases;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

public class Funcion {

    JEP j = new JEP();
/**
 * @param def
 */
    public Funcion(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
         j.setImplicitMul(true);
        j.parseExpression(def);
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, "Error al convertir la funcion");
        }
    }
    
    /**
     * @param x
     * @return
     */
    public double eval(double x){
        double r;
        j.addVariable("x",x);
        r=j.getValue();
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, "Error al convertir la funcion");
        }
        return r;     
    }
}
