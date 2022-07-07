<%@page import="com.colegio.models.Curso"%>
<%@page import="com.colegio.services.CursoService"%>
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

        <h1>Cursos</h1>

        <p>
            <a href="CursosInsert.jsp">Ingresar Nuevo Curso</a>
        </p>

        <table border="1" class="tabla-datos">
            <thead>
                <tr>
                    <th>Id Curso</th>
                    <th>Nombre</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>

            <tbody id="tabla_body" runat="server">

                <%
                    CursoService capaServicio = new CursoService();

                    ArrayList<Curso> list = capaServicio.ConsultarCursos();

                    for (int i = 0; i < list.size(); i++) {

                        Curso a = list.get(i);
                %>
                <tr>
                    <td><%= a.getIdCurso()%></td>
                    <td><%= a.getNomCurso()%></td>
                   
                    <td><a href="CursosUpdate.jsp?Id=<%= a.getIdCurso()%>">Actualizar</a></td>
                    <td><a href="CursosDeleteServlet?Id=<%= a.getIdCurso()%>">Elimninar</a></td>
                    
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
