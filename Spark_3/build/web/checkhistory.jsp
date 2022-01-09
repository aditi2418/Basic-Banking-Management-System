<%@page import="db.DBConnector"%>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title>
            Check History
        </title>
<style>
    body,html{
        margin: 0px;
        padding: 0px;
    }
   
    .navi
{
float:left;
padding-left:50px;
font-size:40px;
font-family:Times New Roman;
color:black;
margin-top: 8px;
text-shadow: 0 0 3px #fffdfd, 0 0 5px #13257b;
}
.navbar
{
float:right;
padding:7px;
padding-right:40px;
margin-top: 8px;
}
.navbar a
{
font-size:25px;
padding-right:40px;
text-decoration:none;
color: black;
font-weight: bold;
}

.navbar a:hover
{
	color:#f4f4fc;
}

    u {
    text-decoration: underline;
    text-shadow: 0 0 3px #fffdfd, 0 0 5px #13257b;
}
    .bg{
        

height:100%;
background-position:center;
background-repeat:no-repeat;
background-size:cover;
}
table {
  border-collapse: collapse;
  width: 65%;
  margin-left: auto;
  margin-right: auto;
  border: solid;
}
th{
    font-size: 25px;
    font-weight: bold;
    color:black;
    text-shadow: -1px 1px 0 #fff,
    1px 1px 0 #fff,
    1px -1px 0 #fff,
    -1px -1px 0 #fff;
   
}
th, td {
  padding: 8px;
  text-align: center;
  border-bottom: 1px solid #000;
}
td{
    font-size: 20px;
    font-weight: bolder;
}
tr:hover {background-color: #f5f5f5;}
.btn
{ color: white;
    background-color:#0475f1;
    font-family:Times New Roman;
    font-weight: bolder;
}
footer{
background-color:black;
color:white;
height:50px;
margin-top:-16px;
bottom: 0px;
    position: relative;
width: 100%;
}
p {
    padding-top: 7px;
}
</style>
    </head>
    <body>
        <div>

<span class="navi">
<b>INDIAN BANK</b>
</span>
<span class="navbar">
<a href="index.html">Home</a>
<a href="adduser.jsp">Add Customer</a>
<a href="view.jsp">View User</a>
<a href="transfer.jsp">Transfer Money</a>
<a href="checkhistory.jsp">Check History</a>
</span>
</div>
        <div class="bg">
            <img src="img/hk.jpg" style=" left: 0px;
    position: absolute;
    bottom: 0px;height: 276px;
    width: 359px;
    margin-bottom: -59px">
          <br>
            
            <br><center><h1 style="font-family:Times New Roman; font-size: 40px; color:black; font-weight: bolder; text-shadow: -1px 1px 0 #000,
                                                                                                           1px 1px 0 #000,
                                                                                                           1px -1px 0 #000,
                                                                                                           -1px -1px 0 #000;"><u>TRANSACTION HISTORY</u></h1></center>
        <%
     String b = (String)request.getAttribute("message");
      if(b!=null)
      {
          %>
<script>        
{
  alert("** TRANSACTION SUCCESSFULL..!!!!");
}
</script><%}%>    
        <%    
            try
            {
                Connection con=DBConnector.getConnection();
                Statement st=DBConnector.getStatement();
                String query="Select * from transactions";
                ResultSet rs=st.executeQuery(query);
                %><table>
            <tr>
                <th><%out.println("Sender's Acc.");%></th>
               <th><%out.println("Receiver's Acc.");%></th>
               <th><%out.println("Amount");%></th>
               <th><%out.println("Date");%></th>
               <th><%out.println("Time");%></th>
            <br>
            </tr>
           <%
                while(rs.next())
                {
                    %> <tr><%
                    %> <td><%out.println(rs.getString("Sender's Acc."));%> </td>
                      <td><%out.println(rs.getString("Receiver's Acc."));%> </td>
                      <td><%out.println(rs.getString("Amount"));%> </td>
                      <td><%out.println(rs.getString("Date"));%> </td>
                      <td><%out.println(rs.getString("Time"));%> </td>
                    <br></tr><%
                }
        %></table><%
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        %>
        </div>  <footer><center>
        <p>&copy 2021. Made by <b>Aditi Chourasia</b> <br> The Sparks Foundation</p>
</center>
</footer>  </body> </html>