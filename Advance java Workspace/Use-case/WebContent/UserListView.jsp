<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List list = (List) request.getAttribute("list");
		Iterator it = list.iterator();
	%>
	<form action="UserListCtl" method="post">
		<table>
			<tr>
				<td><input type="text" name="firstName"></td>
				<td><input type="Date" name="dob"></td>
				<td><input type="submit" name="operation" value="search"></td>
			</tr>
			
			<td><select name="preload">
					<option>------ select-------</option>
					<%
						Iterator it1 = list.iterator();
						while (it1.hasNext()) {
							UserBean bean1 = (UserBean) it1.next();
					%>
					<option value="<%=bean1.getLastName()%>"><%=bean1.getLastName()%></option>
					<%
						}
					%>
			<td><input type="submit" name="operation" value="preload"></td>
			
		</table>
		<table border="1%">
			<tr>
				<th>Select</th>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>LoginId</th>
				<th>Password</th>
				<th>Dob</th>
				<th>Address</th>
				<th>Edit</th>
			</tr>
			<%
				while (it.hasNext()) {
					UserBean bean = (UserBean) it.next();
			%>
			<tr>
				<td><input type="checkbox" name="ids" value="<%=bean.getId()%>"></td>
				<td><%=bean.getId()%></td>
				<td><%=bean.getFirstName()%></td>
				<td><%=bean.getLastName()%></td>
				<td><%=bean.getLoginId()%></td>
				<td><%=bean.getPassword()%></td>
				<td><%=bean.getDob()%></td>
				<td><%=bean.getAddress()%></td>
				<td><a href="UserCtl?id">Edit</a></td>
				<%
					}
				%>
			</tr>
			
			<tr>
				<td><input type="submit" name="operation" value="delete"></td>
			</tr>
		</table>


	</form>
</body>
</html>