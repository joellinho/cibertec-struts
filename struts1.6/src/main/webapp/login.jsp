<%-- 
    Document   : paso1
    Created on : 11/07/2016, 03:29:55 PM
    Author     : admin-joel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login1</h1>
        <form action="login" method="post">
            <table>
                <tr>
                    <td>Usuario:</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <td>Password</td>
                <td><input type="password" name="password"/></td>
                <td><input type="submit" value="Ingresar"/></td>
            </table>
           

        </form>
    </body>
</html>
