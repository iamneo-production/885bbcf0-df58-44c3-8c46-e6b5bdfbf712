<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,model.*,service.*" %>
	<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/bus.css">
<script src="index.js"></script>
</head>
<body>

<div class="navbar">
  <a href="#home">My Bus</a>
  <div class="search-container">
    <input type="text" id="d" onkeyup="getSerach(this.value)" placeholder="Search.." name="search">
    <button type="submit"  onkeyup="getSerach(d.value)" id="searchButton">Search</button>
</div>
  <div class="dropdown">
    <button class="dropbtn">Filter
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div> 
</div>

<div class="row">
  <div class="column" style="width:55%;" id="busListSearch">
    <div class="row">
      <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
  
      <div class="container">
        <center><h3 class="text-center">List of Users</h3></center>
        <hr>
        <div class="container text-left">

        </div>
        <br>
        <% List<Bus> bus=(List<Bus>)request.getAttribute("busesList");
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
  
  </div>
  <div class="column" style="width:41%;">
     <div class=" minp ">
              
			  
      <h2><center> ADD BUS DETAILS</h2></center>
      <div class="container">
        <form action="addBus" method="POST">
        <div class="row">
          <div class="col-25">
            <label for="enterBoardingLanding">Enter boarding and landing place</label>
          </div>
          <div class="col-75">
            <input type="text" id="busBoardingPlace" name="busBoardingPlace" placeholder="Enter boarding and landing place" required/>
          </div>
        </div>
        <div class="row">
          <div class="col-25">
            <label for="enterDateFrom">Bus Boarding</label>
          </div>
          <div class="col-75">
            <input type="Date" id="fromDate" name="fromDate" placeholder="Bus Boarding Date" required/>
          </div>
        </div>
        
         <div class="row">
          <div class="col-25">
            <label for="enterDateFrom">Bus Landing</label>
          </div>
          <div class="col-75">
            <input type="Date" id="toDate" name="toDate" placeholder="Bus Landing Date" required/>
          </div>
        </div>
        
        
        <div class="row">
          <div class="col-25">
            <label for="enterTiming">Bus Timing</label>
          </div>
          <div class="col-75">
            <input  type="time" step="1"  id="time" name="time" placeholder="Enter Bus Timing" required/>
          </div>
        </div>
        
        <br>
        <div class="row">
          <input type="submit" value="Submit">
        </div>
  </form>
</div>
			  
			  
			  
			  
			  
			  
			  
    </div>
  </div>
</div>



</body>
</html>
