
package control;

import java.util.Vector;
import modelo.Compra;

public class CompraController {
    private Vector compras = new Vector();

    public CompraController() {
    }

    public void agregar(Compra b) {
        getCompras().add(b);
    }

    public Compra consultar(String c) {
        Compra b = null;
        for (int i = 0; i < getCompras().size(); i++) {
            Compra blo = (Compra) getCompras().get(i);
            if (blo.getCodigo().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getCompras().size(); i++) {
            Compra blo = (Compra) getCompras().get(i);
            if (blo.getCodigo().equals(c)) {
                getCompras().remove(i);break;
            }
        }
    }

    
    public Vector getCompras() {
        return compras;
    }

    public void setCompras(Vector compras) {
        this.compras = compras;
    }
}
