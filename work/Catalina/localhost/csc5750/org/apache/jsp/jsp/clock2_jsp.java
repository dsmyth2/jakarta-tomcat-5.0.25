package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clock2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Fig. 37.9: clock2.jsp                        -->\r\n");
      out.write("<!-- date and time to include in another document -->\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td style = \"background-color: black;\">\r\n");
      out.write("         <p class = \"big\" style = \"color: cyan; font-size: 3em; \r\n");
      out.write("            font-weight: bold;\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
 
               // get client locale
               java.util.Locale locale = request.getLocale();

               // get DateFormat for client's Locale
               java.text.DateFormat dateFormat = 
                  java.text.DateFormat.getDateTimeInstance(
                     java.text.DateFormat.LONG,
                     java.text.DateFormat.LONG, locale );

            
      out.write(' ');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.print( dateFormat.format( new java.util.Date() ) );
      out.write("\r\n");
      out.write("         </p> \r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write(" /*************************************************************************\r\n");
      out.write(" * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *\r\n");
      out.write(" * Pearson Education, Inc. All Rights Reserved.                           *\r\n");
      out.write(" *                                                                        *\r\n");
      out.write(" * DISCLAIMER: The authors and publisher of this book have used their     *\r\n");
      out.write(" * best efforts in preparing the book. These efforts include the          *\r\n");
      out.write(" * development, research, and testing of the theories and programs        *\r\n");
      out.write(" * to determine their effectiveness. The authors and publisher make       *\r\n");
      out.write(" * no warranty of any kind, expressed or implied, with regard to these    *\r\n");
      out.write(" * programs or to the documentation contained in these books. The authors *\r\n");
      out.write(" * and publisher shall not be liable in any event for incidental or       *\r\n");
      out.write(" * consequential damages in connection with, or arising out of, the       *\r\n");
      out.write(" * furnishing, performance, or use of these programs.                     *\r\n");
      out.write(" *************************************************************************/\r\n");
      out.write("-->\r\n");
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
