<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 7/12/2017
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body onload='document.f.username.focus();'>
<h3>Login with Username and Password</h3>
<c:if test="${param.error != null}">
    <p class="error">Bad Credentials</p>
</c:if>
<form name='f' action='${pageContext.request.contextPath}/login' method='post'>
    <table class="formtable">
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td>Remember me:</td>
            <td><input type='checkbox' name='remember_me' checked="checked"/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Login"/></td>
            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
        </tr>
        <tr>
            <td><p><a href="${pageContext.request.contextPath}/newaccount"/>Create new Account</p></td>
        </tr>
    </table>
</form>
</body>
</html>
