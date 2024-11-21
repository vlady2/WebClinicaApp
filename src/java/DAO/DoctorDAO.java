/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDDOC;
import Modelo.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class DoctorDAO implements CRUDDOC {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Doctor d =new Doctor();
    
    @Override
    public List list() {
        ArrayList<Doctor>list=new ArrayList<>();
        String sql="select * from Doctores";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Doctor doc=new Doctor();
                doc.setIddoctor(rs.getInt("IdDoctor"));
                doc.setNombres(rs.getString("nombres"));
                doc.setApellidos(rs.getString("apeliidos"));
                doc.setDui(rs.getString("DUI"));
                doc.setHoraAtencion(rs.getString("horaAtencion"));
                doc.setFkEspecialidad(rs.getInt("IdEspecialidad"));
                list.add(doc);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Doctor listId(int id) {
        String sql="select * from Doctores where IdDoctor="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                d.setIddoctor(rs.getInt("IdDoctor"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apeliidos"));
                d.setDui(rs.getString("DUI"));
                d.setHoraAtencion(rs.getString("horaAtencion"));
                d.setFkEspecialidad(rs.getInt("IdEspecialidad"));
            }
        } catch (Exception e) {
        }
        return d;
    }

    @Override
    public boolean add(Doctor doc) {
       String sql="insert into Doctores (nombres, apellidos, horaAtencion, DUI, estado, IdEspecialidad) values('"+doc.getNombres()+"','"+doc.getApellidos()+"','"
               +doc.getHoraAtencion()+"','"+doc.getDui()+"','"+doc.getEstado()+"','"+doc.getFkEspecialidad()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Doctor doc) {
        String sql="update Doctores set nombres='"+doc.getNombres()+"',apellidos='"+doc.getApellidos()+"', DUI='"+doc.getDui()+"', horaAtencion='"+
                doc.getHoraAtencion()+"', estado='"+doc.getEstado()+"', IdEspecialidad='"+doc.getFkEspecialidad()+"' where IdDoctor="+doc.getIddoctor();
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
        String sql="delete from Doctores where IdDoctor = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
