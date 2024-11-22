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
public class Pasiente {
    int IdPaciente;
    String nombres;
    String apellidos;
    Date fechaNac;
    String sexo;
    String dui;
    String direccion;
    String telefono;
    int FkSeguro;
    String historial;

    public Pasiente() {
    }
    
    public Pasiente(int IdPaciente, String nombres, String apellidos, Date fechaNac, String sexo, String dui, String direccion, String telefono, int FkSeguro, String historial) {
        this.IdPaciente = IdPaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.dui = dui;
        this.direccion = direccion;
        this.telefono = telefono;
        this.FkSeguro = FkSeguro;
        this.historial = historial;
    }
    
    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getFkSeguro() {
        return FkSeguro;
    }

    public void setFkSeguro(int FkSeguro) {
        this.FkSeguro = FkSeguro;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
    
}
