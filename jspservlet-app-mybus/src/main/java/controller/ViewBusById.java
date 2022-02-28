package controller;

import javax.servlet.http.HttpServlet;

import service.BusDao;
import javax.servlet.*;
import javax.servlet.ServletException;
import java.io.IOException;
import model.*;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/viewBusById")
public class ViewBusById extends HttpServlet {

public void doPost(HttpServletRequest request,HttpServletResponse response)
{
doGet(request,response);
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
System.out.println("Hello");
try
{
  int busId=Integer.parseInt(request.getParameter("busId"));
    Bus bus=new BusDao().viewBusById(busId);
    System.out.println(bus.getBusId());
    System.out.println(bus.getBusBoardingPlace());

    System.out.println(bus.getFromDate());
    System.out.println(bus.getToDate());
    System.out.println(bus.getTime());

  
  RequestDispatcher dispatcher=request.getRequestDispatcher("busList.jsp");
  request.setAttribute("bus",bus);
  dispatcher.forward(request, response);

   
  }catch(ServletException s)
  {
    s.getMessage();
  }
  catch(IOException io)
  {
    io.getMessage();
  }
  

}

  

}
