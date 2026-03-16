<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 16/3/26
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select>
    <c:forEach items="${listCate}" var="c">
        <option>${c.code}</option>
    </c:forEach>
</select>
<table>
    <thead>
    <tr>
        <th>P.ID</th>
        <th>P.Code</th>
        <th>P.Name</th>
        <th>P.Price</th>
        <th>Cate Code</th>
        <th>Cate Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listProduct}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.productCode}</td>
            <td>${p.productName}</td>
            <td>${p.price}</td>
            <td>${p.cate.code}</td>
            <td>${p.cate.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
