<%@page import="com.colegio.models.Especialidad"%>
<%@page import="com.colegio.services.EspecialidadService"%>
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

        <h1>Especialidads</h1>

        <p>
            <a href="EspecialidadesInsert.jsp">Ingresar Nuevo Especialidad</a>
        </p>

        <table border="1" class="tabla-datos">
            <thead>
                <tr>
                    <th>Id Especialidad</th>
                    <th>Nombre</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>

            <tbody id="tabla_body" runat="server">

                <%
                    EspecialidadService capaServicio = new EspecialidadService();

                    ArrayList<Especialidad> list = capaServicio.ConsultarEspecialidades();

                    for (int i = 0; i < list.size(); i++) {

                        Especialidad a = list.get(i);
                %>
                <tr>
                    <td><%= a.getIdEspecialidad()%></td>
                    <td><%= a.getNomEspecialidad()%></td>
                   
                    <td><a href="EspecialidadesUpdate.jsp?Id=<%= a.getIdEspecialidad()%>">Actualizar</a></td>
                    <td><a href="EspecialidadesDeleteServlet?Id=<%= a.getIdEspecialidad()%>">Elimninar</a></td>
                    
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
