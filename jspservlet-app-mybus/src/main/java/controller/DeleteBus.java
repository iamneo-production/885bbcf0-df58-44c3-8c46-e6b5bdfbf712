package controller;
import service.BusDao;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/deleteBus")
public class DeleteBus extends HttpServlet{
  
  public void doPost(HttpServletRequest request,HttpServletResponse response)
{
  System.out.println("Hoo");
  try
  {
    int busId=Integer.parseInt(request.getParameter("busId"));
    

    BusDao busDao=new BusDao();
    busDao.deleteBus(busId);
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