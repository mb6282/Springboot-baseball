<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<h1>팀 목록 페이지입니다.</h1>
	<br />
	
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장 이름</th>
				<th>팀 이름</th>
				<th>창단일</th>
				<th>수정</th>
				<th><button type="button" onclick="stardiumDelete()">선택삭제</button></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${teamDto}">
				<tr>
					<td>${team.no}</td>
					<td>${team.stadiumName}</td>
					<td>${team.teamName}</td>
					<td><fmt:formatDate value="${team.createDate}" pattern="yyyy-MM-dd" /></td>
					<td><a href="/team/${team.id}/${team.teamName}/updateForm"><i class="fa fa-wrench"></i></a></td>
					<td><input type=checkbox name="teamDelCheck" id="deleteId" value="${team.id}"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>