<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 7/18/2017
  Time: 9:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/jquery-3.2.1.min.js"></script>
    <title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
</head>
<body>

<div>
    <tiles:insertAttribute name="header"></tiles:insertAttribute>
</div>

<div>
    <tiles:insertAttribute name="content"></tiles:insertAttribute>
</div>

<hr/>
<div class="footer">
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
</div>

</body>
</html>
