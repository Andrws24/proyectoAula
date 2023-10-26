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
public class Monitoreo {
    private Ganadero ganadero;
    private String fecha;
    private Ganado ganado;
    private String descripcion;
    private String estado;
    private double peso;
    String codigo;

    public String getCodigo() {
        return codigo;
    }

    public Monitoreo(Ganadero ganadero, String fecha, Ganado ganado, String descripcion, String estado, double peso, String codigo) {
        this.ganadero = ganadero;
        this.fecha = fecha;
        this.ganado = ganado;
        this.descripcion = descripcion;
        this.estado = estado;
        this.peso = peso;
        this.codigo = codigo;
    }

    public Monitoreo() {
    }

    public Monitoreo(Ganadero ganadero, String fecha, Ganado ganado, String descripcion, String estado, double peso) {
        this.ganadero = ganadero;
        this.fecha = fecha;
        this.ganado = ganado;
        this.descripcion = descripcion;
        this.estado = estado;
        this.peso = peso;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
