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

<script src="/js/player.js">

</script>
<%@ include file="../layout/footer.jsp"%>