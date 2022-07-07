
package com.colegio.servlets;

import com.colegio.models.Curso;
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


@WebServlet(name = "CursosInsertServlet", urlPatterns = {"/CursosInsertServlet"})
public class CursosInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Curso a = new Curso();
            
            
           
            a.setNomCurso(request.getParameter("Nom_Curso"));
            a.setIdCurso(request.getParameter("Id_Curso"));
            
            CursoService capaServicio= new CursoService();
            
            capaServicio.GuardarCurso(a);
            
            response.sendRedirect("CursosSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
