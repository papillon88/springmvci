<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 5/17/2017
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>


<form method="post" action="${pageContext.request.contextPath}/docreate">

    <table class="formtable">
        <tr><td class="label">Name</td><td><input name="name" type="text"/></td></tr>
        <tr><td class="label">Email</td><td><input name="email" type="text"/></td></tr>
        <tr><td class="label">Your Offer</td><td><textarea name="text" rows="10" cols="18"></textarea></td></tr>
        <tr><td class="label"></td><td><input value="Submit" type="submit"/></td></tr>
    </table>


</form>

</body>
</html>
