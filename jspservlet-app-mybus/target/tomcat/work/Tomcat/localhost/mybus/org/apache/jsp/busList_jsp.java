/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-02-28 08:29:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import service.*;

public final class busList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/bus.css\">\n");
      out.write("<script src=\"index.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"#home\">My Bus</a>\n");
      out.write("  <div class=\"search-container\">\n");
      out.write("    <input type=\"text\" id=\"d\" onkeyup=\"getSerach(this.value)\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("    <button type=\"submit\"  onkeyup=\"getSerach(d.value)\" id=\"searchButton\">Search</button>\n");
      out.write("</div>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Filter\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Link 1</a>\n");
      out.write("      <a href=\"#\">Link 2</a>\n");
      out.write("      <a href=\"#\">Link 3</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"width:55%;\" id=\"busListSearch\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <!-- <div class=\"alert alert-success\" *ngIf='message'>{{message}}</div> -->\n");
      out.write("  \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <center><h3 class=\"text-center\">List of Users</h3></center>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"container text-left\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        ");
 List<Bus> bus=(List<Bus>)request.getAttribute("busesList");
        
      out.write("\n");
      out.write("        <table class=\"styled-table\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>ID</th>\n");
      out.write("              <th>BusBoardingPlace</th>\n");
      out.write("              <th>FromDate</th>\n");
      out.write("              <th>ToDate</th>\n");
      out.write("              <th>Actions</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("          \n");
      out.write("            ");
for(Bus b:bus) {
      out.write("\n");
      out.write("              <tr>\n");
      out.write("             <td>");
      out.print( b.getBusId());
      out.write("</td>\n");
      out.write("             <td>");
      out.print( b.getBusBoardingPlace());
      out.write("</td>\n");
      out.write("             <td>");
      out.print( b.getFromDate());
      out.write("</td>\n");
      out.write("             <td>");
      out.print( b.getToDate());
      out.write("</td>\n");
      out.write("             <td><!--<a href=\"updateBus.jsp?busId=");
      out.print(b.getBusId());
      out.write("\">Edit</a>-->\n");
      out.write("              <form action=\"updateBus.jsp?busId=");
      out.print(b.getBusId());
      out.write("\" method=\"POST\">\n");
      out.write("              <input class=\"EditButton\" name=\"submit\" type=\"submit\" value=\"Edit\"></form>\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; <br>\n");
      out.write("              <form action=\"deleteBus?busId=");
      out.print(b.getBusId());
      out.write("\" method=\"POST\">\n");
      out.write("              <input class=\"DeleteButton\" name=\"submit\" type=\"submit\" value=\"Delete\"></form>\n");
      out.write("              <!--<a href=\"delete\">Delete</a></td>-->\n");
      out.write("              </tr>\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("          </tbody>\n");
      out.write("  \n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"width:41%;\">\n");
      out.write("     <div class=\" minp \">\n");
      out.write("              \n");
      out.write("\t\t\t  \n");
      out.write("      <h2><center> ADD BUS DETAILS</h2></center>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <form action=\"addBus\" method=\"POST\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-25\">\n");
      out.write("            <label for=\"enterBoardingLanding\">Enter boarding and landing place</label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-75\">\n");
      out.write("            <input type=\"text\" id=\"busBoardingPlace\" name=\"busBoardingPlace\" placeholder=\"Enter boarding and landing place\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-25\">\n");
      out.write("            <label for=\"enterDateFrom\">Bus Boarding</label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-75\">\n");
      out.write("            <input type=\"Date\" id=\"fromDate\" name=\"fromDate\" placeholder=\"Bus Boarding Date\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <div class=\"row\">\n");
      out.write("          <div class=\"col-25\">\n");
      out.write("            <label for=\"enterDateFrom\">Bus Landing</label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-75\">\n");
      out.write("            <input type=\"Date\" id=\"toDate\" name=\"toDate\" placeholder=\"Bus Landing Date\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-25\">\n");
      out.write("            <label for=\"enterTiming\">Bus Timing</label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-75\">\n");
      out.write("            <input  type=\"time\" step=\"1\"  id=\"time\" name=\"time\" placeholder=\"Enter Bus Timing\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
