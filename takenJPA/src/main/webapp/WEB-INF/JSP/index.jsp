<%@ page language="java" contentType="UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Welkom</title>
</head>
<body>
	<h1>Welkom</h1>
	<nav>
		<a href="${contextPath}/artikels/zoekenopnummer.htm">Artikel zoeken op nummer</a>
		<a href="${contextPath}/artikels/toevoegen.htm">Artikel toevoegen</a>
		<a href="${contextPath}/artikels/zoekenopnaam.htm">Artikel zoeken op naam</a>
		<a href="${contextPath}/artikels/prijsverhoging.htm">Prijsverhoging</a>
		<a href="${contextPath}/artikels/kortingen.htm">Artikelkortingen</a>
		<a href="${contextPath}/artikels/perartikelgroep.htm">Artikel per artikelgroep</a>
	</nav>
	<img src='${contextPath}/images/logo${random}.jpg' alt='logo' id='logo' />
</body>
</html>