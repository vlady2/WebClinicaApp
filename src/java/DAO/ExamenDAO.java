/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDEXA;
import Modelo.Examen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class ExamenDAO implements CRUDEXA {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Examen ex =new Examen();
    
    @Override
    public List list() {
        ArrayList<Examen>list=new ArrayList<>();
        String sql="select * from Diagnostico";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Examen exa=new Examen();
                exa.setIdExamen(rs.getInt("IdExamen"));
                exa.setFkCIta(rs.getInt("IdCita"));
                exa.setTipoExamen(rs.getString("TipoExamen"));
                exa.setResultado(rs.getString("Resultado"));
                exa.setFkLaboratorio(rs.getInt("IdLaboratorio"));
                exa.setFechaRealizado(rs.getDate("FechaRealizacion"));
                exa.setFechaResultado(rs.getDate("FechaResultado"));
                list.add(exa);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Examen listId(int id) {
        String sql="select * from Examen where IdExamen="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                ex.setIdExamen(rs.getInt("IdDiagnostico"));
                ex.setFkCIta(rs.getInt("IdCita"));
                ex.setTipoExamen(rs.getString("TipoExamen"));
                ex.setResultado(rs.getString("Resultado"));
                ex.setFkLaboratorio(rs.getInt("IdLaboratorio"));
                ex.setFechaRealizado(rs.getDate("FechaRealizacion"));
                ex.setFechaResultado(rs.getDate("FechaResultado"));
            }
        } catch (Exception e) {
        }
        return ex;
    }

    @Override
    public boolean add(Examen ex) {
       String sql="insert into Examen (IdCita, TipoExamen, Resultado, IdLaboratorio, FechaRealizacion, FechaResultado)"+
               " values('"+ex.getFkCIta()+"','"+ex.getTipoExamen()+"','"+ex.getResultado()+"','"+ex.getFkLaboratorio()+"','"+ex.getFechaRealizado()+"','"+ex.getFechaResultado()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Examen ex) {
        String sql="update Examen set IdCita='"+ex.getFkCIta()+"', TipoExamen='"+ex.getTipoExamen()+"', Resultado='"+ex.getResultado()+
                "', IdLaboratorio='"+ex.getFkLaboratorio()+"', FechaRealizacion='"+ex.getFechaRealizado()+"', FechaResultado='"+ex.getFechaResultado()
                +"'  where IdExamen="+ex.getIdExamen();
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
        String sql="delete from Examen where IdExamen = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
