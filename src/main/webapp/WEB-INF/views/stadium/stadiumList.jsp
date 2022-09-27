<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<h1>경기장 목록 페이지입니다.</h1>
	<br />
	
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>개장일</th>
				<th>수정</th>
				<th><button type="button" onclick="stardiumDelete()">선택삭제</button></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stadium" items="${stadium}">
				<tr>
					<td>${stadium.no}</td>
					<td>${stadium.stadiumName}</td>
					<td><fmt:formatDate value="${stadium.createDate}" pattern="yyyy-MM-dd" /></td>
					<td><a href="/stadium/${stadium.id}/${stadium.stadiumName}/updateForm"><i class="fa fa-wrench"></i></a></td>
					<td><input type=checkbox name="stadiumDelCheck" value="${stadium.id}"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/stadium.js">

</script>

<%@ include file="../layout/footer.jsp"%>