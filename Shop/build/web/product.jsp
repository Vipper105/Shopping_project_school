<%@page import="model.GioHang"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="model.SanPham"%>
<%@page import="dao.SanPhamDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sản Phẩm</title>
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
        <%
            SanPhamDAOImpl sanPhamDAO = new SanPhamDAOImpl();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);

            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);

            }
        %>
        
        <div class="col-sm-9 padding-right">
            <div class="features_items">
                <!--features_items-->
                <h2 class="title text-center"></h2>
                <%
                    for (SanPham sp : sanPhamDAO.getListProductByCategory(request
                            .getParameter("ma_danh_muc"))) {
                %>
              
                <div class="col-sm-4">
                    <div class="product-image-wrapper">
                        <div class="single-products">
                            <div class="productinfo text-center">
                                <img src="images/<%=sp.getHinh_anh()%>" alt="" />
                                <h2><%=nf.format(sp.getDon_gia())%>
                                    VNĐ
                                </h2>
                                <p><%=sp.getTen_san_pham()%></p>
                                <a
                                    href="GioHangServlet2?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"
                                    class="btn btn-default add-to-cart"><i
                                        class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                            </div>
                            <div class="product-overlay">
                                <div class="overlay-content">
                                    <h2><%=nf.format(sp.getDon_gia())%>
                                        VNĐ
                                    </h2>
                                    <p><%=sp.getTen_san_pham()%></p>
                                    <a
                                        href="GioHangServlet2?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"
                                        class="btn btn-default add-to-cart"><i
                                            class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                </div>
                            </div>
                        </div>
                        <div class="choose">
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="#"><i class="fa fa-plus-square"></i>So sánh
                                    </a></li>
                                <li><a
                                        href="detail.jsp?ma_san_pham=<%=sp.getMa_san_pham()%>"><i
                                            class="fa fa-plus-square"></i>Xem chi tiết </a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>

            </div>
            <!--features_items-->
            <jsp:include page="SliderVIP.jsp"></jsp:include>
            

            <div class="recommended_items">
                <!--recommended_items-->
                <h2 class="title text-center">Sản Phẩm Hot</h2>

                <div id="recommended-item-carousel" class="carousel slide"
                     data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="item active">
                            <%
                                for (SanPham sp : sanPhamDAO.getListProductTop4()) {
                            %>
                            <div class="col-sm-4">
                                <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                            <img src="images/<%=sp.getHinh_anh()%>" alt="" />
                                            <h2><%=nf.format(sp.getDon_gia())%>
                                                VNĐ
                                            </h2>
                                            <p><%=sp.getTen_san_pham()%></p>
                                            <a
                                                href="GioHangServlet2?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"
                                                class="btn btn-default add-to-cart"><i
                                                    class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <%}%>
                        </div>
                        <div class="item">
                            <%
                                for (SanPham sp : sanPhamDAO.getListProductBotPrice())
                                        {
                            %>
                            <div class="col-sm-4">
                                <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                            <img src="images/<%=sp.getHinh_anh()%>" alt="" />
                                            <h2><%=nf.format(sp.getDon_gia())%>
                                                VNĐ
                                            </h2>
                                            <p><%=sp.getTen_san_pham()%></p>
                                            <a
                                                href="GioHangServlet2?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"
                                                class="btn btn-default add-to-cart"><i
                                                    class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <%}%>

                        </div>
                    </div>
                    <a class="left recommended-item-control"
                       href="#recommended-item-carousel" data-slide="prev"> <i
                            class="fa fa-angle-left"></i>
                    </a> <a class="right recommended-item-control"
                            href="#recommended-item-carousel" data-slide="next"> <i
                            class="fa fa-angle-right"></i>
                    </a>
                </div>
            </div>
            <!--/recommended_items-->

        </div>
    </body>
</html>