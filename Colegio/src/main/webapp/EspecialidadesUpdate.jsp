<%@page import="com.colegio.models.Especialidad"%>
<%@page import="com.colegio.services.EspecialidadService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    EspecialidadService capaServicio = new EspecialidadService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Especialidad RecuEspecialidad= capaServicio.ConsultarEspecialidad(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Especialidad</h1>
        <form method="post" action="EspecialidadesUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Especialidad: </td>
                    <td><input name="Id_Especialidad" type="text" id="Id_Especialidad" readonly value="<%=RecuEspecialidad.getIdEspecialidad()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Especialidad" type="text" id="Nom_Especialidad" value="<%=RecuEspecialidad.getNomEspecialidad()%>" /></td>
                </tr>
            
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
