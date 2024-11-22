/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Seguro {
    int IdSeguro;
    String nombre;
    String compania;

    public Seguro() {
    }
    
    public Seguro(int IdSeguro, String nombre, String compania) {
        this.IdSeguro = IdSeguro;
        this.nombre = nombre;
        this.compania = compania;
    }
    
    public int getIdSeguro() {
        return IdSeguro;
    }

    public void setIdSeguro(int IdSeguro) {
        this.IdSeguro = IdSeguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
}
