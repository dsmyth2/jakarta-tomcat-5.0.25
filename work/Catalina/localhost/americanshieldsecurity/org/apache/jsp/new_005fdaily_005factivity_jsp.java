package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class New_005fDaily_005fActivity_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    java.sql.Connection con=null;
    java.sql.Statement state4 = null; 
    java.sql.Statement state3 = null; 
    java.sql.Statement state5 = null; 
    String url ="jdbc:oracle:thin:@site1.us.oracle.com:1521:americanshieldsecurity";
    String driver = "oracle.jdbc.driver.OracleDriver";
    ResultSet result = null;
    ResultSet result1 = null;
    ResultSet result2 = null;
    String  qury = "SELECT  distinct SUPERVISORS FROM TB_HIRING_SITES" ;
    String  query = "SELECT  distinct LOCATIONS FROM TB_HIRING_SITES" ;
    String  query2 = "SELECT  distinct OFFICERS FROM TB_HIRING_SITES" ;
    String  uid = "";
    HttpSession session = null ;
    String s="";
    String s1="" ;
    String s2="" ;

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
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

   try 
   {
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());     
   }
   catch(Exception e)
   {
      System.err.println("Exception while loading  driver");		
   }
   try
   {
      con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "americanshieldsecurity", "mohammed");
      System.out.println("Congratulations! You are connected successfully.");
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while connecting to the database");
   }
   try 
   {
       state4 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result=state4.executeQuery(qury);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement2.");
   }

try 
   {
       state3 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement");
   }
   try 
   { 
       result1=state3.executeQuery(query);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement2.");
   }

   try 
   {
       state5 = con.createStatement();
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while creating statement5");
   }
   try 
   { 
       result2=state5.executeQuery(query2);
   } 
   catch (SQLException e) 
   {
      System.err.println("SQLException while executing SQL Statement5.");
   }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>Supervisor New Daily Activity</title>\r\n");
      out.write("         <meta http-equiv=\"Page-Enter\" content=\"revealTrans(Duration=\"5\",Transition=\"30\")\">\r\n");
      out.write("         <meta http-equiv=\"Page-Exit\" content=\"revealTrans(Duration=\"10\",Transition=\"40\")\">\r\n");
      out.write("  </head>    \r\n");
      out.write("\t<body background =\"images/Durgantt.gif\" link=\"#0000AA\" vlink=\"0000AA\">\r\n");
      out.write("          \r\n");
      out.write("              <center><H2><font color=red>Supervisor - New Daily Activity</font></H2></center>\r\n");
      out.write("\r\n");
      out.write("              <center>Please enter date, time in, time out, and select supervisor, job site and officer:</center><BR>\r\n");
      out.write("<br><br>\r\n");
      out.write("<script language=\"JavaScript\" src=\"Fps.js\" type=\"text/javascript\"> </script>    <!-- ************ -->\r\n");
      out.write("<script language=\"JavaScript\" src=\"valid.js\" type=\"text/javascript\"> </script>    <!-- ************ -->\r\n");
      out.write("<script language=\"JavaScript\" src=\"datepicker.js\"></script> \r\n");
      out.write("<script language=\"JavaScript\" src=\"gen_validatorv2.js\" type=\"text/javascript\"> </script>    <!-- ************ -->\r\n");
      out.write("\r\n");
      out.write("<script language = \"Javascript\">\r\n");
      out.write("/**\r\n");
      out.write(" * DHTML date validation script. Courtesy of SmartWebby.com (http://www.smartwebby.com/dhtml/)\r\n");
      out.write(" */\r\n");
      out.write("// Declaring valid date character, minimum year and maximum year\r\n");
      out.write("var dtCh= \"/\";\r\n");
      out.write("var minYear=1900;\r\n");
      out.write("var maxYear=2100;\r\n");
      out.write("\r\n");
      out.write("function isInteger(s){\r\n");
      out.write("\tvar i;\r\n");
      out.write("    for (i = 0; i < s.length; i++){   \r\n");
      out.write("        // Check that current character is number.\r\n");
      out.write("        var c = s.charAt(i);\r\n");
      out.write("        if (((c < \"0\") || (c > \"9\"))) return false;\r\n");
      out.write("    }\r\n");
      out.write("    // All characters are numbers.\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function stripCharsInBag(s, bag){\r\n");
      out.write("\tvar i;\r\n");
      out.write("    var returnString = \"\";\r\n");
      out.write("    // Search through string's characters one by one.\r\n");
      out.write("    // If character is not in bag, append to returnString.\r\n");
      out.write("    for (i = 0; i < s.length; i++){   \r\n");
      out.write("        var c = s.charAt(i);\r\n");
      out.write("        if (bag.indexOf(c) == -1) returnString += c;\r\n");
      out.write("    }\r\n");
      out.write("    return returnString;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function daysInFebruary (year){\r\n");
      out.write("\t// February has 29 days in any year evenly divisible by four,\r\n");
      out.write("    // EXCEPT for centurial years which are not also divisible by 400.\r\n");
      out.write("    return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );\r\n");
      out.write("}\r\n");
      out.write("function DaysArray(n) {\r\n");
      out.write("\tfor (var i = 1; i <= n; i++) {\r\n");
      out.write("\t\tthis[i] = 31\r\n");
      out.write("\t\tif (i==4 || i==6 || i==9 || i==11) {this[i] = 30}\r\n");
      out.write("\t\tif (i==2) {this[i] = 29}\r\n");
      out.write("   } \r\n");
      out.write("   return this\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function isDate(dtStr){\r\n");
      out.write("\tvar daysInMonth = DaysArray(12)\r\n");
      out.write("\tvar pos1=dtStr.indexOf(dtCh)\r\n");
      out.write("\tvar pos2=dtStr.indexOf(dtCh,pos1+1)\r\n");
      out.write("\tvar strMonth=dtStr.substring(0,pos1)\r\n");
      out.write("\tvar strDay=dtStr.substring(pos1+1,pos2)\r\n");
      out.write("\tvar strYear=dtStr.substring(pos2+1)\r\n");
      out.write("\tstrYr=strYear\r\n");
      out.write("\tif (strDay.charAt(0)==\"0\" && strDay.length>1) strDay=strDay.substring(1)\r\n");
      out.write("\tif (strMonth.charAt(0)==\"0\" && strMonth.length>1) strMonth=strMonth.substring(1)\r\n");
      out.write("\tfor (var i = 1; i <= 3; i++) {\r\n");
      out.write("\t\tif (strYr.charAt(0)==\"0\" && strYr.length>1) strYr=strYr.substring(1)\r\n");
      out.write("\t}\r\n");
      out.write("\tmonth=parseInt(strMonth)\r\n");
      out.write("\tday=parseInt(strDay)\r\n");
      out.write("\tyear=parseInt(strYr)\r\n");
      out.write("\tif (pos1==-1 || pos2==-1){\r\n");
      out.write("\t\talert(\"The date format should be : mm/dd/yyyy\")\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\tif (strMonth.length<1 || month<1 || month>12){\r\n");
      out.write("\t\talert(\"The date format should be : mm/dd/yyyy\")\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\tif (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){\r\n");
      out.write("\t\talert(\"The date format should be : mm/dd/yyyy\")\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\tif (strYear.length != 4 || year==0 || year<minYear || year>maxYear){\r\n");
      out.write("\t\talert(\"Please enter a valid 4 digit year between \"+minYear+\" and \"+maxYear)\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\tif (dtStr.indexOf(dtCh,pos2+1)!=-1 || isInteger(stripCharsInBag(dtStr, dtCh))==false){\r\n");
      out.write("\t\talert(\"The date format should be : mm/dd/yyyy\")\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("return true\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function ValidateForm(){\r\n");
      out.write("\tvar dt=document.proj_work.date\r\n");
      out.write("\tif (isDate(dt.value)==false){\r\n");
      out.write("\t\tdt.focus()\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("    return true\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("function ValidateForm1(){\r\n");
      out.write("\tvar dt=document.proj_work.timeIn\r\n");
      out.write("\tif (IsTime(dt.value)==false){\r\n");
      out.write("\t\tdt.focus()\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("    return true\r\n");
      out.write(" }\r\n");
      out.write("*/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("              <form  action=\"/americanshieldsecurity/S_New_Daily_Activity_Servlet\" name=proj_work  method=\"get\" >\r\n");
      out.write("                    <center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                        <td><b>Date:</b></td>\r\n");
      out.write("\t\t\t\t\t<td align=center ><INPUT TYPE=\"text\" size=10 maxlength=10 name=\"date\" onblur=\"ValidateForm()\">\r\n");
      out.write("         \t\t\t        </td>\r\n");
      out.write("         \t\t\t\t<td valign=\"middle\"><font  size=\"1\"><b>(mm/dd/yyyy)</b></font>\r\n");
      out.write("         \t\t\t\t</td>\r\n");
      out.write("       \t\t\t\t\t\t\r\n");
      out.write("                                        <td><b>Time In:</b></td>\r\n");
      out.write(" \t\t\t\t        <td align=center ><INPUT TYPE=\"text\" size=8 maxlength=8 name=\"timeIn\">\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td valign=\"middle\"><font  size=\"1\"><b>(hh:mm:ss)</b></font>\r\n");
      out.write("            \t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("                                        <td><b>Time Out:</b></td>\r\n");
      out.write(" \t\t\t\t        <td align=center ><INPUT TYPE=\"text\" size=8 maxlength=8 name=\"timeOut\">\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td valign=\"middle\"><font  size=\"1\"><b>(hh:mm:ss)</b></font>\r\n");
      out.write("            \t\t\t\t</td>\r\n");
      out.write("         \t\t\t   </tr>\r\n");
      out.write("     \t\t\t   </table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <P>\r\n");
      out.write("                    \r\n");
      out.write("<center>\r\n");
      out.write("                           <table border=0>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td><b>Supervisors:</b></td><td></td><td><b>Job Sites:</b></td><td></td><td><b>Officers:</b></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td rowspan=6>\r\n");
      out.write("                                                    <select name=supervisors size=1>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\" \">\r\n");
      out.write("                                                            \r\n");
      out.write("                                                       ");

                                                          try 
                                                          {   
                                                             while(result.next())
                                                             { s= result.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s);
      out.write("</option>\r\n");
      out.write("                                                        ");

                                                              } 
                                                           }
                                                           catch (SQLException e) 
                                                           {
                                                               System.out.println("Resutset is not connected");
                                                           }
                                                         
      out.write("\r\n");
      out.write("                                                         \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td rowspan=6>\r\n");
      out.write("                                                     <select name=locations size=1>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\" \">\t\t\t\t\t\t   \r\n");
      out.write("                                                            \r\n");
      out.write("                                                         ");

                                                            try 
                                                            {   
                                                                while(result1.next())
                                                                {  s1= result1.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s1);
      out.write("</option>\r\n");
      out.write("                                                        ");

                                                                } 
                                                            }
                                                            catch (SQLException e) 
                                                            {
                                                                System.out.println("Resutset is not connected");
                                                            }
                                                         
      out.write("\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td></td>\r\n");
      out.write("                                        <td rowspan=6>\r\n");
      out.write("                                                     <select name=officers size=1>\r\n");
      out.write("\t\t\t\t\t\t\t    <option value=\" \">\t\t\t\t\t\t   \r\n");
      out.write("                                                            \r\n");
      out.write("                                                         ");

                                                            try 
                                                            {   
                                                                while(result2.next())
                                                                {  s2= result2.getString(1) ;
                                                        
      out.write("\r\n");
      out.write("                                                                   <option value=\"");
      out.print(s2);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s2);
      out.write("</option>\r\n");
      out.write("                                                        ");

                                                                } 
                                                            }
                                                            catch (SQLException e) 
                                                            {
                                                                System.out.println("Resutset is not connected");
                                                            }
                                                         
      out.write("\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   \r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("     <table>   \r\n");
      out.write("        <tr>\r\n");
      out.write("           <td colspan=4><b>Comments</b><BR>\r\n");
      out.write("               <textarea name=comments rows=5 cols=70 onChange=\"validateTextLength(this, 1000, 'Comments'); setChange(document.test)\">\r\n");
      out.write("               </textarea>\r\n");
      out.write("           </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("       <p></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <P>\r\n");
      out.write("                    <center>\r\n");
      out.write("                            <table>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td width=110 align=center><input type=submit value=\"Submit\"></td>\r\n");
      out.write("                                       <td width=110 align=center><input type=reset value=\"Clear Screen\"></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                    </center>\r\n");
      out.write("                   <P>\r\n");
      out.write("              </form>\r\n");
      out.write("\t      <P>\r\n");
      out.write("\r\n");
      out.write("<!-- ************ -->\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var frmvalidator  = new Validator(\"proj_work\");\r\n");
      out.write("  \r\n");
      out.write("\tfrmvalidator.addValidation(\"date\",\"req\",\"Please enter Start date.\");\r\n");
      out.write("\t//frmvalidator.addValidation(\"timeIn\",\"req\",\"Please enter Time In.\");\r\n");
      out.write("\t//frmvalidator.addValidation(\"timeOut\",\"req\",\"Please enter Time Out.\");\r\n");
      out.write("\t//frmvalidator.addValidation(\"locations\",\"req\",\"Please select Location.\");\t\r\n");
      out.write("\t//frmvalidator.addValidation(\"supervisors\",\"req\",\"Please select Supervisor.\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>  <!-- ************ -->\r\n");
      out.write("\r\n");
      out.write("\r\n");

    try 
    { 
        result.close();
        state4.close();
        con.close();
        System.out.println("Connection is closed successfully.");
    }
    catch (SQLException e) 
    {
         e.printStackTrace();
    }

      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("var frmval = new print_footer(document.lastModified);\r\n");
      out.write("\r\n");
      out.write("</script>  <!-- ************ -->\r\n");
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
