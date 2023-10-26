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
public class Ganadero extends Usuario{
    private String especialidad;
    private String fecha_nacimiento;

    public Ganadero() {
    }

    public Ganadero(String especialidad, String fecha_nacimiento, String nombre, String apellido, String email, String telefono, String login, String password, String identificacion, String tipo, String estado) {
        super(nombre, apellido, email, telefono, login, password, identificacion, tipo, estado);
        this.especialidad = especialidad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    
    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
    
}
