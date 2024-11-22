/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class MetodoPago {
    int IdMetodo;
    String descripcion;

    public MetodoPago() {
    }
    
    public MetodoPago(int IdMetodo, String descripcion) {
        this.IdMetodo = IdMetodo;
        this.descripcion = descripcion;
    }
    
    public int getIdMetodo() {
        return IdMetodo;
    }

    public void setIdMetodo(int IdMetodo) {
        this.IdMetodo = IdMetodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
