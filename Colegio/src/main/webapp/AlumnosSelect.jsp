<%@page import="java.util.ArrayList"%>
<%@page import="com.colegio.models.Alumno"%>
<%@page import="com.colegio.services.AlumnoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title></title>
    </head>
    <body>

        <h1>Alumnos</h1>

        <p>
            <a href="AlumnosInsert.jsp">Ingresar Nuevo Alumno</a>
        </p>

        <table border="1" class="tabla-datos">
            <thead>
                <tr>
                    <th>Id Alumno</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Grupo</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>

            <tbody id="tabla_body" runat="server">

                <%
                    AlumnoService capaServicio = new AlumnoService();

                    ArrayList<Alumno> list = capaServicio.ConsultarAlumnos();

                    for (int i = 0; i < list.size(); i++) {

                        Alumno a = list.get(i);
                %>
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getNombre()%></td>
                    <td><%= a.getDireccion()%></td>
                    <td><%= a.getTelefono()%></td>
                    <td><%= a.getGrupo()%></td>
                    <td><a href="AlumnosUpdate.jsp?Id=<%= a.getId()%>">Actualizar</a></td>
                    <td><a href="AlumnosDeleteServlet?Id=<%= a.getId()%>">Elimninar</a></td>
                    
                </tr>
                <%
                    }
                %>

            </tbody>

        </table>


        <p>
            <a href="index.jsp">Volver al Inicio</a>
        </p>

    </body>
</html>
