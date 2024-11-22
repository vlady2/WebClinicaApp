/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Receta;
import DAO.RecetaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 *
 * @author HP
 */
public class ControladorRES extends HttpServlet{
    String listar="vistas/listarRecetas.jsp";
    String add="vistas/addReceta.jsp";
    String edit="vistas/editReceta.jsp";
    Receta r=new Receta();
    RecetaDAO dao=new RecetaDAO();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;          
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            int idM=Integer.parseInt(request.getParameter("txtmedicamento"));
            int idC=Integer.parseInt(request.getParameter("txtcita"));
            String dos=request.getParameter("txtdosis");
            String ind=request.getParameter("txtindicacion");
            r.setFkMedicamento(idM);
            r.setFkCita(idC);
            r.setDosis(dos);
            r.setIndicaciones(ind);
            dao.add(r);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("iddoc",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
            int idM=Integer.parseInt(request.getParameter("txtmedicamento"));
            int idC=Integer.parseInt(request.getParameter("txtcita"));
            String dos=request.getParameter("txtdosis");
            String ind=request.getParameter("txtindicacion");
            r.setIdReceta(id);
            r.setFkMedicamento(idM);
            r.setFkCita(idC);
            r.setDosis(dos);
            r.setIndicaciones(ind);
            dao.edit(r);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            r.setIdReceta(id);
            dao.eliminar(id);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
