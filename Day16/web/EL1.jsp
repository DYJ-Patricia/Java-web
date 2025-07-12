<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2025/5/21
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL1</title>
</head>
<body>
<%
    User user=new User();
    user.setAge(19);
    user.setName("zhangsan");
    user.setBirthday(new Date());
    request.setAttribute("user", user);

    List list=new ArrayList();
    list.add("zhangsan");
    list.add("lisi");
    list.add(user.getAge());
    request.setAttribute("list", list);

    Map map=new HashMap();
    map.put("name", "zhangsan");
    request.setAttribute("map", map);
%>
<h1>EL1</h1>

    ${requestScope.user.age}
    <br>
    ${user.name}<br>
    ${user.birthday}<br>
    ${user.birstr}<br>
    ${list[0]}<br>
    ${list}<br>

    ${map['name']}<br>
    ${map.name}<br>

    ${empty map}<br>
    ${not empty map}<br>

    ${pageContext.request.contextPath}<br>
</body>
</html>
