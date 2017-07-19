<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 7/18/2017
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="isAuthenticated()">
    <form method="post" action="${pageContext.request.contextPath}/logout">
        <input name="submit" type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
</sec:authorize>

<sec:authorize access="!isAuthenticated()">
    <p><a href="${pageContext.request.contextPath}/login">Login</a></p>
</sec:authorize>
