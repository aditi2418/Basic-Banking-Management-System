package controller;
import dto.UserDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterAuthenticator;

public class AddServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
   {
    response.sendRedirect("adduser.jsp");
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
   {
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String balance=request.getParameter("balance");
    
    UserDTO user=new UserDTO();
    user.setName(name);
    user.setEmail(email);
    user.setBalance(balance);
    
    RegisterAuthenticator ra=new RegisterAuthenticator();
    boolean register=ra.isRegister(user);
    if(register)
    {
        HttpSession session=request.getSession(true);
        session.setAttribute("email",email);
        //response.sendRedirect("view.jsp");
                 request.setAttribute("message", "** USER CREATED SUCCESSFULLY..!!!!");
                 RequestDispatcher rd = getServletContext().getRequestDispatcher("/view.jsp");
                 rd.include(request, response);
    }
    else
    {
                 request.setAttribute("message", "**INVALID  USER  DETAILS");
       
 RequestDispatcher rd = getServletContext().getRequestDispatcher("/adduser.jsp");
                 rd.include(request, response);
       // response.sendRedirect("adduser.jsp");
    }
   }
}