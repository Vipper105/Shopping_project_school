<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Menu ngang</title>
        <link href="css/layout_1.css" rel="stylesheet" type="text/css" />
        <link href="css/menu.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        
       <div class="container">

            <ul id="nav">
                
                <li><a href="index.jsp"> HOME </a></li>
                
                <li><a class="hsubs" href="#"> GIỚI THIỆU </a>
                    <ul class="subs">
                        <li><a href="#"> Tin Tức </a></li>
                         <li><a href="trang_gioi_thieu.jsp"> Giới Thiệu </a></li>
                         <li><a href="#"> Hướng Dẫn Mua Hàng </a></li>
                       
                      
                    </ul>
                </li>
                <li><a class="hsubs" href="#"> SHOP </a>
                    <ul class="subs">
                        <li><a href="list.jsp"> Danh Sách Sản Phẩm</a></li>
                        <li><a href="detail.jsp"> Chi Tiết Sản Phẩm</a></li>
                        <li><a href="#"> Thanh Toán</a></li>
                        <li><a href="cart.jsp"> Giỏ Hàng</a></li>
                      
                    </ul>
                </li>
                   <li><a href="#">KHUYẾN MÃI</a></li>
                   <li><a href="login.jsp">ĐĂNG NHẬP</a></li>
                   <li><a href="register.jsp">ĐĂNG KÝ</a></li>
                   <li><a href="contact.jsp">LIÊN HỆ</a></li>
                 <!--  <li><a href="404.jsp" style="font-weight: bolder; ">404</a></li>  -->
                
                <div id="lavalamp"></div>
            </ul>

        </div>
    </body>
</html>