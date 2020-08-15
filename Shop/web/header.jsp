
<%@page import="facebook.FBConnection"%>
<%
	FBConnection fbConnection = new FBConnection();
%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Insert title here</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">


        <link href="css/main.css" rel="stylesheet">



    </head>
    <body>
    </head>
    <!--/head-->

<body>
<header id="header"><!--header-->
    <div class="header_top">
        <!--header_top-->
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="contactinfo">
                        <ul class="nav nav-pills">
                            <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i> info@domain.com</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="<%=fbConnection.getFBAuthUrl()%>"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->

    <div class="header-middle">
        <!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="logo pull-left">
                        <a href="index.html"><img src="images/0-thiet-ke-logo-shop-thiet-ke-bang-hieu-shop (1).png" alt="" height="100" width="290" /></a>
                    </div>

                </div>
                <div class="col-sm-8">
                    <div class="shop-menu pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#"><i class="fa fa-user" ></i> <%=session.getAttribute("username")%></a></li>
                            <li><a href="RegisterServlet?command=logout"><i class="fa fa-star"></i>Logout</a></li>
                            <li><a href="checkout.jsp"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                            <li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart</a></li>
                            <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom">
        <!--header-bottom-->
        <div class="container">
            
         
                    <div class="search_box pull-right">
                       <jsp:include page="thanh_search.jsp"></jsp:include>
                    </div>
                
              
                    <div class="navbar-header">
                         <jsp:include page="menu_ngang.jsp"></jsp:include>
                    </div>
                  
                </div>
                
            
        
    </div><!--/header-bottom-->
</header>
<!--/header-->



</body>


</html>