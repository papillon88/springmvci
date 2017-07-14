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
    <title>Title</title>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>


<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="offer">
    <table class="formtable">
        <tr>
            <td class="label">Name</td>
            <td><sf:input class="control" path="name" name="name" type="text"/><br><sf:errors path="name" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label">Email</td>
            <td><sf:input class="control" path="email" name="email" type="text"/><br><sf:errors path="email" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label">Your Offer</td>
            <td><sf:textarea class="control" path="text" name="text" rows="10" cols="18"></sf:textarea><br><sf:errors path="text" cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Submit" type="submit"/></td>
            <td><p><a href="${pageContext.request.contextPath}/logout">Logout</a></p></td>
        </tr>
    </table>
</sf:form>

</body>
</html>
