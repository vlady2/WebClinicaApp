/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Examen;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDEXA {
    public List list();
    public Examen listId(int id);
    public boolean add(Examen cit);
    public boolean edit(Examen cit);
    public boolean eliminar(int id);
}
