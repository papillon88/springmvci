<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 5/17/2017
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="row" items="${offers}">
    <%--Id ${row.id}
    Name ${row.name}
    Email ${row.email}
    Text ${row.text}<br/>--%>
    <c:out value="${row}"></c:out><br>
</c:forEach>

</body>
</html>
