<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<h1>경기장 등록 페이지입니다.</h1>

	<br />
	<form>
		경기장 이름 : <input id="stadiumName" type="text" value="" />
		<button type="button" onclick="stadiumSave()">등록</button>
	</form>
</div>

<script src="/js/stadium.js">

</script>

<%@ include file="../layout/footer.jsp"%>