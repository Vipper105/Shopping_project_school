<%@page import="java.text.NumberFormat"%>
<%@page import="model.SanPham"%>
<%@page import="dao.SanPhamDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Insert title here</title>
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
        <div id="fb-root"></div>
        <script>(function (d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id))
                    return;
                js = d.createElement(s);
                js.id = id;
                js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.5&appId=538269923004861";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));</script>
            <%
                SanPhamDAOImpl sanPhamDAO = new SanPhamDAOImpl();
                SanPham sp = sanPhamDAO.getChiTietSanPham(request
                        .getParameter("ma_san_pham"));
                String ma_san_pham = request.getParameter("ma_san_pham");
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMinimumIntegerDigits(0);
            %>
            <jsp:include page="header.jsp"></jsp:include>

        <section>
            <div class="container">
                <div class="row">
                <jsp:include page="category.jsp"></jsp:include>
                    <div class="col-sm-9 padding-right">
                        <div class="product-details">
                            <!--product-details-->
                            <div class="col-sm-5">
                                <div class="view-product">
                                    <img src="images/<%=sp.getHinh_anh()%>" alt="" />
                                <h3>ZOOM</h3>
                            </div>
                            <div id="similar-product" class="carousel slide"
                                 data-ride="carousel">

                                <!-- Wrapper for slides -->
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <a href=""><img src="images/f20.jpg"
                                                        alt=""></a> <a href=""><img
                                                src="images/f24.jpg" alt=""></a> <a
                                            href=""><img src="images/f21.jpg"
                                                     alt=""></a>
                                    </div>
                                    <div class="item">
                                        <a href=""><img src="images/f21.jpg"
                                                        alt=""></a> <a href=""><img
                                                src="images/f20.jpg" alt=""></a> <a
                                            href=""><img src="images/f24.jpg"
                                                     alt=""></a>
                                    </div>
                                    <div class="item">
                                        <a href=""><img src="images/f24.jpg"
                                                        alt=""></a> <a href=""><img
                                                src="images/f21.jpg" alt=""></a> <a
                                            href=""><img src="images/f20.jpg"
                                                     alt=""></a>
                                    </div>

                                </div>

                                <!-- Controls -->
                                <a class="left item-control" href="#similar-product"
                                   data-slide="prev"> <i class="fa fa-angle-left"></i>
                                </a> <a class="right item-control" href="#similar-product"
                                        data-slide="next"> <i class="fa fa-angle-right"></i>
                                </a>
                            </div>

                        </div>
                        <div class="col-sm-7">
                            <div class="product-information">
                                <!--/product-information-->
                                <img src="images/product-details/new.jpg" class="newarrival"
                                     alt="" />
                                <h2><%=sp.getTen_san_pham()%></h2>
                                <p>
                                    Mã sản phẩm :
                                    <%=sp.getMa_san_pham()%>
                                </p>
                                <span> <span><%=nf.format(sp.getDon_gia())%> VNĐ</span>
                                </span>
                                <p><a class="btn btn-fefault cart" href="GioHangServlet2?command=plus&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>">
                                        <i class="fa fa-shopping-cart"></i> Thêm vào giỏ hàng
                                    </a></p>
                                <p>
                                    <b>Số lượng :  <%= sp.getSo_luong()%></b> 
                                </p>
                                <p>
                                    <b>Giảm giá : <%=nf.format(sp.getGiam_gia())%> VNĐ </b>
                                </p>
                                <p>
                                    <b>Mô tả : <%=sp.getMo_ta()%></b>
                                </p>
                                <a href=""><img src="images/product-details/share.png"
                                                class="share img-responsive" alt="" /></a>
                            </div>
                            <!--/product-information-->
                        </div>
                    </div>
                    <!--/product-details-->

                    <div class="category-tab shop-details-tab">
                        <!--category-tab-->
                        <div class="col-sm-12">
                            <ul class="nav nav-tabs">
                                <!--<li><a href="#details" data-toggle="tab">Chi tiết sản phẩm</a></li> -->
                                <li><a href="#companyprofile" data-toggle="tab">Thông tin công ty
                                    </a></li>
                                <!--           <li><a href="#tag" data-toggle="tab">Tag</a></li>  -->
                                <li><a href="#reviews" data-toggle="tab">Bình luận(5)</a></li>
                                <li class="active"><a href="#facebook" data-toggle="tab">Bình luận Facebook</a></li>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div class="tab-pane fade" id="details">

                            </div>

                            <div class="tab-pane fade in active" id="companyprofile">
                                <p>Microsoft Office là một bộ phần mềm văn phòng dành cho máy tính cá nhân, máy chủ và là các dịch vụ chạy trên hệ điều hành Microsoft Windows và Mac OS X. Office được giới thiệu lần đầu vào ngày 1 tháng 8 năm 1989, được tiếp thị như tên của một gói các ứng dụng, phiên bản đầu tiên bao gồm Microsoft Word, Microsoft Excel và Microsoft Powerpoint. Office hiện được hơn một tỷ người sử dụng trên thế giới.[2] Phiên bản hiện tại là Office 365 dành cho Windows 10, được phát hành vào ngày 22 tháng 9 năm 2015 và Office 365 dành cho Mac OS X, phát hành vào ngày 9 tháng 7 năm 2015.</br></p>
                                <p>Trước đây, Microsoft đã giới thiệu một phần mềm bảng tính được gọi là Multiplan vào năm 1982, phần mềm rất được phổ biến trên hệ điều hành CP/M, nhưng trên MS-DOS thì nó đã không còn được như vậy. Điều đó đã thúc đẩy sự phát triển 1 chương trình bảng tính mới mang tên Excel với khẩu hiệu "'do everything 1-2-3 does and do it better'". Phiên bản đầu tiên của Excel được phát hành lần đầu tiên trên máy MAC năm 1985 và trên Windows (đánh số 2.0 xếp ngang hành với MAC và được tích hợp với môi trường run-time của windows) vào tháng 11 năm 1987. Lotus đã quá chậm trong việc phát hành 1-2-3 cho Windows và cho đến cuối năm 1988, Excel bắt đầu bán được nhiều hơn so với 1-2-3 và giúp Microsoft đạt được vị trí hãng phát triển phần mềm hàng đầu. Trung bình cứ 2 năm Microsoft lại ra mắt phiên bản mới của Excel 1 lần hoặc lâu hơn. Phiên bản hiện thời là Excel 16 hay còn gọi là Microsoft Excel 2016.</p>
                            </div>

                            <div class="tab-pane fade" id="tag">

                            </div>
                            <div class="tab-pane fade active in" id="reviews" >
                                <div class="col-sm-12">
                                    <ul>
                                        <li><a href=""><i class="fa fa-user"></i>EUGEN</a></li>
                                        <li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
                                        <li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
                                    </ul>
                                    <p>Chúng tôi rất mong nhận được những ý kiến đóng góp của các bạn,để ngày càng đáp ứng nhu cầu về sản phẩm và khắc phục nhược điểm để phục vụ tốt hơn cho quý khách trong tương lại.Xin chân thanh càm ơn :D </p>
                                    <p><b>Write Your Review</b></p>

                                    <form action="#">
                                        <span>
                                            <input type="text" placeholder="Your Name"/>
                                            <input type="email" placeholder="Email Address"/>
                                        </span>
                                        <textarea name="" ></textarea>
                                        <b>Rating: </b> <img src="images/product-details/rating.png" alt="" />
                                        <button type="button" class="btn btn-default pull-right">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                            <div class="tab-pane fade in active" id="facebook">
                                <div class="col-sm-12">
                                    <div class="fb-comments" data-href="detail.jsp?p=<%=ma_san_pham%>" data-width="600" data-numposts="5"></div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <!--/category-tab-->



                </div>
            </div>
        </div>
    </section>

    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>