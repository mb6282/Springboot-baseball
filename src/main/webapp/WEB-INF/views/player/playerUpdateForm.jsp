<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>선수 수정 페이지입니다.</h1>

<br/>
<form>
<input id="id" type="hidden" value="${player.id}"/>

현재 팀 : <input type="text" value="${player.teamName}" readOnly/>

<hr/>
수정할 팀 선택 : 
<select id="teamId">
	<c:forEach var="team" items="${team}">
		<option value="${team.id}">${team.teamName}</option>
	</c:forEach>
</select>

포지션 : <input id="position" type="text" value="${player.position}"/>
선수 이름 : <input id="playerName" type="text" value="${player.playerName}"/>

<button type="button" onclick="playerUpdate()">수정</button>
</form>

</div>

<script>
function playerUpdate() {
	let id = $("#id").val();
	
	let data = {
		playerName: $("#playerName").val(),
		teamId : $("#teamId option:selected").val(),
		position : $("#position").val()
	};
	
	$.ajax("/player/" + id, {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수정보 수정 성공");
			location.href = "/player";
		} else {
			alert("선수정보 수정에 실패하였습니다");
		}
	});
}
</script>

<%@ include file="../layout/footer.jsp"%>