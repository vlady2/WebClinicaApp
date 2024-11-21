/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Doctor {
    int Iddoctor;
    String nombres;
    String apellidos;
    String dui;
    String horaAtencion;
    int estado;
    int FkEspecialidad;

    public Doctor() {
    }
    
    public Doctor(int Iddoctor, String nombres, String apellidos, String dui, String horaAtencion, int estado, int FkEspecialidad) {
        this.Iddoctor = Iddoctor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dui = dui;
        this.horaAtencion = horaAtencion;
        this.estado = estado;
        this.FkEspecialidad = FkEspecialidad;
    }
    
    public int getIddoctor() {
        return Iddoctor;
    }

    public void setIddoctor(int Iddoctor) {
        this.Iddoctor = Iddoctor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String hotaAtencion) {
        this.horaAtencion = hotaAtencion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getFkEspecialidad() {
        return FkEspecialidad;
    }

    public void setFkEspecialidad(int FkEspecialidad) {
        this.FkEspecialidad = FkEspecialidad;
    }
    
    
}
