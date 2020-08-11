package clases;

import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Funcion {
    JEP j = new JEP();
    String funcion = "";

    public  String getFuncion() {
        return funcion;
    }

    public  void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    /**
     * @param def
    **/
    public Funcion(String def) throws ParseException {
        this.setFuncion(def);
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
    **/
    public double eval(double x) {
        double r;
        j.addVariable("x", x);
        r = j.getValue();
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, "Error al convertir la funcion");
        }
        return r;
    }

    /**
     * @param x
     * @return
    **/
    public double valorDerivada(double x) throws ParseException {
        double r;   
         DJep k = new DJep();
       
        k.addStandardConstants();
        k.addStandardFunctions();
        k.addComplex();
        k.setAllowUndeclared(true);
        k.setAllowAssignment(true);
        k.setImplicitMul(true);
        k.addStandardDiffRules();
        Node node = k.parse(this.getFuncion());
        Node diff = k.differentiate(node, "x");
        Node simp = k.simplify(diff);
        String derivada=k.toString(simp);
        k.parseExpression(derivada);
        k.addVariable("x", x);
        r = k.getValue();
        if (k.hasError()) {
            JOptionPane.showMessageDialog(null, "Error  al convertir la funcion");
        }
        return r;
    }
}