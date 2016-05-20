<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>会員一覧</h1>

	<form:form method="post" name="form">
		<c:forEach var="item" items="${list}">
			<input type="radio" name="radio1" value="${item.id}" />
	　氏名：${item.name}
	　住所：${item.address}
	　電話番号：${item.tel}
	<br>

	<c:set var="cnt" value="${item.id}" />

		</c:forEach>
		<br>
		<input type="submit" value="更新or削除" />
		<br><br>
		<input type="button" value="新規登録"
			onClick="location.href = 'http://localhost:8080/springmyapp/hello'">
	</form:form>

	<form:form action="DELETE" method="GET">
	<input type="submit" value="全消去" name="AllDeldete" />
	</form:form>
</body>
</html>