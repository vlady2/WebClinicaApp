/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Pasiente;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDPAS {
    
    public List list();
    public Pasiente listId(int id);
    public boolean add(Pasiente per);
    public boolean edit(Pasiente per);
    public boolean eliminar(int id);
    
}
