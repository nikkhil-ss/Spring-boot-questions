<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<body bgcolor="lavender">
	<h1>
		<center>Star Singer Audition</center>
	</h1>

	<!--  Design the page as per the requirements-->
	<center>
		<table border="2" width="40%" cellpadding="2">
			<tr>
				<th>Contestant Name</th>
				<th>Age</th>
				<th>Email Id</th>
				<th>Phone Number</th>
				<th>Location</th>
			</tr>
			<c:forEach var="v" items="${contestantList}">
				<tr>
					<td>${v.name}</td>
					<td>${v.age}</td>
					<td>${v.emailId}</td>
					<td>${v.phoneNumber}</td>
					<td>${v.location}</td>
				</tr>
			</c:forEach>
		</table>


		<a href="index">Back to Home</a>
	</center>
</body>
</html>
