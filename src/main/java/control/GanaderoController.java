
package control;

import java.util.Vector;
import modelo.Ganadero;

public class GanaderoController {
    private Vector ganaderos = new Vector();

   

    public GanaderoController() {
    }

    public void agregar(Ganadero b) {
        getGanaderos().add(b);
    }

    public Ganadero consultar(String c) {
        Ganadero b = null;
        for (int i = 0; i < getGanaderos().size(); i++) {
            Ganadero blo = (Ganadero) getGanaderos().get(i);
            if (blo.getIdentificacion().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getGanaderos().size(); i++) {
            Ganadero blo = (Ganadero) getGanaderos().get(i);
            if (blo.getIdentificacion().equals(c)) {
                getGanaderos().remove(i);break;
            }
        }
    }

    
     public void setGanaderos(Vector ganaderos) {
        this.ganaderos = ganaderos;
    }

    public Vector getGanaderos() {
        return ganaderos;
    }
}
