/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

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

/**
 *
 * @author valer
 */
@WebServlet(name = "AlumnosDeleteServlet", urlPatterns = {"/AlumnosDeleteServlet"})
public class AlumnosDeleteServlet extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            String Id= request.getParameter("Id");
            
            AlumnoService capaService= new AlumnoService();
            
            capaService.EliminarAlumno(Id);
            
            response.sendRedirect("AlumnosSelect.jsp"); 
        } catch (Exception ex) {
            System.err.println("Got an exception! "); 
            System.err.println(ex.getMessage()); 
            throw new ServletException(ex.toString());
        }
       
       
       
    }

   
  
}
