<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enquiry Form</h1>
<form:form action = "Form.do" modelAttribute="list" method = "POST">
	<table>
			<tr>
				<td>Name:</td>
				<td> <%-- <spring:message code="lable.name"></spring:message> --%>
				<form:input path="name" id="name"/></td>
			<td><form:errors path ="name" class ="error.fn" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><%-- <spring:message code="lable.contact"></spring:message> --%>
				<form:input path="contact" id="contact"/></td>
			<td><form:errors path ="contact" class ="error.cn" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><%-- <spring:message code="lable.email"></spring:message --%>
				<form:input path="email" id="email"/></td>
			<td><form:errors path ="email" class ="error.email" style="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Profession:</td>
				<td><%-- <spring:message code="lable.profession"></spring:message> --%>
				<form:select path="profession">
						<form:option value="" label="Select Role" />
						<form:option value="MCA" label="MCA" />
						<form:option value="BE" label="BE" />
						<form:option value="BCA" label="BCA" />
						<form:option value="MSc" label="MSc" />
						<form:option value="BSc" label="BSc" />
						<form:option value="ME" label="ME" />
					</form:select></td>
			<td><form:errors path ="profession" class ="error.prof" style="color:red"></form:errors>
					</td>
			</tr>
			<tr>
				<td>Comment:</td>
			   <td><%-- <spring:message code="lable.comment"></spring:message> --%>
				<form:textarea path="comment" rows="3" cols="20"/></td>
			<td><form:errors path ="comment" class ="error.com" style="color:red"></form:errors>
				</td>
				
			</tr>
			<tr>
				<td>send me promotional information:</td>
				<td>
				<%-- <spring:message code="lable.promotion"></spring:message> --%>
				
					Linkedin <form:checkbox path="promotion" value="Linkedin"/>
					Newschannel <form:checkbox path="promotion" value="Newschannel"/>
					Facebook <form:checkbox path="promotion" value="Facebook"/>
					Job Portal <form:checkbox path="promotion" value="Job Portal"/></td>
			<td><form:errors path ="promotion" class ="error.info" style="color:red"></form:errors></td>
			</tr>
			<tr>
			<td>
				<input type="submit" name="submit" value="Submit"/> 
				<button type="reset" value="Reset">reset</button>
			
			</td></tr>
	</table>
	</form:form>
</body>
</html>