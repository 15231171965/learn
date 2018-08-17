<%@ page import="com.yao.userAPI.entity.DoMainURL" %><%--
  Created by IntelliJ IDEA.
  User: litongtong
  Date: 2018/8/13
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String doMain = DoMainURL.doMainUrl;
%>
<html>
<head>
    <title>Title</title>
    <script src="<%=doMain%>/resources/jslib/jq/jquery-1.9.1.min.js"></script>
</head>
<body>
    账户:<input id="userName" type="text"/>
    密码:<input id="passWord" type="password"/>
    <input id="doLogin" onclick="dologin()" type="button">
<script type="text/javascript">
    var domain = "<%=doMain%>"
    $(function () {

    })
    function dologin() {
        var userName = $("#userName").val();
        var passWord = $("#passWord").val();
        $.ajax({
            type:"POST",
            url:domain+"/doLogin",
            data:{
                userName:userName,
                passWord:passWord
            },
            success:function(data){
                if(data == "true"){
                    window.location.href = domain +"/userInfo.html";
                }
                //加载数据
              alert(data)
            }
        })
    }
</script>
</body>
</html>
