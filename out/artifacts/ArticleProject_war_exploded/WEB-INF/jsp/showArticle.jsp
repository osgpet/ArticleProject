<%--
 Author:beyondboy
 Gmail:xuguoli.scau@gmail.com
 Date: 2016/2/22
 Time: 9:45 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../css/article.css" rel="stylesheet" type="text/css"/>
    <script src="../js/jquery-2.2.0.min.js"></script>
    <script src="../js/jsonData.js"></script>
    <title>显示文章</title>
</head>
<body class="/aritcle/getAllArticle">
<form name="query" method="get" action="/aritcle/getAllArticle">
    搜索框：<input type="text" placeholder="输入回车搜索">
    <select  onchange="this.parentNode.nextSibling.value=this.value">
        <option value="文章序号">文章序号</option>
        <option value="标题">标题</option>
        <option value="出版时间">出版时间</option>
        <option value="文章类型">文章类型</option>
        <option value="作者名字">作者名字</option>
        <option value="来源方">来源放</option>
    </select>
</form>
<div id="dataTable">

</div>
</body>
</html>
