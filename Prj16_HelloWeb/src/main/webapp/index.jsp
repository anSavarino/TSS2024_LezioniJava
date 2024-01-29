
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s = "Hello tomcat";
	for(int i = 1; i <= 6; i++){
		if(i==3)break;
		out.print("<h"+i+">"+s+"</h"+i+">");
	}

%>
<%-- <h2><%=s %></h2> --%>
</body>
</html>