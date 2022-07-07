<%-- 
    Document   : EspecialidadsInsert
    Created on : 15 jun 2022, 20:32:27
    Author     : valer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingresar Nuevo Especialidad</h1>
        <form method="post" action="EspecialidadesInsertServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Especialidad: </td>
                    <td><input name="Id_Especialidad" type="text" id="Id_Especialidad" /></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Especialidad" type="text" id="Nom_Especialidad" /></td>
                </tr>
               
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
