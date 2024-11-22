/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Receta {
    
    int IdReceta;
    int FkMedicamento;
    int FkCita;
    String dosis;
    String indicaciones;

    public Receta() {
    }
    
    public Receta(int IdReceta, int FkMedicamento, int FkCita, String dosis, String indicaciones) {
        this.IdReceta = IdReceta;
        this.FkMedicamento = FkMedicamento;
        this.FkCita = FkCita;
        this.dosis = dosis;
        this.indicaciones = indicaciones;
    }
    
    public int getIdReceta() {
        return IdReceta;
    }

    public void setIdReceta(int IdReceta) {
        this.IdReceta = IdReceta;
    }

    public int getFkMedicamento() {
        return FkMedicamento;
    }

    public void setFkMedicamento(int FkMedicamento) {
        this.FkMedicamento = FkMedicamento;
    }

    public int getFkCita() {
        return FkCita;
    }

    public void setFkCita(int FkCita) {
        this.FkCita = FkCita;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    
    
}
