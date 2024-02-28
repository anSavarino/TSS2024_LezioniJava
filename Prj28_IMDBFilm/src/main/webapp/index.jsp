<%@page import="model.Film"%>
<%@page import="java.util.List"%>
<%@ include file ="header.jsp"%>
<% if(request.getAttribute("elenco")==null){ %>
<h1>EHI, VAI IMMEDIATASUBITO AD ALL!</h1>
<%}else{ %>
<table class="table table-primary table-striped table-striped-columns">
  <tr>
    <th>Titolo</th>
    <th>Rating</th>
    <th>Anno</th>
  </tr>
  <%List<Film> films = (List<Film>)request.getAttribute("elenco"); %>
  <%for(Film f : films){ %>
  <tr>
    <td><%=f.getTitolo() %></td>
    <td><%=f.getRating() %></td>
    <td><%=f.getAnno() %></td>
  </tr>
<%} %>
</table>

<%} %>
<%@ include file = "footer.jsp" %>