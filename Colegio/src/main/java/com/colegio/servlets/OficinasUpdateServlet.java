/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

import com.colegio.models.Oficina;
import com.colegio.services.OficinaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "OficinasUpdateServlet", urlPatterns = {"/OficinasUpdateServlet"})
public class OficinasUpdateServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {
          //Recuperar el alumno que viene del formulario
          Oficina recuAl= new Oficina();
          
          recuAl.setId(request.getParameter("Id_Oficina"));
          recuAl.setNombre(request.getParameter("Nom_Oficina"));
          recuAl.setTelefono(request.getParameter("Tel_Oficina"));
          
          
          //Modificar alumno a traves de la capa de servicios y datos
          
          OficinaService capaService= new OficinaService();
          
          capaService.ModificarOficina(recuAl);
          
          //Enviar el usuario a la pagina principal 
          
          response.sendRedirect("OficinasSelect.jsp"); 
      }catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }
      
       
    }

 

}
