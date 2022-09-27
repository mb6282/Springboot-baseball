<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>팀 수정 페이지입니다.</h1>

<br/>
<form>
<input id="id" type="hidden" value="${team.id}"/>
현재 야구장 : <input type="text" value="${team.stadiumName}" readOnly/>

<hr/>

수정할 경기장 선택 : 
<select id="stadiumId">
	<c:forEach var="stadium" items="${stadium}">
		<option value="${stadium.id}">${stadium.stadiumName}</option>
	</c:forEach>
</select>

<br/>
<br/>
팀 이름 : <input id="teamName" type="text" value="${team.teamName}"/>

<button type="button" onclick="teamUpdate()">수정</button>
</form>
</div>

<script src="/js/team.js">

</script>

<%@ include file="../layout/footer.jsp"%>