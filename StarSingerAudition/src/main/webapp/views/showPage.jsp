<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>

<head>
<style>
* {
  box-sizing: border-box;
}

.row {
  margin-left:-5px;
  margin-right:-5px;
}
  
.column {
  float: left;
  width: 60%;
  padding: 3px;
}
.column1 {
  float: left;
  width: 25%;
  padding: 3px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
}

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;

}

th, td {
  text-align: left;
  padding: 5px;
}

#message{
color:red;
}
</style>
</head>


<body style="background-color:lavender">


<!--  Do not change the below line -->
<a href="showPage?language=en">English</a>|<a href="showPage?language=de">German</a>|<a href="showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<h1><center>Star Singer Audition</center></h1>
<form:form >
<div class="row">
  <div class="column1">
<table>
<tr>
<td><a href="index">Home</a><br> </td>
<tr><td><a href="viewList">View All Contestants</a></td> </tr>
</table>
</div>
  <div class="column">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
		               
          <!--  fill the code -->
	
	
	
	
	
		
	</table> 
	</div>
	</div>
	<center>
	<div id="message">   </div></center>
</form:form>


</body>
</html>	 	  	    	    	     	      	 	
