<%@ page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://vdab.be/tags" prefix="v" %>
<!DOCTYPE html>
<html lang ="nl">
<head>
<v:head title="Prijsverhoging"/>
</head>
<body>
	<v:menu/>
	<h1>Prijsverhoging</h1>
	<form method ="post" id="verhogingform">
		<label>Percentage:<span>${fouten.percentage}</span>
		<input name="percentage" value="${param.percentage}" type="number" min="0.01" step="0.01" autofocus required></label>
		<input type="submit" value="Verhoog prijzen" id="verhogingsknop">
	</form>
	<script>
		document.getElementById("verhogingform").onsubmit = function() {
			document.getElementById("verhogingsknop").disabled = true;
		};
	</script>
</body>
</html>