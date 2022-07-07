
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


@WebServlet(name = "EspecialidadesInsertServlet", urlPatterns = {"/EspecialidadesInsertServlet"})
public class EspecialidadesInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Especialidad a = new Especialidad();
            
            
           
            a.setNomEspecialidad(request.getParameter("Nom_Especialidad"));
            a.setIdEspecialidad(request.getParameter("Id_Especialidad"));
            
            EspecialidadService capaServicio= new EspecialidadService();
            
            capaServicio.GuardarEspecialidad(a);
            
            response.sendRedirect("EspecialidadesSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
