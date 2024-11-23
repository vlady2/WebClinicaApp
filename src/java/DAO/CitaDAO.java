/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUDCIT;
import Modelo.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class CitaDAO implements CRUDCIT{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cita c =new Cita();
    
    @Override
    public List list() {
        ArrayList<Cita>list=new ArrayList<>();
        String sql="select * from Cita";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cita cit=new Cita();
                cit.setIdCita(rs.getInt("IdCita"));
                cit.setFkPaciente(rs.getInt("IdPaciente"));
                cit.setFkMedico(rs.getInt("IdMedico"));
                cit.setFkSeguro(rs.getInt("IdSeguro"));
                cit.setFkMedotoPago(rs.getInt("IdMetodoPago"));
                cit.setFechaCita(rs.getDate("FechaCita"));
                cit.setHoraCita(rs.getString("HoraCita"));
                cit.setMotivo(rs.getString("MotivoConsulta"));
                cit.setFkProcedimiento(rs.getInt("IdProcedimiento"));
                cit.setFechaFactura(rs.getDate("FechaFacturacion"));
                cit.setTotalFactura(rs.getDouble("TotalFactura"));
                list.add(cit);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Cita listId(int id) {
        String sql="select * from Cita where IdCita="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                c.setIdCita(rs.getInt("IdCita"));
                c.setFkPaciente(rs.getInt("IdPaciente"));
                c.setFkMedico(rs.getInt("IdMedico"));
                c.setFkSeguro(rs.getInt("IdSeguro"));
                c.setFkMedotoPago(rs.getInt("IdMetodoPago"));
                c.setFechaCita(rs.getDate("FechaCita"));
                c.setHoraCita(rs.getString("HoraCita"));
                c.setMotivo(rs.getString("MotivoConsulta"));
                c.setFkProcedimiento(rs.getInt("IdProcedimiento"));
                c.setFechaFactura(rs.getDate("FechaFacturacion"));
                c.setTotalFactura(rs.getDouble("TotalFactura"));
            }
        } catch (Exception e) {
        }
        return c;
    }

    @Override
    public boolean add(Cita cit) {
       String sql="insert into Cita (IdPaciente, IdMedico, IdSeguro, IdMetodoPago, FechaCita, HoraCita, MotivoConsulta, IdProcedimiento, FechaFacturacion,TotalFactura)"+
               " values('"+cit.getFkPaciente()+"','"+cit.getFkMedico()+"','"+cit.getFkSeguro()+"','"+cit.getFkMedotoPago()+"','"+cit.getFechaCita()+"','"+cit.getHoraCita()+
               "', '"+cit.getMotivo()+"','"+cit.getFkProcedimiento()+"','"+cit.getFechaFactura()+"','"+cit.getTotalFactura()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Cita c) {
        String sql="update Cita set IdPaciente='"+c.getFkPaciente()+"',IdMedico='"+c.getFkMedico()+"', IdSeguro='"+c.getFkSeguro()+"', IdMetodoPago='"+c.getFkMedotoPago()+
                "', FechaCita='"+c.getFechaCita()+"', HoraCita='"+c.getHoraCita()+"', MotivoConsulta='"+c.getMotivo()+"', IdProcedimiento='"+c.getFkProcedimiento()
                +"', FechaFacturacion='"+c.getFechaFactura()+"', TotalFactura='"+c.getTotalFactura()+"' where IdCita="+c.getIdCita();
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
        String sql="delete from Cita where IdCita = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
