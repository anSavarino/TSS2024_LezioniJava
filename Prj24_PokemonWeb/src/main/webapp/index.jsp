<!DOCTYPE html>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.HashSet"%>
<%@page import="model.Pokemon"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="utf-8">
<title>Pokémon List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<h1>Pokémon List</h1>
	
	<form action="">
		<select name="tipo" class="form-control">
		<%TreeSet<String> tipi= (TreeSet<String>)request.getAttribute("tipi"); %>
		<%for(String tipo : tipi){ %>
			<option><%=tipo %></option>
			<%}%>
		</select>
		<input type="submit" value="cerca tipo" class="btn btn-primary">
	</form>
	
	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Tipo</th>
		</tr>
		<%ArrayList<Pokemon> pokemons = (ArrayList<Pokemon>)request.getAttribute("elenco"); %>
		<%for(Pokemon p:pokemons){ %>
		<tr>
			<th><%=p.getId()%></th>
			<th> <a href="http://www.google.com/search?q=<%=p.getNome()%>" target="_blank"><%=p.getNome()%></a></th>
			<th><%=p.getTipo()%></th>			
		</tr>
		<%}%>
	</table>
</div>
</body>
</html>