<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 5/17/2017
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/css/table.css" rel="stylesheet" type="text/css"/>
</head>
<body>--%>

<table>
    <tr><th>Id</th><th>Name</th><th>Email</th><th>Text</th></tr>
    <c:forEach var="row" items="${offers}">
    <%--Id ${row.id}
    Name ${row.name}
    Email ${row.email}
    Text ${row.text}<br/>--%>
        <tr>
            <td><c:out value="${row.id}"></c:out></td>
            <td><c:out value="${row.name}"></c:out></td>
            <td><c:out value="${row.email}"></c:out></td>
            <td><c:out value="${row.text}"></c:out></td>
        </tr>
    </c:forEach>
</table>

<%--</body>
</html>--%>
