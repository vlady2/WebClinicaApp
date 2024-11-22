/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Especialidad {
    int IdEspecialidad;
    String nombreE;

    public Especialidad() {
    }
    
    public Especialidad(int IdEspecialidad, String nombreE) {
        this.IdEspecialidad = IdEspecialidad;
        this.nombreE = nombreE;
    }
    
    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
    
}
