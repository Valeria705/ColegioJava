<%@page import="com.colegio.models.Alumno"%>
<%@page import="com.colegio.services.AlumnoService"%>
<% 
// Recuperar variable ID
    String RecuId =request.getParameter("Id"); 

// Crear instancia de la capa de servicios
    AlumnoService capaServicio = new AlumnoService();
       
// Atraves de la capa de servicios recuperar el alumno por el Id del primer paso
    Alumno RecuAlumno= capaServicio.ConsultarAlumno(RecuId);
    

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar Alumno</h1>
        <form method="post" action="AlumnosUpdateServlet" id="form1">
            <table border="1">
                <tr>
                    <td>Id Alumno: </td>
                    <td><input name="Id_Alumno" type="text" id="Id_Alumno" readonly value="<%=RecuAlumno.getId()%>"/></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input name="Nom_Alumno" type="text" id="Nom_Alumno" value="<%=RecuAlumno.getNombre()%>" /></td>
                </tr>
                <tr>
                    <td>Dirección: </td>
                    <td><input name="Dir_Alumno" type="text" id="Dir_Alumno" value="<%=RecuAlumno.getDireccion()%>"/></td>
                </tr>
                <tr>
                    <td>Telefono: </td>
                    <td><input name="Tel_Alumno" type="text" id="Tel_Alumno" value="<%=RecuAlumno.getTelefono()%>"/></td>
                </tr>
                <tr>
                    <td>Grupo: </td>
                    <td><input name="Grp_Alumno" type="text" id="Grp_Alumno" value="<%=RecuAlumno.getGrupo()%>"/></td>
                </tr>
            </table>

            <input type="submit" name="Button1" value="Guardar Nuevo" id="Button1" />

        </form>
    </body>
</html>
