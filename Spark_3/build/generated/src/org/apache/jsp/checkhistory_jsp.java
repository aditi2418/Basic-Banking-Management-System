package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.*;

public final class checkhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>\n");
      out.write("            Check History\n");
      out.write("        </title>\n");
      out.write("<style>\n");
      out.write("    body,html{\n");
      out.write("        margin: 0px;\n");
      out.write("        padding: 0px;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    .navi\n");
      out.write("{\n");
      out.write("float:left;\n");
      out.write("padding-left:50px;\n");
      out.write("font-size:40px;\n");
      out.write("font-family:Times New Roman;\n");
      out.write("color:black;\n");
      out.write("margin-top: 8px;\n");
      out.write("text-shadow: 0 0 3px #fffdfd, 0 0 5px #13257b;\n");
      out.write("}\n");
      out.write(".navbar\n");
      out.write("{\n");
      out.write("float:right;\n");
      out.write("padding:7px;\n");
      out.write("padding-right:40px;\n");
      out.write("margin-top: 8px;\n");
      out.write("}\n");
      out.write(".navbar a\n");
      out.write("{\n");
      out.write("font-size:25px;\n");
      out.write("padding-right:40px;\n");
      out.write("text-decoration:none;\n");
      out.write("color: black;\n");
      out.write("font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover\n");
      out.write("{\n");
      out.write("\tcolor:#f4f4fc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    u {\n");
      out.write("    text-decoration: underline;\n");
      out.write("    text-shadow: 0 0 3px #fffdfd, 0 0 5px #13257b;\n");
      out.write("}\n");
      out.write("    .bg{\n");
      out.write("        \n");
      out.write("\n");
      out.write("height:100%;\n");
      out.write("background-position:center;\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 65%;\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("  border: solid;\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("    font-size: 25px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color:black;\n");
      out.write("    text-shadow: -1px 1px 0 #fff,\n");
      out.write("    1px 1px 0 #fff,\n");
      out.write("    1px -1px 0 #fff,\n");
      out.write("    -1px -1px 0 #fff;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("th, td {\n");
      out.write("  padding: 8px;\n");
      out.write("  text-align: center;\n");
      out.write("  border-bottom: 1px solid #000;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write("tr:hover {background-color: #f5f5f5;}\n");
      out.write(".btn\n");
      out.write("{ color: white;\n");
      out.write("    background-color:#0475f1;\n");
      out.write("    font-family:Times New Roman;\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write("footer{\n");
      out.write("background-color:black;\n");
      out.write("color:white;\n");
      out.write("height:50px;\n");
      out.write("margin-top:-16px;\n");
      out.write("bottom: 0px;\n");
      out.write("    position: relative;\n");
      out.write("width: 100%;\n");
      out.write("}\n");
      out.write("p {\n");
      out.write("    padding-top: 7px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("<span class=\"navi\">\n");
      out.write("<b>INDIAN BANK</b>\n");
      out.write("</span>\n");
      out.write("<span class=\"navbar\">\n");
      out.write("<a href=\"index.html\">Home</a>\n");
      out.write("<a href=\"adduser.jsp\">Add Customer</a>\n");
      out.write("<a href=\"view.jsp\">View User</a>\n");
      out.write("<a href=\"transfer.jsp\">Transfer Money</a>\n");
      out.write("<a href=\"checkhistory.jsp\">Check History</a>\n");
      out.write("</span>\n");
      out.write("</div>\n");
      out.write("        <div class=\"bg\">\n");
      out.write("            <img src=\"img/hk.jpg\" style=\" left: 0px;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0px;height: 276px;\n");
      out.write("    width: 359px;\n");
      out.write("    margin-bottom: -59px\">\n");
      out.write("          <br>\n");
      out.write("            \n");
      out.write("            <br><center><h1 style=\"font-family:Times New Roman; font-size: 40px; color:black; font-weight: bolder; text-shadow: -1px 1px 0 #000,\n");
      out.write("                                                                                                           1px 1px 0 #000,\n");
      out.write("                                                                                                           1px -1px 0 #000,\n");
      out.write("                                                                                                           -1px -1px 0 #000;\"><u>TRANSACTION HISTORY</u></h1></center>\n");
      out.write("        ");

     String b = (String)request.getAttribute("message");
      if(b!=null)
      {
          
      out.write("\n");
      out.write("<script>        \n");
      out.write("{\n");
      out.write("  alert(\"** TRANSACTION SUCCESSFULL..!!!!\");\n");
      out.write("}\n");
      out.write("</script>");
}
      out.write("    \n");
      out.write("        ");
    
            try
            {
                Connection con=DBConnector.getConnection();
                Statement st=DBConnector.getStatement();
                String query="Select * from transactions";
                ResultSet rs=st.executeQuery(query);
                
      out.write("<table>\n");
      out.write("            <tr>\n");
      out.write("                <th>");
out.println("Sender's Acc.");
      out.write("</th>\n");
      out.write("               <th>");
out.println("Receiver's Acc.");
      out.write("</th>\n");
      out.write("               <th>");
out.println("Amount");
      out.write("</th>\n");
      out.write("               <th>");
out.println("Date");
      out.write("</th>\n");
      out.write("               <th>");
out.println("Time");
      out.write("</th>\n");
      out.write("            <br>\n");
      out.write("            </tr>\n");
      out.write("           ");

                while(rs.next())
                {
                    
      out.write(" <tr>");

                    
      out.write(" <td>");
out.println(rs.getString("Sender's Acc."));
      out.write(" </td>\n");
      out.write("                      <td>");
out.println(rs.getString("Receiver's Acc."));
      out.write(" </td>\n");
      out.write("                      <td>");
out.println(rs.getString("Amount"));
      out.write(" </td>\n");
      out.write("                      <td>");
out.println(rs.getString("Date"));
      out.write(" </td>\n");
      out.write("                      <td>");
out.println(rs.getString("Time"));
      out.write(" </td>\n");
      out.write("                    <br></tr>");

                }
        
      out.write("</table>");

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
      out.write("\n");
      out.write("        </div>  <footer><center>\n");
      out.write("        <p>&copy 2021. Made by <b>Aditi Chourasia</b> <br> The Sparks Foundation</p>\n");
      out.write("</center>\n");
      out.write("</footer>  </body> </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
