<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="lfh.User" %><%--
  Created by IntelliJ IDEA.
  User: LFH
  Date: 2019/11/2
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl2</title>
</head>
<body>
<%
    List list  = new ArrayList();
    list.add("hello");
    list.add("world");
    request.setAttribute("list",list);

    List list1 = new ArrayList();


    list1.add(new User("张三",18));
    list1.add(new User("李四",22));
    list1.add(new User("王麻子",38));
    request.setAttribute("list1",list1);


    List<User> list2 = new ArrayList<>();
    User user = new User();
    User user1 = new User();
    user.setName("张三");
    user.setAge(18);
    user1.setName("李四");
    user1.setAge(30);
    list2.add(user);
    list2.add(user1);
    request.setAttribute("list2",list2);
%>
<a href="../index.jsp">回到首页</a>
<div>
    <table border="1" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${list1}" var="user" varStatus="s">
            <tr align="center">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>

    </table>

    <table border="1" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${list2}" var="user" varStatus="s">
            <tr align="center">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>

    </table>


</div>

</body>
</html>
