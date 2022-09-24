<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Baseball</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>

<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">FINAL</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/stadium">경기장 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/stadium/saveForm">경기장 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">팀 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">팀 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">선수목록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">팀 별 포지션 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">퇴출된 선수 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="#">퇴출 사유 등록</a></li>
				</ul>
			</div>
		</div>
	</nav>