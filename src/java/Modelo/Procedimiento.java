/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Procedimiento {
    int IdProicedimiento;
    String nombre;
    String Descripcion;
    
    public Procedimiento() {
    }
    
    public Procedimiento(int IdProicedimiento, String nombre, String Descripcion) {
        this.IdProicedimiento = IdProicedimiento;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
    }
    
    public int getIdProicedimiento() {
        return IdProicedimiento;
    }

    public void setIdProicedimiento(int IdProicedimiento) {
        this.IdProicedimiento = IdProicedimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
