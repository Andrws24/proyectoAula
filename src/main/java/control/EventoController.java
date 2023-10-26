
package control;

import java.util.Vector;
import modelo.Evento;

public class EventoController {
    private Vector eventos = new Vector();

   

    public EventoController() {
    }

    public void agregar(Evento b) {
        getEventos().add(b);
    }

    public Evento consultar(String c) {
        Evento b = null;
        for (int i = 0; i < getEventos().size(); i++) {
            Evento blo = (Evento) getEventos().get(i);
            if (blo.getId().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getEventos().size(); i++) {
            Evento blo = (Evento) getEventos().get(i);
            if (blo.getId().equals(c)) {
                getEventos().remove(i);break;
            }
        }
    }
    
    
     public void setEventos(Vector eventos) {
        this.eventos = eventos;
    }

    public Vector getEventos() {
        return eventos;
    }

    
}
