<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 4/2/2017
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<%--<html>
  <head>
    <title>Index</title>
  </head>
  <body>--%>
  <%--Session : <%=session.getAttribute("name")%><br>
  Request : <%=request.getAttribute("name")%><br>
  Request (using EL) : ${name}<br>
  Request (using JSTL) :<c:out value="${name}"></c:out><br>

  <sql:query var="rs" dataSource="jdbc/spring">
    select * from offers
  </sql:query>--%>

  <a href="${pageContext.request.contextPath}/offers">Show Offers</a><br><br><br>
  <a href="${pageContext.request.contextPath}/createoffer">Create Offer</a>

  <sec:authorize access="isAuthenticated()">
    <form method="post" action="${pageContext.request.contextPath}/logout">
      <input name="submit" type="submit" value="Logout"/>
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
  </sec:authorize>
<%--
  <sec:authorize access="!isAuthenticated()">
    <p><a href="${pageContext.request.contextPath}/login">Login</a></p>
  </sec:authorize>--%>

  <sec:authorize access="hasRole('ROLE_ADMIN')">
    <p><a href="${pageContext.request.contextPath}/admin">Admin</a></p>
  </sec:authorize>

<%--
  </body>
</html>
--%>
