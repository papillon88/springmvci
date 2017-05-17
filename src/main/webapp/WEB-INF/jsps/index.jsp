<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 4/2/2017
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  Hello World !<br>
  Session : <%=session.getAttribute("name")%><br>
  Request : <%=request.getAttribute("name")%><br>
  Request (using EL) : ${name}<br>
  Request (using JSTL) :<c:out value="${name}"></c:out><br>




  <sql:query var="rs" dataSource="jdbc/spring">
    select * from offers
  </sql:query>

  <c:forEach var="row" items="${rs.rows}">
    Id ${row.id}<br/>
    Name ${row.name}<br/>
    Email ${row.email}<br/>
    Text ${row.text}<br/>
  </c:forEach>

  </body>
</html>
