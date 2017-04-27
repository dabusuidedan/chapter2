<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/27
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>人员编辑</title>
</head>
<body>
<h1>人员编辑界面</h1>
<form action="${BASE}/customer_update?id=${customer.id}" method="post">
   课题组 <input type="text" name="name" value="${customer.name}">
   联系人 <input type="text" name="contact" value="${customer.contact}">
   电话 <input type="text" name="telephone" value="${customer.telephone}">
   邮箱 <input type="text" name="email" value="${customer.email}">
   备注 <input type="text" name="remark" value="${customer.remark}">
<input type="submit" value="更改">
</form>

</body>
</html>
