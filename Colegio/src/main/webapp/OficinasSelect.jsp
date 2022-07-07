<%@page import="java.util.ArrayList"%>
<%@page import="com.colegio.models.Oficina"%>
<%@page import="com.colegio.services.OficinaService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title></title>
    </head>
    <body>

        <h1>Oficinas</h1>

        <p>
            <a href="OficinasInsert.jsp">Ingresar Nuevo Oficina</a>
        </p>

        <table border="1" class="tabla-datos">
            <thead>
                <tr>
                    <th>Id Oficina</th>
                    <th>Nombre</th>
                    <th>Telefono</th>
                   
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>

            <tbody id="tabla_body" runat="server">

                <%
                    OficinaService capaServicio = new OficinaService();

                    ArrayList<Oficina> list = capaServicio.ConsultarOficinas();

                    for (int i = 0; i < list.size(); i++) {

                        Oficina a = list.get(i);
                %>
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getNombre()%></td>
                    <td><%= a.getTelefono()%></td>
                    
                    <td><a href="OficinasUpdate.jsp?Id=<%= a.getId()%>">Actualizar</a></td>
                    <td><a href="OficinasDeleteServlet?Id=<%= a.getId()%>">Elimninar</a></td>
                    
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
