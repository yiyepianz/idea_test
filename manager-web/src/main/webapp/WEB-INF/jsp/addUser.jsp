<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-12-6
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="username"/><br/>
        年龄：<input type="text"  name="userage"><br/>
        <<input type="submit" value="OKOK">
    </form>
</body>
</html>
