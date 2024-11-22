/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Laboratorio {
    int IdLaboratorio;
    String ubicacion;
    String telefono;
    String especialidad;

    public Laboratorio() {
    }
    
    public Laboratorio(int IdLaboratorio, String ubicacion, String telefono, String especialidad) {
        this.IdLaboratorio = IdLaboratorio;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    
    public int getIdLaboratorio() {
        return IdLaboratorio;
    }

    public void setIdLaboratorio(int IdLaboratorio) {
        this.IdLaboratorio = IdLaboratorio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
