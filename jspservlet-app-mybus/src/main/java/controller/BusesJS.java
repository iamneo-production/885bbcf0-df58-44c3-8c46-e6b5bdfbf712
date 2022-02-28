package controller;

import javax.servlet.http.HttpServlet;

import service.BusDao;
import javax.servlet.*;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;
import model.*;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/busesJS")
public class BusesJS extends HttpServlet {

public void doPost(HttpServletRequest request,HttpServletResponse response)
{
doGet(request,response);
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{

  List<Bus> busesList=BusDao.getAllBusData();
  RequestDispatcher dispatcher=request.getRequestDispatcher("busList.jsp");
  request.setAttribute("busesList",busesList);
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
