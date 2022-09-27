<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
<h1>팀 등록 페이지입니다.</h1>

<br/>
<form>
야구장 이름 : 
<select id="stadiumId">
	<c:forEach var="stadium" items="${stadium}">
		<option value="${stadium.id}">${stadium.stadiumName}</option>
	</c:forEach>
</select>
팀 이름 : <input id="teamName" type="text" value="" />
<button type="button" onclick="teamSave()">등록</button>
</form>

</div>

<script src="/js/team.js">

</script>

<%@ include file="../layout/footer.jsp"%>