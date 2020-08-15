<%-- 
    Document   : list
    Created on : Jan 10, 2016, 3:37:03 PM
    Author     : dinhhuy
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SanPham"%>
<%@page import="dao.SanPhamDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </head>
    <body>
        <%
            SanPhamDAOImpl spDAO = new SanPhamDAOImpl();
            ArrayList<SanPham> arr = spDAO.getList();
            int start = 0, end = 9;
            if (arr.size() < 9) {
                end = arr.size();

            }
            if (request.getParameter("start") != null) {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end") != null) {
                end = Integer.parseInt(request.getParameter("end"));
            }
            ArrayList<SanPham> list = spDAO.getListByPage(arr, start, end);
//            String ma_san_pham=request.getParameter("ma_san_pham");
//String ma_danh_muc =request.getParameter("ma_danh_muc");

NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>



        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="slider.jsp"></jsp:include>
            <section>
                <div class="container">
                    <div class="row">
                    <jsp:include page="category.jsp"></jsp:include>


                        <div class="col-sm-9 padding-right">
                            <div class="features_items"><!--features_items-->
                                <h2 class="title text-center">Features Items</h2>
                            <%                                     for (SanPham sp : list) {
                            %>
                        <!--    <div class="col-sm-4" data-href="list.jsp?ma_danh_muc=">   -->
                            <div class="col-sm-4">
                                <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                            <img src="images/<%=sp.getHinh_anh()%>" alt="" />
                                            <h2><%=nf.format(sp.getDon_gia())%> VNĐ</h2>
                                            <p><%=sp.getTen_san_pham()%></p>
                                           <a
                                    href="GioHangServlet2?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"
                                    class="btn btn-default add-to-cart"><i
                                        class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                        </div>
                                        <div class="product-overlay">
                                            <div class="overlay-content">
                                                <h2><%=nf.format(sp.getDon_gia())%> VNĐ</h2>
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
                                            <li><a href=""><i class="fa fa-plus-square"></i>So sánh</a></li>
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
                            <div style="clear:both"></div>
                            <ul class="pagination">
                                <%
                                    int a, b;
                                    int limit = arr.size() / 9;
                                    if (limit * 9 < arr.size()) {
                                        limit += 1;
                                    }
                                    for (int i = 1; i <= limit; i++) {
                                        a = (i - 1) * 9;
                                        b = i * 9;
                                        if (b > arr.size()) {
                                            b = arr.size();
                                        }
                                %>
                                <li><a href="list.jsp?start=<%=a%>&end=<%=b%>"><%=i%></a></li>
                                    <%
                                        }
                                    %>

                            </ul>
                        </div><!--features_items-->
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="footer.jsp"></jsp:include>
        <jsp:include page="footer_2.jsp"></jsp:include>
    </body>
</html>
