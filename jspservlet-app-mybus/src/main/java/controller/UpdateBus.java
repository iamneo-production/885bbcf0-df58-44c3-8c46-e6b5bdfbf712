package controller;
import service.BusDao;

import model.Bus;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/updateBus")
public class UpdateBus extends HttpServlet{
  
  public void doPost(HttpServletRequest request,HttpServletResponse response)
{
  try
  {
    int busId=Integer.parseInt(request.getParameter("updatebusId"));
    String busBoardingPlace=request.getParameter("updatebusBoardingPlace");
    String fromDate=request.getParameter("updatefromDate");
    String toDate=request.getParameter("updatetoDate");
    String time=request.getParameter("updatetime");

    Bus bus=new Bus();
    BusDao busDao=new BusDao();
    bus.setBusId(busId);
    bus.setBusBoardingPlace(busBoardingPlace);
    bus.setFromDate(fromDate);
    bus.setToDate(toDate);
    bus.setTime(time);
    busDao.updateBus(bus);
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