<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/27
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>人员管理</title>
</head>
<body>
<h1>人员管理</h1>
<a href="${BASE}/customer_create">添加联系人</a>
<form action="${BASE}/customer_show" method="post">
    <input type="text" name="search">
    <input type="submit" value="查询联系人">
</form>

<table>
    <tr>
        <th>课题老师</th>
<th>联系人</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
        <th>操作</th>
    </tr>
<c:forEach var="customer" items="${customerList}">
<tr>
    <td>${customer.name}</td>
    <td>${customer.contact}</td>
    <td>${customer.telephone}</td>
    <td>${customer.email}</td>
    <td>
        <a href="${BASE}/customer_edit?id=${customer.id}">编辑</a>
        <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>
    </td>
</tr>
</c:forEach>
</table>
</body>
</html>
