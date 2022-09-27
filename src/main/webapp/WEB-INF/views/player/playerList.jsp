<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

 <div class="container">
 <br/>
 <h1>선수 목록 페이지입니다.</h1>
 <br/>
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀 이름</th>
				<th>포지션</th>
				<th>선수 이름</th>
				<th>등록일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${playerList}">
				<tr>
					<td>${player.no}</td>
					<td>${player.teamName}</td>
					<td>${player.position}</td>
					<td>${player.playerName}</td>
					<td><fmt:formatDate value="${player.createDate}" pattern="yyyy-MM-dd" /></td>
					<td><a href="/player/${player.id}/${player.playerName}/updateForm"><i class="fa fa-wrench"></i></a></td>
					<td><input type=checkbox name="teamDelCheck" value="${player.id}"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>