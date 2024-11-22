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
public class Examen {
    int IdExamen;
    int FkCIta;
    String tipoExamen;
    String resultado;
    int FkLaboratorio;
    Date fechaRealizado;
    Date fechaResultado;

    public Examen() {
    }
    
    public Examen(int IdExamen, int FkCIta, String tipoExamen, String resultado, int FkLaboratorio, Date fechaRealizado, Date fechaResultado) {
        this.IdExamen = IdExamen;
        this.FkCIta = FkCIta;
        this.tipoExamen = tipoExamen;
        this.resultado = resultado;
        this.FkLaboratorio = FkLaboratorio;
        this.fechaRealizado = fechaRealizado;
        this.fechaResultado = fechaResultado;
    }
    
    public int getIdExamen() {
        return IdExamen;
    }

    public void setIdExamen(int IdExamen) {
        this.IdExamen = IdExamen;
    }

    public int getFkCIta() {
        return FkCIta;
    }

    public void setFkCIta(int FkCIta) {
        this.FkCIta = FkCIta;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getFkLaboratorio() {
        return FkLaboratorio;
    }

    public void setFkLaboratorio(int FkLaboratorio) {
        this.FkLaboratorio = FkLaboratorio;
    }

    public Date getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(Date fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public Date getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Date fechaResultado) {
        this.fechaResultado = fechaResultado;
    }
    
}
