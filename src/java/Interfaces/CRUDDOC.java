/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Doctor;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CRUDDOC {
    
    public List list();
    public Doctor listId(int id);
    public boolean add(Doctor per);
    public boolean edit(Doctor per);
    public boolean eliminar(int id);
}
