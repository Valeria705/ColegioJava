
package com.colegio.servlets;

import com.colegio.models.Alumno;
import com.colegio.services.AlumnoService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AlumnosInsertServlet", urlPatterns = {"/AlumnosInsertServlet"})
public class AlumnosInsertServlet extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
       
        
        try {
            //Captura de campos del formulario desde la pantalla del cliente
            Alumno a = new Alumno();
            
            a.setDireccion(request.getParameter("Dir_Alumno"));
            a.setGrupo(request.getParameter("Grp_Alumno"));
            a.setNombre(request.getParameter("Nom_Alumno"));
            a.setTelefono(request.getParameter("Tel_Alumno"));
            a.setId(request.getParameter("Id_Alumno"));
            
            AlumnoService capaServicio= new AlumnoService();
            
            capaServicio.GuardarAlumno(a);
            
            response.sendRedirect("AlumnosSelect.jsp"); 
            
        } catch (Exception e) {
            
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw new ServletException(e.toString());
            
        }

          
          
        
    }

}
