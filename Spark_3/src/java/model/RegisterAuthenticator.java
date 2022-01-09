package model;
import db.DBConnector;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RegistrationAuthenticator.java")
public class RegisterAuthenticator 
{
    public boolean isHistory(String sender,String receiver,int amount,UserDTO user)
    {
      //String sender=user.getSender();
      //String receiver=user.getReceiver();
      //int amount=user.getAmount();
      String date=user.getCurrentDate();
      String time=user.getCurrentTime();
     try
     {
         String query1="Insert into transactions value(?,?,?,?,?)";
         Connection con1=DBConnector.getConnection();
         PreparedStatement ps1=con1.prepareStatement(query1);
         ps1.setString(1,sender);
         ps1.setString(2,receiver);
         ps1.setInt(3,amount);
         ps1.setString(4,date);
         ps1.setString(5,time);
         int x= ps1.executeUpdate();
         if(x>0)
         {
             return true;
         }
     }
     catch(SQLException e)
     {
         System.out.println("error in sql statement");
     }
     return false;
    }
    public boolean isRegister(UserDTO user)
    {
        String name=user.getName();
        String email=user.getEmail();
        String balance=user.getBalance();
        
        try
        {
            String query="Select Name from customers where Email_ID='"+email.trim()+"'";
            Statement st=DBConnector.getStatement();
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                return false;
            }
            query="Insert into customers values(?,?,?)";
            Connection con=DBConnector.getConnection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,balance);
            
            int x=ps.executeUpdate();
            if(x>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    return false;
    }
}
