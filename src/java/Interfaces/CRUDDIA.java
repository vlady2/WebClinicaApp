/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Diagnostico;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDDIA {
    public List list();
    public Diagnostico listId(int id);
    public boolean add(Diagnostico cit);
    public boolean edit(Diagnostico cit);
    public boolean eliminar(int id);
}
