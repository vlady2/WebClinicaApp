/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDPAS;
import Modelo.Pasiente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class PacienteDAO implements CRUDPAS{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Pasiente p =new Pasiente();
    
    @Override
    public List list() {
        ArrayList<Pasiente>list=new ArrayList<>();
        String sql="select * from Pacientes";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pasiente pas=new Pasiente();
                pas.setIdPaciente(rs.getInt("IdPaciente"));
                pas.setNombres(rs.getString("nombres"));
                pas.setApellidos(rs.getString("apeliidos"));
                pas.setDui(rs.getString("DUI"));
                pas.setDireccion(rs.getString("direccion"));
                pas.setTelefono(rs.getString("telefono"));
                pas.setFechaNac(rs.getDate("fechaNac"));
                list.add(pas);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Pasiente listId(int id) {
        String sql="select * from Pacientes where IdPaciente="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setIdPaciente(rs.getInt("IdPaciente"));
                p.setNombres(rs.getString("nombres"));
                p.setApellidos(rs.getString("apeliidos"));
                p.setDui(rs.getString("DUI"));
                p.setDireccion(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setFechaNac(rs.getDate("fechaNac"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Pasiente pas) {
       String sql="insert into Pacientes (nombres, apellidos, DUI, direccion, telefono, fechaNac) values('"+pas.getNombres()+"','"+pas.getApellidos()+"','"
               +pas.getDui()+"','"+pas.getDireccion()+"','"+pas.getTelefono()+"','"+pas.getFechaNac()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Pasiente pac) {
        String sql="update Pacientes set nombres='"+pac.getNombres()+"',apellidos='"+pac.getApellidos()+"', DUI='"+pac.getDui()+"', direccion='"+
                pac.getDireccion()+"', telefono='"+pac.getTelefono()+"', fechaNAc='"+pac.getFechaNac()+"' where IdPaciente="+pac.getIdPaciente();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from Pacientes where IdPaciente = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
