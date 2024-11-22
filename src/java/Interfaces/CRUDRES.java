/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Receta;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDRES {
    
    public List list();
    public Receta listId(int id);
    public boolean add(Receta per);
    public boolean edit(Receta per);
    public boolean eliminar(int id);
    
}
