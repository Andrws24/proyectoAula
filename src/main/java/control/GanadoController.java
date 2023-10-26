/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Vector;
import modelo.Ganado;
import modelo.Zona;

/**
 *
 * @author JCMM
 */
public class GanadoController {
    private Vector ganados = new Vector();

    public GanadoController() {
    }

    public void agregar(Ganado b) {
        getGanados().add(b);
    }

    public Ganado consultar(String c) {
        Ganado b = null;
        for (int i = 0; i < getGanados().size(); i++) {
            Ganado blo = (Ganado) getGanados().get(i);
            if (blo.getId().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getGanados().size(); i++) {
            Ganado blo = (Ganado) getGanados().get(i);
            if (blo.getId().equals(c)) {
                getGanados().remove(i);break;
            }
        }
    }

    /**
     * @return the ganados
     */
    public Vector getGanados() {
        return ganados;
    }

    /**
     * @param ganados the ganados to set
     */
    public void setGanados(Vector ganados) {
        this.ganados = ganados;
    }

  
    
   
}
