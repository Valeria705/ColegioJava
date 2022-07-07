<%@page import="com.colegio.models.Aula"%>
<%@page import="com.colegio.services.AulaService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    AulaService capaServicio = new AulaService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Aula RecuAula= capaServicio.ConsultarAula(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Aula</h1>
        <form method="post" action="AulasUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Aula: </td>
                    <td><input name="Id_Aula" type="text" id="Id_Aula" readonly value="<%=RecuAula.getIdAula()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Aula" type="text" id="Nom_Aula" value="<%=RecuAula.getNomAula()%>" /></td>
                </tr>
            
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
