	<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Add User</title>
</head>
<style>
*{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
	font-family: Times New Roman;
}
body,html
{
	height:100%;
}
.bg{

height:100%;
background-position:center;
background-repeat:no-repeat;
background-size:cover;
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
	color:white;
}


.container
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);

	display: flex;
	flex-direction: row;
	align-items: center;

	background-color: white;
	padding: 40px;
	
	box-shadow:  0 50px 50px -1px darkslategrey;
}
.user
{
   width: 270px;
   margin-right: 30px;
}

div.container div.user h2
{
	color: black;
	margin-bottom: 20px ;
                  font-size: 35px;
                  text-shadow: 0 0 3px #fffdfd, 0 0 5px #13257b;
}
div.container div.user input
{
	border: none;
	outline: none;
	border-radius: 0;
	width: 100%;
	border-bottom: 2px solid  #1c1c1e;
	margin-bottom: 25px;
	padding: 9px 0;
	font-size: 17px;
}
div.container div.user button
{
	color: white;
	background-color: #1c1c1e;
	border: none;
	outline: none;
	border-radius: 3p;
	font-size: 14px;
	padding: 2px 30px;
}

footer{
background-color:black;
color:white;
height:50px;
margin-top:650px;
bottom: 5px;
    position: relative;
}
p {
    padding-top: 7px;
}
b 
{
    font-weight: bold;
color:black;
  }
img{
    width: 300px;
display:block;
}

</style>
<body>
<div class="bg">

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

	<div class="container">
		<div class="user">
			<form action="AddServlet" method="POST">
                            <%
   String a = (String)request.getAttribute("message");
     if(a!=null){
     out.println("<FONT COLOR=RED>" + a + "</FONT>"); 
     out.println();}
%>
				<h2>Create Account</h2>
				<input type="text" name="name" placeholder ="Name"><br>
				<input type="email" name="email" placeholder="Email"><br>
				<input type="balance" name="balance" placeholder="Balance">
<br>
				<button name="submit" style="margin-right:50px;">CREATE</button>

                                <button name="reset"><a href="index.html" style="color:white; text-decoration: none;">BACK</a></button>
		</form>
			
		</div>
		<div class="ime" style="border:1px solid black;">
			<img src="img/add.png" width="300px" >
		</div>
        </div><br><br><br>

<footer><center>
        <p>&copy 2021. Made by <font color="white"<b>Aditi Chourasia</b> </font><br> The Sparks Foundation</p>
</center>
</footer>
</div>
</body>
</html>