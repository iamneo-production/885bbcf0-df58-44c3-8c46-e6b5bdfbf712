<%@ page import="java.util.*,model.*,service.*" %>
<%


%>
    <div class="row">
      <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
  
      <div class="container">
        <center><h3 class="text-center">List of Users</h3></center>
        <hr>
        <div class="container text-left">

        </div>
        <br>
        <% List<Bus> bus= BusDao.getAllBusDatabySearch(request.getParameter("par"));
        %>
        <table class="styled-table">
          <thead>
            <tr>
              <th>ID</th>
              <th>BusBoardingPlace</th>
              <th>FromDate</th>
              <th>ToDate</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
          
            <%for(Bus b:bus) {%>
              <tr>
             <td><%= b.getBusId()%></td>
             <td><%= b.getBusBoardingPlace()%></td>
             <td><%= b.getFromDate()%></td>
             <td><%= b.getToDate()%></td>
             <td><!--<a href="updateBus.jsp?busId=<%=b.getBusId()%>">Edit</a>-->
              <form action="updateBus.jsp?busId=<%=b.getBusId()%>" method="POST">
              <input class="EditButton" name="submit" type="submit" value="Edit"></form>
              &nbsp;&nbsp;&nbsp;&nbsp; <br>
              <form action="deleteBus?busId=<%=b.getBusId()%>" method="POST">
              <input class="DeleteButton" name="submit" type="submit" value="Delete"></form>
              <!--<a href="delete">Delete</a></td>-->
              </tr>
         <% } %>
          </tbody>
  
        </table>
      </div>
    </div>
  