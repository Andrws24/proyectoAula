/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Evento {
    private Ganado ganado;
    private Ganadero ganadero;
    private String fecha;
    private String tipo;
    private String observacion;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Evento() {
    }

    public Evento(Ganado ganado, Ganadero ganadero, String fecha, String tipo, String observacion) {
        this.ganado = ganado;
        this.ganadero = ganadero;
        this.fecha = fecha;
        this.tipo = tipo;
        this.observacion = observacion;
    }

    
    
    /**
     * @return the ganado
     */
    public Ganado getGanado() {
        return ganado;
    }

    /**
     * @param ganado the ganado to set
     */
    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }

    /**
     * @return the ganadero
     */
    public Ganadero getGanadero() {
        return ganadero;
    }

    /**
     * @param ganadero the ganadero to set
     */
    public void setGanadero(Ganadero ganadero) {
        this.ganadero = ganadero;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
