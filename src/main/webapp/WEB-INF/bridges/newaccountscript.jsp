<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 7/18/2017
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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