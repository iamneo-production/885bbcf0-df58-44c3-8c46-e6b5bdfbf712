<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      <a href="#">View ById</a>
    </div>
  </div> 
</div>


<div class="row" >
  <div class="column" style="width:55%;" id="busListSearch">
    <center><h1>Click To View Bus List</h1>
    <form action="busesJS" method="GET">
    <input type="submit" value="Display List">
    </form></center>
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
      <input type="text" id="enterBoardingLanding" name="busBoardingPlace" placeholder="Enter boarding and landing place" required/>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="enterDateFrom">Bus Boarding</label>
    </div>
    <div class="col-75">
      <input type="Date" id="enterDateFrom" name="fromDate" placeholder="Bus Boarding Date" required/>
    </div>
  </div>
  
   <div class="row">
    <div class="col-25">
      <label for="enterDateTo">Bus Landing</label>
    </div>
    <div class="col-75">
      <input type="Date" id="enterDateTo" name="toDate" placeholder="Bus Landing Date" required/>
    </div>
  </div>
  
  
  <div class="row">
    <div class="col-25">
      <label for="enterTiming">Bus Timing</label>
    </div>
    <div class="col-75">
      <input  type="time" step="1"  id="enterTiming" name="time" placeholder="Enter Bus Timing" required/>
    </div>
  </div>
  
  <br>
  <div class="row">
    <input id="addButton" type="submit" value="Add Bus">
  </div>
  </form>
</div>
			  
			  
			  
			  
			  
			  
			  
    </div>
  </div>
</div>



</body>
</html>
