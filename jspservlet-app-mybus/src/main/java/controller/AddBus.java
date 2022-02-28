package controller;
import service.BusDao;

import model.Bus;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/addBus")
public class AddBus extends HttpServlet{
  
  public void doPost(HttpServletRequest request,HttpServletResponse response)
{
  
  try
  {
    String busBoardingPlace=request.getParameter("busBoardingPlace");
    String fromDate=request.getParameter("fromDate");
    String toDate=request.getParameter("toDate");
    String time=request.getParameter("time");

    Bus bus=new Bus();
    BusDao busDao=new BusDao();
    bus.setBusBoardingPlace(busBoardingPlace);
    bus.setFromDate(fromDate);
    bus.setToDate(toDate);
    bus.setTime(time);
    busDao.addBus(bus);
    response.sendRedirect("busesJS");
    }catch(Exception s)
    {
      s.getMessage();
    }
  
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{

}

}