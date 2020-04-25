<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Quiz/Data.do" method="post"> <%--여기서 /Quiz/를 지워주면 내 프로젝트 안의 Data.do로 이동 --%>
이름: <input type=text name=name><br>
연락처: <input type=text name=tel><br>
나이: <input type=text name=age><br>
<input type=submit>
</form>
</body>
</html>