<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/27
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>人员管理—创建人员</title>
</head>
<body>
<h1>创建人员界面</h1>
<form action="${BASE}/customer_add" method="post">

    <p>课题组<input type="text" name="name"></p>
    <p>联系人<input type="text" name="contact"></p>
    <p>电话<input type="text" name="telephone"></p>
    <p>邮箱<input type="text" name="email"></p>
    <p>备注<input type="text" name="remark"></p>
    <input type="submit" value="新增">

</form>
</body>
</html>
