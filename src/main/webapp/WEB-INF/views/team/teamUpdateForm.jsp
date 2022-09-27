<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>팀 수정 페이지입니다.</h1>

<br/>
<form>
<input id="id" type="hidden" value="${teamDto.id}"/>
현재 야구장 : <input type="text" value="${teamDto.stadiumName}" readOnly/>

<hr/>

수정할 경기장 선택 : 
<select id="stadiumId">
	<c:forEach var="stadium" items="${stadiumDto}">
		<option value="${stadium.id}">${stadium.stadiumName}</option>
	</c:forEach>
</select>

<br/>
<br/>
팀 이름 : <input id="teamName" type="text" value="${teamDto.teamName}"/>

<button type="button" onclick="teamUpdate()">수정</button>
</form>
</div>

<script src="/js/team.js">

</script>

<%@ include file="../layout/footer.jsp"%>