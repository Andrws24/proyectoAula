
package control;

import java.util.Vector;
import modelo.DetalleCompra;

public class DetalleCompraController {
    private Vector detalleCompra = new Vector();

    public DetalleCompraController() {
    }

    public void agregar(DetalleCompra b) {
        getDetalleCompra().add(b);
    }

    public DetalleCompra consultar(String c) {
        DetalleCompra b = null;
        for (int i = 0; i < getDetalleCompra().size(); i++) {
            DetalleCompra blo = (DetalleCompra) getDetalleCompra().get(i);
            if (blo.getFactura().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getDetalleCompra().size(); i++) {
            DetalleCompra blo = (DetalleCompra) getDetalleCompra().get(i);
            if (blo.getFactura().equals(c)) {
                getDetalleCompra().remove(i);break;
            }
        }
    }

    
    public Vector getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(Vector detalleCompra) {
        this.detalleCompra = detalleCompra;
    }
}
