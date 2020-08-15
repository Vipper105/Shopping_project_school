<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>
<script type="text/javascript" src="js/smoothscroll.js"></script>
<link href="css/register.css" rel='stylesheet' type='text/css' />
</head>
<body>
	<%
	String err="";
	if(request.getAttribute("err")!=null){
		err=(String) request.getAttribute("err");
	}
	%>
	<div class="login-02">
		<div class="two-login  hvr-float-shadow">
			<div class="two-login-head">
				<img src="images/top-note.png" alt="" />
				<h2>Đăng kí</h2>
				<lable></lable>
			</div>
			<form action="RegisterServlet" method="post">
			<li style="color: red"><%=err %></li>
				<li><input type="text" class="text" value="Username"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Username';}"
					name="username"><a href="#" class=" icon2 user2"></a></li>
				<li><input type="password" value="Password"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Password';}"
					name="password"><a href="#" class=" icon2 lock2"></a></li>
				<li><input type="text" value="Fullname"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Fullname';}"
					name="fullname"><a href="#" class=" icon2 lock2"></a></li>
				
			
				<div class="submit two">
					<input type="submit" value="SIGN UP">
				</div>
				<h5>
					Already a member ?<a href="login.jsp"> Login Here</a>
				</h5>
			</form>
		</div>
	</div>
</body>
</html>