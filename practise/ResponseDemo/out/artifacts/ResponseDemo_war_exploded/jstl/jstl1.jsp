<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: LFH
  Date: 2019/11/1
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add("hello");
        list.add("nice");
        request.setAttribute("list",list);
        request.setAttribute("number",1);
    %>
    <c:if test="true">
        <h1>Hellp</h1>
    </c:if> <br>
    <c:if test="${not empty list}">
        遍历集合
    </c:if> <br>
    <c:if test="${number % 2 == 0}">
        ${number}是偶数${number}
    </c:if>

    <c:choose>
        <c:when test="${number==1}"></c:when>
    </c:choose>
</body>
</html>
