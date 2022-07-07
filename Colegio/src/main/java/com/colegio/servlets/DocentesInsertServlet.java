
package com.colegio.servlets;

import com.colegio.models.Docente;
import com.colegio.services.DocenteService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DocentesInsertServlet", urlPatterns = {"/DocentesInsertServlet"})
public class DocentesInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Docente a = new Docente();
            
            a.setDireccion(request.getParameter("Dire_Docente"));
            a.setNombre(request.getParameter("Nom_Docente"));
            a.setTelefono(request.getParameter("Tel_Docente"));
            a.setId(request.getParameter("ID_Docente"));
            
            DocenteService capaServicio= new DocenteService();
            
            capaServicio.GuardarDocente(a);
            
            response.sendRedirect("DocentesSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
