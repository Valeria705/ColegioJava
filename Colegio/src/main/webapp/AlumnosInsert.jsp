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
        <h1>Ingresar Nuevo Alumno</h1>
        <form method="post" action="AlumnosInsertServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Alumno: </td>
                    <td><input name="Id_Alumno" type="text" id="Id_Alumno" /></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Alumno" type="text" id="Nom_Alumno" /></td>
                </tr>
                                <tr>
                    <td>Direccion: </td>
                    <td><input name="Dir_Alumno" type="text" id="Dir_Alumno" /></td>
                </tr>
                <tr>
                    <td>Telefono </td>
                    <td><input name="Tel_Alumno" type="text" id="Tel_Alumno" /></td>
                </tr>
                <tr>
                    <td>Grupo </td>
                    <td><input name="Grp_Alumno" type="text" id="Grp_Alumno" /></td>
                </tr>
                
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
