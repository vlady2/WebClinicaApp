/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Cita;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDCIT {
    public List list();
    public Cita listId(int id);
    public boolean add(Cita cit);
    public boolean edit(Cita cit);
    public boolean eliminar(int id);    
}
