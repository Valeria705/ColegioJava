/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

import com.colegio.models.Especialidad;
import com.colegio.services.EspecialidadService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EspecialidadesUpdateServlet", urlPatterns = {"/EspecialidadesUpdateServlet"})
public class EspecialidadesUpdateServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {
          //Recuperar el alumno que viene del formulario
          Especialidad recuAl= new Especialidad();
          
          recuAl.setIdEspecialidad(request.getParameter("Id_Especialidad"));
          recuAl.setNomEspecialidad(request.getParameter("Nom_Especialidad"));
          
          
          //Modificar alumno a traves de la capa de servicios y datos
          
          EspecialidadService capaService= new EspecialidadService();
          
          capaService.ModificarEspecialidad(recuAl);
          
          //Enviar el usuario a la pagina principal 
          
          response.sendRedirect("EspecialidadesSelect.jsp"); 
      }catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e); 
            throw new ServletException(e.toString());
            
        }
      
       
    }

 

}
