
package control;

import java.util.Vector;
import modelo.Insumo;

public class InsumoController {
    private Vector insumos = new Vector();



    public InsumoController() {
    }

    public void agregar(Insumo b) {
        getInsumos().add(b);
    }

    public Insumo consultar(String c) {
        Insumo b = null;
        for (int i = 0; i < getInsumos().size(); i++) {
            Insumo blo = (Insumo) getInsumos().get(i);
            if (blo.getCodigo().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getInsumos().size(); i++) {
            Insumo blo = (Insumo) getInsumos().get(i);
            if (blo.getCodigo().equals(c)) {
                getInsumos().remove(i);break;
            }
        }
    }

    
    public void setInsumos(Vector insumos) {
        this.insumos = insumos;
    }

    public Vector getInsumos() {
        return insumos;
    }
}
