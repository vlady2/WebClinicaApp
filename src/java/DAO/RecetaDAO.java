/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDRES;
import Modelo.Receta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class RecetaDAO implements CRUDRES {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Receta r =new Receta();
    
    @Override
    public List list() {
        ArrayList<Receta>list=new ArrayList<>();
        String sql="select * from Recetas";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Receta rec=new Receta();
                rec.setIdReceta(rs.getInt("IdReceta"));
                rec.setFkMedicamento(rs.getInt("IdMedicamento"));
                rec.setFkCita(rs.getInt("IdCita"));
                rec.setDosis(rs.getString("dosis"));
                rec.setIndicaciones(rs.getString("indicaciones"));
                list.add(rec);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Receta listId(int id) {
        String sql="select * from Recetas where IdReceta="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                r.setIdReceta(rs.getInt("IdReceta"));
                r.setFkMedicamento(rs.getInt("IdMedicamento"));
                r.setFkCita(rs.getInt("IdCita"));
                r.setDosis(rs.getString("dosis"));
                r.setIndicaciones(rs.getString("indicaciones"));
            }
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public boolean add(Receta rec) {
       String sql="insert into Recetas (IdMedicamento, IdCita, dosis, indicaciones) values('"+rec.getFkMedicamento()+"','"+rec.getFkCita()+"','"
               +rec.getDosis()+"','"+rec.getIndicaciones()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Receta rec) {
        String sql="update Recetas set IdMedicamento='"+rec.getFkMedicamento()+"',IdCita='"+rec.getFkCita()+"', dosis='"+rec.getDosis()+"', indicaciones='"+
                rec.getIndicaciones()+"' where IdReceta="+rec.getIdReceta();
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
        String sql="delete from Recetas where IdReceta = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
