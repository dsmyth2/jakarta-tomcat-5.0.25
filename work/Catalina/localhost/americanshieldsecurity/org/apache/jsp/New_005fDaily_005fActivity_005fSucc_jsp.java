package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class New_005fDaily_005fActivity_005fSucc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>Supervisor New Daily Activity Database Successful Addition</title>\r\n");
      out.write(" <!-- <center>Actual Dates for Engine Test #$eng_test_id with Actual Start $actual_start were successfully deleted.</center><BR> -->        \r\n");
      out.write("  </head>    \r\n");
      out.write("  <body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("          \r\n");
      out.write("              <center><H2>Supervisor New Daily Activity Database Result</H2></center>\r\n");
      out.write("\r\n");
      out.write("              <script language=\"JavaScript\" src=\"Fps.js\" type=\"text/javascript\"> </script>    <!-- ************ -->\r\n");
      out.write("              <center>\r\n");
      out.write("\t\t     <font color=red><b>You Successfully added data. Add more data ?<br>\r\n");
      out.write("    \t\t\t\t\tTry Again click <a href=\"New_S_Loc_Rev.jsp\">Here</a> </b></font>\r\n");
      out.write("              </center>\r\n");
      out.write("              <P>\r\n");
      out.write("                    \r\n");
      out.write("\t      <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write(" \t\t\tvar frmval = new print_footer(document.lastModified);\r\n");
      out.write("\t      </script>  <!-- ************ -->\r\n");
      out.write("\r\n");
      out.write("   </body>\r\n");
      out.write("</html>  \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
