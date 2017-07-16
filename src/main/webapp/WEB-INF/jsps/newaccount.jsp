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
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        function onLoad() {
            $("#pass").keyup(onLoad2);
            $("#cpass").keyup(onLoad2);
            $("#details").submit(canSubmit);
        }
        function canSubmit(){
            var pass = $("#pass").val();
            var cpass = $("#cpass").val();
            if(pass!=cpass)
                return false;
            else
                return true;
        }
        function onLoad2() {
            var pass = $("#pass").val();
            var cpass = $("#cpass").val();
            if(pass.length > 3 || cpass.length > 3){
                if(pass==cpass){
                    $("#matchmsg").text("Passwords match");
                    $("#matchmsg").addClass("valid");
                    $("#matchmsg").removeClass("error");
                } else {
                    $("#matchmsg").text("Passwords dont match");
                    $("#matchmsg").addClass("error");
                    $("#matchmsg").removeClass("valid");
                }
            }
        }
        $(document).ready(onLoad);
    </script>
</head>
<body>


<sf:form id="details" method="post" action="${pageContext.request.contextPath}/createaccount" commandName="user">
    <table class="formtable">
        <tr>
            <td class="label">Username</td>
            <td><sf:input class="control" path="username" name="username" type="text"/><br/>
            <div class="error"><sf:errors path="username"></sf:errors></div></td>
        </tr>
        <tr>
            <td class="label">Email</td>
            <td><sf:input class="control" path="email" name="email" type="text"/><br/>
            <div class="error"><sf:errors path="email"></sf:errors></div></td>
        </tr>
        <tr>
            <td class="label">Password</td>
            <td><sf:input id="pass" class="control" path="password" name="password" type="password"/><br/>
            <div class="error"><sf:errors path="password"></sf:errors></div></td>
        </tr>
        <tr>
            <td class="label">Confirm Password</td>
            <td><input id="cpass" class="control" name="confirmpass" type="password"/><div id="matchmsg"></div></td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Create Account" type="submit"/></td>
        </tr>
    </table>
</sf:form>

</body>
</html>
