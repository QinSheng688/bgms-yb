<%--
  Created by IntelliJ IDEA.
  User: 秦向阳
  Date: 2023/6/3
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/utils/tools.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>

<script>
    onload=function (){
        location.href="${ctx}/api/menu/showMenuTree"
    }
</script>
</html>
