<%@page import="net.tanesha.recaptcha.ReCaptchaFactory"%>
<%@page import="net.tanesha.recaptcha.ReCaptcha"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setCharacterEncoding("utf-8"); %>
<%@page import="facebook.FBConnection"%>

<%
	FBConnection fbConnection = new FBConnection();
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/login.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>
<script type="text/javascript" src="js/smoothscroll.js"></script>
</head>
<body>
<%
	String err="";
	if(request.getAttribute("err")!=null){
		err=(String) request.getAttribute("err");
	}
	%>
	<!--/start-login-one-->
	<div class="login-01">
		<div class="one-login  hvr-float-shadow">
			<div class="one-login-head">
				<img src="images/top-lock.png" alt="" />
				<h1>Đăng nhập</h1>
				<span></span>
			</div>
			<form action="LoginAdminServlet" method="post">
			<li style="color: red"><%=err %></li>
				<li><input type="text" class="text" value="Username"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Username';}" name="username"><a
					href="#" class=" icon user"></a></li>
				<li><input type="password" value="Password"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Password';}" name="password"><a
					href="#" class=" icon lock"></a></li>
				 <%
          ReCaptcha c = ReCaptchaFactory.newReCaptcha("6LdlHOsSAAAAAM8ypy8W2KXvgMtY2dFsiQT3HVq-", "6LdlHOsSAAAAACe2WYaGCjU2sc95EZqCI9wLcLXY", false);
          out.print(c.createRecaptchaHtml(null, null));
        %>
				<div class="submit">
					<input type="submit"  value="SIGN IN">
				</div>
				<div class="social-icons">
					<p>Hoặc bạn có thể đăng nhập theo các cách sau</p>
					<ul class="soc_icons2">
						<li class="pic"><a href="<%=fbConnection.getFBAuthUrl()%>"><i class="icon_4"></i></a></li>
						<li class="pic"><a href="#"><i class="icon_5"></i></a></li>
						<li class="pic"><a href="#"><i class="icon_6"></i></a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<h5>
					Bạn không có tài khoản ?<a href="register.jsp"> Đăng kí </a>
				</h5>
			</form>
		</div>
	</div>
</body>
</html>