<%@page import="java.util.ArrayList"%>
<%@page import="lab.web.vo.DataVO"%> <%--생성한 클래스가 다른 패키지에 있기 때문에 임포트 선언을 해줘야 함. --%>
<%--default로 해놓으면 복잡해지기 때문에 패키지 안에 꼭 넣어주기! --%>
<%--집단, 프로젝트, 기능, 이름 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/Quiz/DataInput.jsp">입력페이지</a><br>
<br>
<%ArrayList<DataVO> list = (ArrayList<DataVO>) request.getAttribute("list"); %>
<%for(DataVO data : list) { %>
	이름: <%=data.getName() %><br>
	연락처: <%=data.getTel() %><br>
	나이: <%=data.getAge() %><br>
<br>
<% } %> <%--괄호 먼저 닫아놓기! --%>
</body>
</html>