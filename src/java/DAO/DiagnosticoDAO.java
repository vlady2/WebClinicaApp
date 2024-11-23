/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDDIA;
import Modelo.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class DiagnosticoDAO implements CRUDDIA {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Diagnostico d =new Diagnostico();
    
    @Override
    public List list() {
        ArrayList<Diagnostico>list=new ArrayList<>();
        String sql="select * from Diagnostico";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Diagnostico dia=new Diagnostico();
                dia.setIdDiagnostico(rs.getInt("IdDiagnostico"));
                dia.setFkCita(rs.getInt("IdCita"));
                dia.setFkEnfermedad(rs.getInt("IdEnfermedad"));
                dia.setDescripcion(rs.getString("Descripcion"));
                dia.setTratamiento(rs.getString("Tratamiento"));
                list.add(dia);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Diagnostico listId(int id) {
        String sql="select * from Diagnostico where IdDiagnostico="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                d.setIdDiagnostico(rs.getInt("IdDiagnostico"));
                d.setFkCita(rs.getInt("IdCita"));
                d.setFkEnfermedad(rs.getInt("IdEnfermedad"));
                d.setDescripcion(rs.getString("Descripcion"));
                d.setTratamiento(rs.getString("Tratamiento"));
            }
        } catch (Exception e) {
        }
        return d;
    }

    @Override
    public boolean add(Diagnostico d) {
       String sql="insert into Diagnostico (IdCita, IdEnfermedad, Descripcion, Tratamiento)"+
               " values('"+d.getFkCita()+"','"+d.getFkEnfermedad()+"','"+d.getDescripcion()+"','"+d.getTratamiento()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Diagnostico d) {
        String sql="update Diagnostico set IdCita='"+d.getFkCita()+"', IdEnfermedad='"+d.getFkEnfermedad()+"', Descripcion='"+d.getDescripcion()+
                "', Tratamiento='"+d.getTratamiento()+"' where IdDiagnostico="+d.getIdDiagnostico();
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
        String sql="delete from Diagnostico where IdDiagnostico = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
