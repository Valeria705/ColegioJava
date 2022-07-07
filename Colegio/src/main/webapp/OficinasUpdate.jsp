<%@page import="com.colegio.models.Oficina"%>
<%@page import="com.colegio.services.OficinaService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    OficinaService capaServicio = new OficinaService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Oficina RecuOficina= capaServicio.ConsultarOficina(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Oficina</h1>
        <form method="post" action="OficinasUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Oficina: </td>
                    <td><input name="Id_Oficina" type="text" id="Id_Oficina" readonly value="<%=RecuOficina.getId()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Oficina" type="text" id="Nom_Oficina" value="<%=RecuOficina.getNombre()%>" /></td>
                </tr>
              
                <tr>
                    <td>Telefono: </td>
                    <td><input name="Tel_Oficina" type="text" id="Tel_Oficina" value="<%=RecuOficina.getTelefono()%>"/></td>
                </tr>
                
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
