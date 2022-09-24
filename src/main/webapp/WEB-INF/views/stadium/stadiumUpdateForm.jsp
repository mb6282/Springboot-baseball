<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<h1>경기장 수정 페이지입니다.</h1>

	<br />
	<form>
		<input id="id" type="hidden" value="${stadium.id}" />
		경기장 이름 : <input id="stadiumName" type="text" value="${stadium.stadiumName}" />

		<button type="button" onclick="stadiumUpdate()">수정</button>
	</form>
</div>

<script src="/js/stadium.js">

</script>

<%@ include file="../layout/footer.jsp"%>