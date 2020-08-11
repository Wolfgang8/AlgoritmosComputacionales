package clases;

import java.util.ArrayList;

public class Newton {
    private static ArrayList<String> iteraciones = new ArrayList<String>();

    public static ArrayList getIteraciones() {
        return iteraciones;
    }

    public String raiz(Funcion f, double x0, int nMAx, double tolerancia) {
       String mensaje = null;
        try {
            double r = Double.NaN;
            double x = x0;
            int k = 0;
            iteraciones.add(0, Double.toString(x));
            
            while (Math.abs(f.eval(x)) > tolerancia && k < nMAx) {
                x = x0 - (f.eval(x0) / f.valorDerivada(x0));
                if (f.valorDerivada(x0)==0) {
                    throw new Exception ("división para cero encontrada");
                }
                iteraciones.add(Double.toString(x));
                k++;
                x0 = x;
            }
            
            if (k < nMAx) {
                r = x;
                mensaje = Double.toString(r);
            } else {
                mensaje = "raíz no encontrada";
            }  
        } catch (Exception e) {
             mensaje = e.getMessage();
        }
         return mensaje;
    }

    public void borrarColeccion() {
        iteraciones.clear();
    }
}