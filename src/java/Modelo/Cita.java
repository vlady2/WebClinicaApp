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
public class Cita {
    int IdCita;
    int FkPaciente;
    int FkMedico;
    int FkSeguro;
    int FkMedotoPago;
    Date fechaCita;
    String horaCita;
    String motivo;
    int FkProcedimiento;
    Date fechaFactura;
    Double totalFactura;

    public Cita() {
    }
    
    public Cita(int IdCita, int FkPaciente, int FkMedico, int FkSeguro, int FkMedotoPago, Date fechaCita, String horaCita, String motivo, int FkProcedimiento, Date fechaFactura, Double totalFactura) {
        this.IdCita = IdCita;
        this.FkPaciente = FkPaciente;
        this.FkMedico = FkMedico;
        this.FkSeguro = FkSeguro;
        this.FkMedotoPago = FkMedotoPago;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivo = motivo;
        this.FkProcedimiento = FkProcedimiento;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
    }
    
    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int IdCita) {
        this.IdCita = IdCita;
    }

    public int getFkPaciente() {
        return FkPaciente;
    }

    public void setFkPaciente(int FkPaciente) {
        this.FkPaciente = FkPaciente;
    }

    public int getFkMedico() {
        return FkMedico;
    }

    public void setFkMedico(int FkMedico) {
        this.FkMedico = FkMedico;
    }

    public int getFkSeguro() {
        return FkSeguro;
    }

    public void setFkSeguro(int FkSeguro) {
        this.FkSeguro = FkSeguro;
    }

    public int getFkMedotoPago() {
        return FkMedotoPago;
    }

    public void setFkMedotoPago(int FkMedotoPago) {
        this.FkMedotoPago = FkMedotoPago;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getFkProcedimiento() {
        return FkProcedimiento;
    }

    public void setFkProcedimiento(int FkProcedimiento) {
        this.FkProcedimiento = FkProcedimiento;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }
    
}
