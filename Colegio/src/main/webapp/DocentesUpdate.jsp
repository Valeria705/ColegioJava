<%@page import="com.colegio.models.Docente"%>
<%@page import="com.colegio.services.DocenteService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    DocenteService capaServicio = new DocenteService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Docente RecuDocente= capaServicio.ConsultarDocente(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Docente</h1>
        <form method="post" action="DocentesUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Docente: </td>
                    <td><input name="ID_Docente" type="text" id="Id_Docente" readonly value="<%=RecuDocente.getId()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Docente" type="text" id="Nom_Docente" value="<%=RecuDocente.getNombre()%>" /></td>
                </tr>
                <tr>
                    <td>Dirección: </td>
                    <td><input name="Dire_Docente" type="text" id="Dir_Docente" value="<%=RecuDocente.getDireccion()%>"/></td>
                </tr>
                <tr>
                    <td>Telefono: </td>
                    <td><input name="Tel_Docente" type="text" id="Tel_Docente" value="<%=RecuDocente.getTelefono()%>"/></td>
                </tr>
                
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
