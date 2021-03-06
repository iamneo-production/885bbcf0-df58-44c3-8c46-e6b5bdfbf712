/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-02-28 08:27:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\t<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/bus.css\">\r\n");
      out.write("<script src=\"index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("  <a href=\"#home\">My Bus</a>\r\n");
      out.write("   <div class=\"search-container\">\r\n");
      out.write("      <input type=\"text\" id=\"d\" onkeyup=\"getSerach(this.value)\" placeholder=\"Search..\" name=\"search\">\r\n");
      out.write("      <button type=\"submit\"  onkeyup=\"getSerach(d.value)\" id=\"searchButton\">Search</button>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"dropdown\">\r\n");
      out.write("    <button class=\"dropbtn\">Filter\r\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"dropdown-content\">\r\n");
      out.write("      <a href=\"#\">View ById</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" >\r\n");
      out.write("  <div class=\"column\" style=\"width:55%;\" id=\"busListSearch\">\r\n");
      out.write("    <center><h1>Click To View Bus List</h1>\r\n");
      out.write("    <form action=\"busesJS\" method=\"GET\">\r\n");
      out.write("    <input type=\"submit\" value=\"Display List\">\r\n");
      out.write("    </form></center>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\" style=\"width:41%;\">\r\n");
      out.write("     <div class=\" minp \">\r\n");
      out.write("              \r\n");
      out.write("\t\t\t  \r\n");
      out.write("<h2><center> ADD BUS DETAILS</h2></center>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <form action=\"addBus\" method=\"POST\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-25\">\r\n");
      out.write("      <label for=\"enterBoardingLanding\">Enter boarding and landing place</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-75\">\r\n");
      out.write("      <input type=\"text\" id=\"enterBoardingLanding\" name=\"busBoardingPlace\" placeholder=\"Enter boarding and landing place\" required/>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-25\">\r\n");
      out.write("      <label for=\"enterDateFrom\">Bus Boarding</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-75\">\r\n");
      out.write("      <input type=\"Date\" id=\"enterDateFrom\" name=\"fromDate\" placeholder=\"Bus Boarding Date\" required/>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("    <div class=\"col-25\">\r\n");
      out.write("      <label for=\"enterDateTo\">Bus Landing</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-75\">\r\n");
      out.write("      <input type=\"Date\" id=\"enterDateTo\" name=\"toDate\" placeholder=\"Bus Landing Date\" required/>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-25\">\r\n");
      out.write("      <label for=\"enterTiming\">Bus Timing</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-75\">\r\n");
      out.write("      <input  type=\"time\" step=\"1\"  id=\"enterTiming\" name=\"time\" placeholder=\"Enter Bus Timing\" required/>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <input id=\"addButton\" type=\"submit\" value=\"Add Bus\">\r\n");
      out.write("  </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
