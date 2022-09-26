<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>팀 등록 페이지입니다.</h1>

<br/>
<form>
야구장 이름 : 
<select id="stadiumId">
	<c:forEach var="stadium" items="${stadiumDto}">
		<option value="${stadium.id}">${stadium.stadiumName}</option>
	</c:forEach>
</select>
팀 이름 : <input id="teamName" type="text" value="" />
<button type="button" onclick="teamSave()">등록</button>
</form>

</div>

<script>
function teamSave() {

	let data = {
		stadiumId : $("#stadiumId option:selected").val(),
		teamName: $("#teamName").val()
	};

	$.ajax("/team", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀 등록에 성공하였습니다");
			location.href = "/team";
		} else {
			alert("팀 등록에 실패하였습니다");
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>