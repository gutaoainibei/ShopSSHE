<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
 <a href="${pageContext.request.contextPath}/usershop/testaction!test.action?id=1&&name=gutao">查询所有的Account账户</a><br>
 <c:forEach var="account" items="${requestlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
 <hr>
  <c:forEach var="account" items="${sessionlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
 <hr>
  <c:forEach var="account" items="${applicationlist}">
   ${account.id} ${account.login} ${account.name} ${account.pass}<br>
 </c:forEach>
</body>
</html>