<%@ page import="java.util.List" %>
<%@ page import="com.yao.userAPI.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: litongtong
  Date: 2018/7/30
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> list = (List<User>) request.getAttribute("list");
    for (User user : list){
%>
        <%=user+"<br/><br/>"%>
<%
    }
%>
</body>
</html>
