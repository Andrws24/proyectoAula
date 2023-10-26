
package control;

import java.util.Vector;
import modelo.Monitoreo;

public class MonitoreoController {
    private Vector monitoreos = new Vector();



    public MonitoreoController() {
    }

    public void agregar(Monitoreo b) {
        getMonitoreos().add(b);
    }

    public Monitoreo consultar(String c) {
        Monitoreo b = null;
        for (int i = 0; i < getMonitoreos().size(); i++) {
            Monitoreo blo = (Monitoreo) getMonitoreos().get(i);
            if (blo.getCodigo().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getMonitoreos().size(); i++) {
            Monitoreo blo = (Monitoreo) getMonitoreos().get(i);
            if (blo.getCodigo().equals(c)) {
                getMonitoreos().remove(i);break;
            }
        }
    }

    
    public Vector getMonitoreos() {
        return monitoreos;
    }

    public void setMonitoreos(Vector monitoreos) {
        this.monitoreos = monitoreos;
    }
}
