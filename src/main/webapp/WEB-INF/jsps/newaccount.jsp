<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 5/17/2017
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Create Acc</title>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>


<sf:form method="post" action="${pageContext.request.contextPath}/createaccount" commandName="user">
    <table class="formtable">
        <tr>
            <td class="label">Username</td>
            <td><sf:input class="control" path="username" name="username" type="text"/><br><sf:errors path="username"
                                                                                              cssClass="error"></sf:errors>
            </td>
        </tr>
        <tr>
            <td class="label">Email</td>
            <td><sf:input class="control" path="email" name="email" type="text"/><br><sf:errors path="email"
                                                                                                cssClass="error"></sf:errors>
            </td>
        </tr>
        <tr>
            <td class="label">Password</td>
            <td><sf:input class="control" path="password" name="password" type="text"/><br><sf:errors path="password"
                                                                                                cssClass="error"></sf:errors>
            </td>
        </tr>
        <tr>
            <td class="label">Confirm Password</td>
            <td><input class="control" name="confirmpass" type="text"/><br></td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Create Account" type="submit"/></td>
        </tr>
    </table>
</sf:form>

</body>
</html>
