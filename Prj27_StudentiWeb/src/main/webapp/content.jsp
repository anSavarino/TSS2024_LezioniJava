<%@page import="model.Studente"%>
<%@page import="java.util.List"%>
<table class="table table-primary">
  <tr>
    <th>nome</th>
    <th>cognome</th>
    <th>età</th>
  </tr>

<% List<Studente> studenti = (List<Studente>)request.getAttribute("listaStudenti");%>
<%for (Studente s : studenti){ %>
  <tr> 
    <td><%= s.getNome()%></td>
    <td><%= s.getCognome() %></td>
    <td><%= s.getEta() %></td>    
  </tr>
  <%} %>
</table>
