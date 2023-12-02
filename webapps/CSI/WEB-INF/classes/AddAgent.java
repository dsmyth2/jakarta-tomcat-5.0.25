//
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class AddAgent extends HttpServlet 
{
  private PreparedStatement pstmt;
  public void init() throws ServletException {
    initializeJdbc();
  }
  public void doPost(HttpServletRequest request, HttpServletResponse
      response) throws ServletException, IOException  
 {
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String PersonId = request.getParameter("PersonId");
    String LicenseNum = request.getParameter("LicenseNum");
    

    try 
	{
      if (PersonId.length() == 0 || LicenseNum.length() == 0) {
        out.println("Please: Person ID and License Number are required");
        return; 
    }
    storeAgent(LicenseNum, PersonId);
	out.println("<html><head><title>Agent Report</title>");	 
	out.print( "<br /><b><center><font color=\"RED\"><H2>Agents Added Report</H2></font>");
    out.println( "</center><br />" );
	/*
	out.println("</head><body>");
	out.println("<center><table border=\"1\">"); 
	out.println("<tr BGCOLOR=\"#cccccc\">");
    out.println("<td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">HOME ID</td>");
    out.println("<td align = \"justify\"><font face =\"times new roman\"  size=\"4pt\">ADDRESS</td>");
    out.println("</tr>");
	*/
	out.println("</table></center>");
		
    out.println(PersonId + " " + LicenseNum +
        " is now added to the Agents table");
	out.println("</body></html>");
    }
    catch(Exception ex) 
	{
      out.println("\n Error: " + ex.getMessage());
    }
    finally 
	{
      out.close(); 
    }
 } 
  private void initializeJdbc() 
  {
    try 
	{
        String driver = "oracle.jdbc.driver.OracleDriver";  
        Class.forName(driver);
		// database URL is the unique identifier of the database on the Internet
		// thin is the oracle server
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "CSIPROJECT";
		String password = "mohammed";  
		Connection conn = DriverManager.getConnection(url,user, password);  
		pstmt = conn.prepareStatement("insert into agents " +
        "(LicenseNum, PersonID) values (?, ?)");
    }
    catch (Exception ex) 
	{
      ex.printStackTrace();
    }
  }

  
  private void storeAgent(String LicenseNum, String PersonId) throws SQLException 
 {
    pstmt.setString(1, LicenseNum);
    pstmt.setString(2,PersonId);
    pstmt.executeUpdate();
 }
}
