<%@page import="com.colegio.models.Curso"%>
<%@page import="com.colegio.services.CursoService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    CursoService capaServicio = new CursoService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Curso RecuCurso= capaServicio.ConsultarCurso(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Curso</h1>
        <form method="post" action="CursosUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Curso: </td>
                    <td><input name="Id_Curso" type="text" id="Id_Curso" readonly value="<%=RecuCurso.getIdCurso()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Curso" type="text" id="Nom_Curso" value="<%=RecuCurso.getNomCurso()%>" /></td>
                </tr>
            
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
