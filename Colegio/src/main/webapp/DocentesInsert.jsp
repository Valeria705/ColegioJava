<%-- 
    Document   : CursosInsert
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
        <h1>Ingresar Nuevo Docente</h1>
        <form method="post" action="DocentesInsertServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Docente: </td>
                    <td><input name="ID_Docente" type="text" id="Id_Docente" /></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Docente" type="text" id="Nom_Docente" /></td>
                </tr>
                                <tr>
                    <td>Direccion: </td>
                    <td><input name="Dire_Docente" type="text" id="Dir_Docente" /></td>
                </tr>
                <tr>
                    <td>Telefono </td>
                    <td><input name="Tel_Docente" type="text" id="Tel_Docente" /></td>
                </tr>
               
                
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
