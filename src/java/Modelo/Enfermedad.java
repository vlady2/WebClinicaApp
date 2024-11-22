/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Enfermedad {
    int IdEnfermedad;
    String nombre;
    String descripcion;

    public Enfermedad() {
    }
    
    public Enfermedad(int IdEnfermedad, String nombre, String descripcion) {
        this.IdEnfermedad = IdEnfermedad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public int getIdEnfermedad() {
        return IdEnfermedad;
    }

    public void setIdEnfermedad(int IdEnfermedad) {
        this.IdEnfermedad = IdEnfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
