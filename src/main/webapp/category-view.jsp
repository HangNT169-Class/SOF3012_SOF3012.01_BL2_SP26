<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 13/3/26
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select>
    <c:forEach items="${listCate}" var="a">
        <option>${a.name}</option>
    </c:forEach>
</select>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Cate code</th>
        <th>Cate name</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <%--    for(Doi tuong : lists)--%>
    <%--  items => danh sach var: 1 object  --%>
    <c:forEach items="${listCate}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.code}</td>
            <td>${a.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
