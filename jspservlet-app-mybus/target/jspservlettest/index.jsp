<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/bus.css">
</head>
<body>

<div class="navbar">
  <a href="#home">My Bus</a>
   <div class="search-container">
    <form action="/busesJS">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit">Search</button>
    </form>
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
  <div class="column" style="width:55%;">
    <h2>Column 1</h2>
    <p>Some text..</p>
    <form action="BusesJS" method="GET">
    <input type="submit" value="submit">
    </form>
  </div>
  <div class="column" style="width:41%;">
     <div class=" minp ">
              
			  
<h2><center> ADD BUS DETAILS</h2></center>
<div class="container">
  <form action="/action_page.php">
  <div class="row">
    <div class="col-25">
      <label for="enterBoardingLanding">Enter boarding and landing place</label>
    </div>
    <div class="col-75">
      <input type="text" id="enterBoardingLanding" name="Detail" placeholder="Enter boarding and landing place">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="enterDateFrom">Bus Boarding</label>
    </div>
    <div class="col-75">
      <input type="Date" id="enterDateFrom" name="BoardingDate" placeholder="Bus Boarding Date">
    </div>
  </div>
  
   <div class="row">
    <div class="col-25">
      <label for="enterDateFrom">Bus Landing</label>
    </div>
    <div class="col-75">
      <input type="Date" id="enterDateto" name="LandingDate" placeholder="Bus Landing Date">
    </div>
  </div>
  
  
  <div class="row">
    <div class="col-25">
      <label for="enterTiming">Bus Timing</label>
    </div>
    <div class="col-75">
      <input  type="time" step="1"  id="enterTiming" name="BoardingDate" placeholder="Enter Bus Timing" />
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
