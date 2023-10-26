
package control;

import java.util.Vector;
import modelo.Propietario;

public class PropietarioController {
    private Vector propietarios = new Vector();



    public PropietarioController() {
    }

    public void agregar(Propietario b) {
        getPropietarios().add(b);
    }

    public Propietario consultar(String c) {
        Propietario b = null;
        for (int i = 0; i < getPropietarios().size(); i++) {
            Propietario blo = (Propietario) getPropietarios().get(i);
            if (blo.getNit().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getPropietarios().size(); i++) {
            Propietario blo = (Propietario) getPropietarios().get(i);
            if (blo.getNit().equals(c)) {
                getPropietarios().remove(i);break;
            }
        }
    }

    
    public Vector getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Vector propietarios) {
        this.propietarios = propietarios;
    }
}
