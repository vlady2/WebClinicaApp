/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class CitaInventario {
    int IdCitaInventario;
    int FkCita;
    int FkInventario;
    int cantidad;

    public CitaInventario() {
    }
    
    public CitaInventario(int IdCitaInventario, int FkCita, int FkInventario, int cantidad) {
        this.IdCitaInventario = IdCitaInventario;
        this.FkCita = FkCita;
        this.FkInventario = FkInventario;
        this.cantidad = cantidad;
    }
    
    public int getIdCitaInventario() {
        return IdCitaInventario;
    }

    public void setIdCitaInventario(int IdCitaInventario) {
        this.IdCitaInventario = IdCitaInventario;
    }

    public int getFkCita() {
        return FkCita;
    }

    public void setFkCita(int FkCita) {
        this.FkCita = FkCita;
    }

    public int getFkInventario() {
        return FkInventario;
    }

    public void setFkInventario(int FkInventario) {
        this.FkInventario = FkInventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
