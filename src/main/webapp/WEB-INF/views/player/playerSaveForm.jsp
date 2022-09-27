<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>선수 등록 페이지입니다.</h1>

<br/>
<form>
팀 이름 : 
<select id="teamId">
	<c:forEach var="team" items="${team}">
		<option value="${team.id}">${team.teamName}</option>
	</c:forEach>
</select>
선수 이름 : <input id="playerName" type="text" value=""/>
포지션 이름 : <input id="position" type="text" value=""/>
<button type="button" onclick="playerSave()">등록</button>
</form>
</div>

<script>

function playerSave() {

	let data = {
		playerName: $("#playerName").val(),
		teamId : $("#teamId option:selected").val(),
		position : $("#position").val()
	};

	$.ajax("/player", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 등록에 성공하였습니다");
			location.href = "/player";
		} else {
			alert("선수 등록에 실패하였습니다");
		}
	});
}

</script>
<%@ include file="../layout/footer.jsp"%>