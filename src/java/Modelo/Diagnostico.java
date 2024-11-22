/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Diagnostico {
    int IdDiagnostico;
    int FkCita;
    int FkEnfermedad;
    String descripcion;
    String tratamiento;

    public Diagnostico() {
    }
    
    public Diagnostico(int IdDiagnostico, int FkCita, int FkEnfermedad, String descripcion, String tratamiento) {
        this.IdDiagnostico = IdDiagnostico;
        this.FkCita = FkCita;
        this.FkEnfermedad = FkEnfermedad;
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }
    
    public int getIdDiagnostico() {
        return IdDiagnostico;
    }

    public void setIdDiagnostico(int IdDiagnostico) {
        this.IdDiagnostico = IdDiagnostico;
    }

    public int getFkCita() {
        return FkCita;
    }

    public void setFkCita(int FkCita) {
        this.FkCita = FkCita;
    }

    public int getFkEnfermedad() {
        return FkEnfermedad;
    }

    public void setFkEnfermedad(int FkEnfermedad) {
        this.FkEnfermedad = FkEnfermedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
}
