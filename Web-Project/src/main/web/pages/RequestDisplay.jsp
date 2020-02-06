<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: benjaminp
  Date: 06/02/2020
  Time: 14.19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Dispaly</title>
</head>
<body>
    <table>
        <tc>
            <th>Header</th>
            <th>Value</th>
        </tc>
        <c:forEach var="i" begin="0" end="${requestScope.names.size()-1}" step="1">
            <tr>
                <td>${requestScope.names.get(i)}</td>
                <td>${requestScope.values.get(i)}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
