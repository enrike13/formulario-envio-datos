<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3 style="text-align: center">Datos Ingresados</h3>
        <table style="margin: auto">
            <tr>
                <td>nombre</td>
                <td>${nombre}</td>
            </tr>
            <tr>
                <td>genero</td>
                <td>${genero}</td>
            </tr>
            <tr>
                <td>estudios</td>
                <td>${estudios}</td>
            </tr>
            <tr>
                <td>deportes</td>
                <td>${deportes}</td>
            </tr>
            <tr>
                <td>pasatiempos</td>
                <td>${pasatiempos}</td>
            </tr>
        </table>

        <p style="text-align: center">
            <a href="index.html">Volver</a>
        </p>
    </body>
</html>
