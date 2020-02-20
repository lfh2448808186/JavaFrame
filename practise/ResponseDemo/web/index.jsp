<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="lfh.User" %><%--
  Created by IntelliJ IDEA.
  User: LFH
  Date: 2019/11/1
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>注册界面</title>
  </head>
  <body>
  <%
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list",list);
    Map map = new HashMap();
    User user = new User();

    map.put("sname","李四");
    map.put("gender","男");
    map.put("user",user);
    request.setAttribute("map",map);
  %>
  <form action="/responseDemo1" method="register">
    <input type="text">
    <input type="submit" value="提交">
  </form>
  <p>${list}</p><br>
  <p>${list[0]}</p><br>
  <p>${list[1]}</p><br>
  <p>${list[2]}</p><br>

  <p>${map}</p><br>
  <p>${map.sname}</p> <br>
  <p>${map.gender}</p><br>
  <p>${map.user.name}</p>

  <p></p>
  </body>
</html>
