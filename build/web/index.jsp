
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>



        EL : Expression Language <br>
        <table border="1">
            <thead>
                <tr>
                    <th>FullName</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>Email</th>
                    <th>Phone</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var = "i" items="${requestScope.listStd}">
                    <tr>
                        <td>${ i.getFullName()}</td>
                        <td>${ i.getGender()}</td>
                        <td>${ i.getDob()}</td>
                        <td>${ i.getEmail()}</td>
                        <td>${ i.getPhone()}</td>
                    </tr>
                </c:forEach>   

            </tbody>
        </table>










    </body>
</html>
