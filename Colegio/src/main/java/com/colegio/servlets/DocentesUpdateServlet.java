/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

import com.colegio.models.Docente;
import com.colegio.services.DocenteService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DocentesUpdateServlet", urlPatterns = {"/DocentesUpdateServlet"})
public class DocentesUpdateServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {
          //Recuperar el alumno que viene del formulario
          Docente recuAl= new Docente();
          
          recuAl.setId(request.getParameter("ID_Docente"));
          recuAl.setNombre(request.getParameter("Nom_Docente"));
          recuAl.setDireccion(request.getParameter("Dire_Docente"));
          recuAl.setTelefono(request.getParameter("Tel_Docente"));
          
          
          //Modificar alumno a traves de la capa de servicios y datos
          
          DocenteService capaService= new DocenteService();
          
          capaService.ModificarDocente(recuAl);
          
          //Enviar el usuario a la pagina principal 
          
          response.sendRedirect("DocentesSelect.jsp"); 
      }catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }
      
       
    }

 

}
