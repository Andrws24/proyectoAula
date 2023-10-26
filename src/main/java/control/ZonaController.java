/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Vector;
import modelo.Zona;

/**
 *
 * @author JCMM
 */
public class ZonaController {
    private Vector zonas = new Vector();
     

    public ZonaController() {
    }

    public void agregar(Zona b) {
        getZonas().add(b);
    }

    public Zona consultar(String c) {
        Zona b = null;
        for (int i = 0; i < getZonas().size(); i++) {
            Zona blo = (Zona) getZonas().get(i);
            if (blo.getCodigo().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getZonas().size(); i++) {
            Zona blo = (Zona) getZonas().get(i);
            if (blo.getCodigo().equals(c)) {
                getZonas().remove(i);break;
            }
        }
    }
    
    

    /**
     * @return the zonas
     */
    public Vector getZonas() {
        return zonas;
    }

    /**
     * @param zonas the zonas to set
     */
    public void setZonas(Vector zonas) {
        this.zonas = zonas;
    }

    
    
   
}
