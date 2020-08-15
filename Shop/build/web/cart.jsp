


<%@page import="dao.SanPhamDAOImpl"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.GioHang"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.Map"%>
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
        <%
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham, Integer> list = cart.getList();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
            double total = 0;
            SanPhamDAOImpl sanphamDAO = new SanPhamDAOImpl();

        %>
        <jsp:include page="header.jsp"></jsp:include>

        <section>
            <div class="container">
                <div class="row">

                    <section id="cart_items">
                        <div class="container">
                            <div class="breadcrumbs">
                                <ol class="breadcrumb">
                                    <li><a href="#">Home</a></li>
                                    <li class="active">Shopping Cart</li>
                                </ol>
                            </div>
                            <div class="table-responsive cart_info">
                                <table class="table table-condensed">
                                    <thead>
                                        <tr class="cart_menu">
                                            <td class="image">Tên sản phẩm</td>
                                            <td class="description"></td>
                                            <td class="price">Giá bán</td>
                                            <td class="quantity">Số lượng</td>
                                            <td class="total">Thành tiền</td>
                                            <td></td>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    <%for (Map.Entry<SanPham, Integer> ds : list.entrySet()) {
                                            total = total + (ds.getValue() * sanphamDAO.getSanPham(ds.getKey().getMa_san_pham()).getDon_gia());
                                    %>
                                    <tr>
                                        <td class="cart_product"><a href=""><img
                                                    src="images/<%=ds.getKey().getHinh_anh() %>" alt="" height="149px" width="109px"></a></td>
                                        <td class="cart_description">
                                            <h4>
                                                <a href=""><%=ds.getKey().getTen_san_pham()%></a>
                                            </h4>
                                            <p>Mã sản phẩm: <%=ds.getKey().getMa_san_pham()%></p>
                                        </td>
                                        <td class="cart_price">
                                            <p><%=nf.format(ds.getKey().getDon_gia())%> VNĐ</p>
                                        </td>
                                        <td class="cart_quantity">
                                            <div class="cart_quantity_button">
                                                <a class="cart_quantity_up" href="GioHangServlet2?command=plus&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> + </a> <input
                                                    class="cart_quantity_input" type="text" 
                                                    value="<%=ds.getValue()%>" autocomplete="off" size="2" disabled=""> <a
                                                    class="cart_quantity_down" href="GioHangServlet2?command=sub&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> - </a>
                                            </div>
                                        </td>
                                        <td class="cart_total">
                                            <p class="cart_total_price"><%=nf.format(ds.getValue() * ds.getKey().getDon_gia())%> VNĐ</p>
                                        </td>
                                        <td class="cart_delete"><a class="cart_quantity_delete"  href="GioHangServlet2?command=remove&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><i class="fa fa-times"></i></a></td>
                                    </tr>


                                    <%}%>
                                    <tr><td>
                                            <a class="btn btn-default update" href="list.jsp">Tiếp tục mua hàng</a>
                                        <td></tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </section>
                <!--/#cart_items-->

                <section id="do_action">
                    <div class="container">

                        <div class="row">

                            <div class="col-sm-6">
                                <div class="total_area">
                                    <ul>

                                        <li>TỔNG CỘNG :  <span style="font-size:25px;font-weight: bolder  "><%=nf.format(total)%> VNĐ</span></li>
                                    </ul>
                                    <a class="btn btn-default update" href="">Hủy Đơn Hàng</a> <a
                                        class="btn btn-default check_out" href="checkout.jsp">Thanh Toán</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <!--/#do_action-->
            </div>
        </div>
    </section>

    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>