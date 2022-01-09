package controller;

import db.DBConnector;
import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegisterAuthenticator;

public class SendServlet extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
 {
     response.sendRedirect("transfer.jsp");  
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
 {
     PrintWriter out= response.getWriter();
     String sender=request.getParameter("sender");
     String receiver=request.getParameter("receiver");
     int amount=Integer.parseInt(request.getParameter("amount"));
     int samount=0,ramount=0;
     
     try
     {
     UserDTO user=new UserDTO();
     user.setSender("sender");
     user.setReceiver("receiver");
     user.setAmount(amount);
     
     String query="Select Current_Balance from customers where Email_ID='"+sender+"'";
     Statement st=DBConnector.getStatement();
     ResultSet rs=st.executeQuery(query);
     if(rs.next())
     {
     samount=rs.getInt("Current_Balance");
     }
     query="Select Current_Balance from customers where Email_ID='"+receiver+"'";
     st=DBConnector.getStatement();
     rs=st.executeQuery(query);
     if(rs.next())
     {
     ramount=rs.getInt("Current_Balance");
     }
     
     samount-=amount;
     ramount+=amount;
     
     if(samount>0)
     {
     query="Update customers set Current_Balance='"+samount+"' where Email_ID='"+sender+"'";
     st=DBConnector.getStatement();
     int x=st.executeUpdate(query);
     query="Update customers set Current_Balance='"+ramount+"' where Email_ID='"+receiver+"'";
     st=DBConnector.getStatement();
     x =x+st.executeUpdate(query);

     if(x>1)
     {
         RegisterAuthenticator ra =new RegisterAuthenticator();
         boolean history=ra.isHistory(sender,receiver,amount,user);
         //response.sendRedirect("transfer.jsp");
                if(history)
                {
                 request.setAttribute("message", "");
                 RequestDispatcher rd = getServletContext().getRequestDispatcher("/checkhistory.jsp");
                 rd.include(request, response);
                }
                else
                {
                 request.setAttribute("message", "TRANSACTION DONE RECIEPT CANNOT BE GENERATED");
                 RequestDispatcher rd = getServletContext().getRequestDispatcher("/send.jsp");
                 rd.include(request, response);  
                }
     }
     }
     else
     {
        //response.sendRedirect("index.html");
                 request.setAttribute("message", "** TRANSACTION  FAILED ... !!!");
                 RequestDispatcher rd = getServletContext().getRequestDispatcher("/send.jsp");
                 rd.include(request, response);
     }
     }
     catch(SQLException e)
     {
        out.println("Error in sql statement");
     }
 }
}
 