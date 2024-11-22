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
public class Inventario {
    int IdInventario;
    String producto;
    int cantidad;
    Date vencimiento;

    public Inventario() {
    }
    
    public Inventario(int IdInventario, String producto, int cantidad, Date vencimiento) {
        this.IdInventario = IdInventario;
        this.producto = producto;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
    }
    
    public int getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(int IdInventario) {
        this.IdInventario = IdInventario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    
}
