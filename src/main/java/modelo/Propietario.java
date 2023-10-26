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

public class Propietario extends Usuario{
    private String nit;
    private String marca;
    private String direccion;

    public Propietario() {
    }

    public Propietario(String nit, String marca, String direccion) {
        this.nit = nit;
        this.marca = marca;
        this.direccion = direccion;
    }

    public Propietario(String nit, String marca, String direccion, String nombre, String apellido, String email, String telefono, String login, String password, String identificacion, String tipo, String estado) {
        super(nombre, apellido, email, telefono, login, password, identificacion, tipo, estado);
        this.nit = nit;
        this.marca = marca;
        this.direccion = direccion;
    }

    
    
    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
