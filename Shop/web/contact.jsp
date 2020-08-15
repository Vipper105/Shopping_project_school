<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Liên Hệ</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
        <link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>
<script type="text/javascript" src="js/smoothscroll.js"></script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="contact-page" class="container">
                <div class="bg">

                    <div class="row">
                        <div class="col-sm-8">
                            <div class="contact-form">
                                <h2 class="title text-center"> LIÊN LẠC </h2>
                                <div class="status alert alert-success" style="display: none"></div>
                                <form id="main-contact-form" class="contact-form row"
                                      method="post" action="SendMailAttachServlet" enctype="multipart/form-data">
                                    
                                    <div class="form-group col-md-6">
                                        <input type="email"  class="form-control"
                                               required="required" placeholder="Email nhận " name="recipient">
                                    </div>
                                    <div class="form-group col-md-12">
                                        <input type="text"  class="form-control"
                                               required="required" placeholder="Chủ đề . . ." name="subject">
                                    </div>
                                    <div class="form-group col-md-12">
                                        <textarea  id="message" required="required"
                                                   class="form-control" rows="9" placeholder="Nội dung tin nhắn . . ." name="content"></textarea>
                                    </div>
                                    <div class="form-group col-md-12">
                                       
                                        <td style="font-size:228 px;font-weight: bolder">File Đính Kèm </td>
                                        <td><input type="file" name="file" size="290" /></td>
                                    </div>

                                    <div class="form-group col-md-12">
                                        <input type="submit" 
                                               class="btn btn-primary pull-right" value=" Gởi Phản Hồi ">
                                    </div>

                                </form>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="contact-info">
                                <h2 class="title text-center">Thông tin liên lạc</h2>
                                <address>
                                    
                                    <p>44/99 Ông Cao Lãnh,Quận 1,TPHCM</p>
                                    <p>DRAGON SHOP</p>
                                    <p>Mobile: +097 263 2912</p>
                                    <p>Fax:9999-9999-9999-9999</p>
                                    <p>Email:DragonShop@gmail.com</p>
                                </address>
                                <div class="social-networks">
                                    <h2 class="title text-center">Social Networking</h2>
                                    <ul>
                                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                        <li><a href="#"><i class="fa fa-youtube"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--/#contact-page-->

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>