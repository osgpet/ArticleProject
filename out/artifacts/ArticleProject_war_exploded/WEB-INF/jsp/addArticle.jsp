<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2016/2/19
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="../js/init.js"/>
    <title>添加文章</title>
</head>
<body   onload="fillDate()">
<form action="/article/add"  method="post">
    标题：<input type="text" name="title"/><br>
    出版时间：<input type="text" name="publish_date" /><br>
    文章类型：<input type="text" name="article_type"/><br>
    作者名字：<input type="text" name="author_name"/><br>
    来源方：<input type="text" name="source_name"/><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
