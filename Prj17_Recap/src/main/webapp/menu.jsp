<ul id="menu">
  <li> <a href="index.jsp">HomePage</a> </li>
  <% if(session.getAttribute("logged")!= null){ %>
	  <li> <a href="index.jsp?pagina=uno">Pagina 1</a> </li>
	  <li> <a href="index.jsp?pagina=due">Pagina 2</a> </li>
	  <li> <a href="index.jsp?pagina=tre">Pagina 3</a> </li>
	  <li> <a href="index.jsp?pagina=quattro">Pagina 4</a> </li>
	  <li> <a href="index.jsp?pagina=logout">Logout</a> </li>
  <%}%>
</ul>
