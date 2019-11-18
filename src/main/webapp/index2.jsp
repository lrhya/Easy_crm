<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:forward page="/emps"></jsp:forward>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>

    <!-- web路径： 不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
      以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名 http://localhost:3306/crud   -->
    <!-- 引入jquery -->
    <script type="text/javascript" src="/static/js/jquery-1.12.4.min.js"></script>
    <!--引入样式-->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
    <!-- Indicates a dangerous or potentially negative action -->
    <button type="button" class="btn btn-danger">（危险）Danger</button>
    <!-- Indicates a successful or positive action -->
    <button type="button" class="btn btn-success">（成功）Success</button>

</body>
</html>

