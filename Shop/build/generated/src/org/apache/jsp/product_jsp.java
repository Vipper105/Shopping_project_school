package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.GioHang;
import java.text.NumberFormat;
import model.SanPham;
import dao.SanPhamDAOImpl;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>Sản Phẩm</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("        <script src=\"js/price-range.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/scrollbar.css\"/>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            SanPhamDAOImpl sanPhamDAO = new SanPhamDAOImpl();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);

            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);

            }
            
// phan trang

 
            ArrayList<SanPham> arr = sanPhamDAO.getList();
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
            ArrayList<SanPham> list = sanPhamDAO.getListByPage(arr, start, end);
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-sm-9 padding-right\">\r\n");
      out.write("            <div class=\"features_items\">\r\n");
      out.write("                <!--features_items-->\r\n");
      out.write("                <h2 class=\"title text-center\"></h2>\r\n");
      out.write("                ");

                    for (SanPham sp : sanPhamDAO.getListProductByCategory(request
                            .getParameter("ma_danh_muc"))) {
                       
                
      out.write("\r\n");
      out.write("              \r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <div class=\"product-image-wrapper\">\r\n");
      out.write("                        <div class=\"single-products\">\r\n");
      out.write("                            <div class=\"productinfo text-center\">\r\n");
      out.write("                                <img src=\"images/");
      out.print(sp.getHinh_anh());
      out.write("\" alt=\"\" />\r\n");
      out.write("                                <h2>");
      out.print(nf.format(sp.getDon_gia()));
      out.write("\r\n");
      out.write("                                    VNĐ\r\n");
      out.write("                                </h2>\r\n");
      out.write("                                <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\r\n");
      out.write("                                <a\r\n");
      out.write("                                    href=\"GioHangServlet2?command=insert&ma_san_pham=");
      out.print(sp.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"\r\n");
      out.write("                                    class=\"btn btn-default add-to-cart\"><i\r\n");
      out.write("                                        class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-overlay\">\r\n");
      out.write("                                <div class=\"overlay-content\">\r\n");
      out.write("                                    <h2>");
      out.print(nf.format(sp.getDon_gia()));
      out.write("\r\n");
      out.write("                                        VNĐ\r\n");
      out.write("                                    </h2>\r\n");
      out.write("                                    <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\r\n");
      out.write("                                    <a\r\n");
      out.write("                                        href=\"GioHangServlet2?command=insert&ma_san_pham=");
      out.print(sp.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"\r\n");
      out.write("                                        class=\"btn btn-default add-to-cart\"><i\r\n");
      out.write("                                            class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"choose\">\r\n");
      out.write("                            <ul class=\"nav nav-pills nav-justified\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>So sánh\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li><a\r\n");
      out.write("                                        href=\"detail.jsp?ma_san_pham=");
      out.print(sp.getMa_san_pham());
      out.write("\"><i\r\n");
      out.write("                                            class=\"fa fa-plus-square\"></i>Xem chi tiết </a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
}
                    
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--features_items-->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SliderVIP.jsp", out, false);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div class=\"recommended_items\">\r\n");
      out.write("                <!--recommended_items-->\r\n");
      out.write("                <h2 class=\"title text-center\">recommended items</h2>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"recommended-item-carousel\" class=\"carousel slide\"\r\n");
      out.write("                     data-ride=\"carousel\">\r\n");
      out.write("                    <div class=\"carousel-inner\">\r\n");
      out.write("                        <div class=\"item active\">\r\n");
      out.write("                            ");

                                for (SanPham sp : sanPhamDAO.getListProductTop4()) {
                            
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <div class=\"product-image-wrapper\">\r\n");
      out.write("                                    <div class=\"single-products\">\r\n");
      out.write("                                        <div class=\"productinfo text-center\">\r\n");
      out.write("                                            <img src=\"images/");
      out.print(sp.getHinh_anh());
      out.write("\" alt=\"\" />\r\n");
      out.write("                                            <h2>");
      out.print(nf.format(sp.getDon_gia()));
      out.write("\r\n");
      out.write("                                                VNĐ\r\n");
      out.write("                                            </h2>\r\n");
      out.write("                                            <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\r\n");
      out.write("                                            <a\r\n");
      out.write("                                                href=\"GioHangServlet2?command=insert&ma_san_pham=");
      out.print(sp.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"\r\n");
      out.write("                                                class=\"btn btn-default add-to-cart\"><i\r\n");
      out.write("                                                    class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            ");

                                for (SanPham sp : sanPhamDAO.getListProductBotPrice())
                                        {
                            
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <div class=\"product-image-wrapper\">\r\n");
      out.write("                                    <div class=\"single-products\">\r\n");
      out.write("                                        <div class=\"productinfo text-center\">\r\n");
      out.write("                                            <img src=\"images/");
      out.print(sp.getHinh_anh());
      out.write("\" alt=\"\" />\r\n");
      out.write("                                            <h2>");
      out.print(nf.format(sp.getDon_gia()));
      out.write("\r\n");
      out.write("                                                VNĐ\r\n");
      out.write("                                            </h2>\r\n");
      out.write("                                            <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\r\n");
      out.write("                                            <a\r\n");
      out.write("                                                href=\"GioHangServlet2?command=insert&ma_san_pham=");
      out.print(sp.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"\r\n");
      out.write("                                                class=\"btn btn-default add-to-cart\"><i\r\n");
      out.write("                                                    class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a class=\"left recommended-item-control\"\r\n");
      out.write("                       href=\"#recommended-item-carousel\" data-slide=\"prev\"> <i\r\n");
      out.write("                            class=\"fa fa-angle-left\"></i>\r\n");
      out.write("                    </a> <a class=\"right recommended-item-control\"\r\n");
      out.write("                            href=\"#recommended-item-carousel\" data-slide=\"next\"> <i\r\n");
      out.write("                            class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/recommended_items-->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
