<%@page import="com.colegio.models.Aula"%>
<%@page import="com.colegio.services.AulaService"%>
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

        <h1>Aulas</h1>

        <p>
            <a href="AulasInsert.jsp">Ingresar Nuevo Aula</a>
        </p>

        <table border="1" class="tabla-datos">
            <thead>
                <tr>
                    <th>Id Aula</th>
                    <th>Nombre</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>

            <tbody id="tabla_body" runat="server">

                <%
                    AulaService capaServicio = new AulaService();

                    ArrayList<Aula> list = capaServicio.ConsultarAulas();

                    for (int i = 0; i < list.size(); i++) {

                        Aula a = list.get(i);
                %>
                <tr>
                    <td><%= a.getIdAula()%></td>
                    <td><%= a.getNomAula()%></td>
                   
                    <td><a href="AulasUpdate.jsp?Id=<%= a.getIdAula()%>">Actualizar</a></td>
                    <td><a href="AulasDeleteServlet?Id=<%= a.getIdAula()%>">Elimninar</a></td>
                    
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
