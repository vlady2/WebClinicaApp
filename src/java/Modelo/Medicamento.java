/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Medicamento {
    int IdMedicamento;
    String nombre;
    String principioActivo;
    String Dosis;

    public Medicamento() {
    }
    
    public Medicamento(int IdMedicamento, String nombre, String principioActivo, String Dosis) {
        this.IdMedicamento = IdMedicamento;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.Dosis = Dosis;
    }
    
    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int IdMedicamento) {
        this.IdMedicamento = IdMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }
    
}
