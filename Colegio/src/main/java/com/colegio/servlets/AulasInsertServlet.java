
package com.colegio.servlets;

import com.colegio.models.Aula;
import com.colegio.services.AulaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AulasInsertServlet", urlPatterns = {"/AulasInsertServlet"})
public class AulasInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Aula a = new Aula();
            
            
           
            a.setNomAula(request.getParameter("Nom_Aula"));
            a.setIdAula(request.getParameter("Id_Aula"));
            
            AulaService capaServicio= new AulaService();
            
            capaServicio.GuardarAula(a);
            
            response.sendRedirect("AulasSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
