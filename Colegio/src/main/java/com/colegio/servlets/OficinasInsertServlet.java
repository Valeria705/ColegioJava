
package com.colegio.servlets;

import com.colegio.models.Oficina;
import com.colegio.services.OficinaService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "OficinasInsertServlet", urlPatterns = {"/OficinasInsertServlet"})
public class OficinasInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Oficina a = new Oficina();
            
           
            a.setNombre(request.getParameter("Nom_Oficina"));
            a.setTelefono(request.getParameter("Tel_Oficina"));
            a.setId(request.getParameter("Id_Oficina"));
            
            OficinaService capaServicio= new OficinaService();
            
            capaServicio.GuardarOficina(a);
            
            response.sendRedirect("OficinasSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
