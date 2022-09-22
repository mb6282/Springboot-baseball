<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<br/>
 <h1>경기장 목록 페이지입니다.</h1>
<br/>
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>개장일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>번호</td>
					<td>이름</td>
					<td>날짜</td>
					<td><a href="#">수정</a></td>
					<td>삭제</td>
				</tr>
		</tbody>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>