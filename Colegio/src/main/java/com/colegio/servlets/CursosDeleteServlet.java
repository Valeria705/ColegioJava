/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.colegio.servlets;

import com.colegio.services.CursoService;
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
@WebServlet(name = "CursosDeleteServlet", urlPatterns = {"/CursosDeleteServlet"})
public class CursosDeleteServlet extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            String Id= request.getParameter("Id");
            
            CursoService capaService= new CursoService();
            
            capaService.EliminarCurso(Id);
            
            response.sendRedirect("CursosSelect.jsp"); 
        } catch (Exception ex) {
            System.err.println("Got an exception! "); 
            System.err.println(ex); 
            throw new ServletException(ex);
        }
       
       
       
    }

   
  
}
