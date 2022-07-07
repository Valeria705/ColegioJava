/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

import com.colegio.models.Alumno;
import com.colegio.services.AlumnoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AlumnosUpdateServlet", urlPatterns = {"/AlumnosUpdateServlet"})
public class AlumnosUpdateServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {
          //Recuperar el alumno que viene del formulario
          Alumno recuAl= new Alumno();
          
          recuAl.setId(request.getParameter("Id_Alumno"));
          recuAl.setNombre(request.getParameter("Nom_Alumno"));
          recuAl.setDireccion(request.getParameter("Dir_Alumno"));
          recuAl.setTelefono(request.getParameter("Tel_Alumno"));
          recuAl.setGrupo(request.getParameter("Grp_Alumno"));
          
          //Modificar alumno a traves de la capa de servicios y datos
          
          AlumnoService capaService= new AlumnoService();
          
          capaService.ModificarAlumno(recuAl);
          
          //Enviar el usuario a la pagina principal 
          
          response.sendRedirect("AlumnosSelect.jsp"); 
      }catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }
      
       
    }

 

}
