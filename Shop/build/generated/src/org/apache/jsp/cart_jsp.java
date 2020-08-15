package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.SanPhamDAOImpl;
import java.text.NumberFormat;
import java.util.TreeMap;
import model.GioHang;
import model.SanPham;
import java.util.Map;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>Insert title here</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

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

        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <section id=\"cart_items\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"breadcrumbs\">\r\n");
      out.write("                                <ol class=\"breadcrumb\">\r\n");
      out.write("                                    <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                                    <li class=\"active\">Shopping Cart</li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"table-responsive cart_info\">\r\n");
      out.write("                                <table class=\"table table-condensed\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr class=\"cart_menu\">\r\n");
      out.write("                                            <td class=\"image\">Tên sản phẩm</td>\r\n");
      out.write("                                            <td class=\"description\"></td>\r\n");
      out.write("                                            <td class=\"price\">Giá bán</td>\r\n");
      out.write("                                            <td class=\"quantity\">Số lượng</td>\r\n");
      out.write("                                            <td class=\"total\">Thành tiền</td>\r\n");
      out.write("                                            <td></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("\r\n");
      out.write("                                    ");
for (Map.Entry<SanPham, Integer> ds : list.entrySet()) {
                                            total = total + (ds.getValue() * sanphamDAO.getSanPham(ds.getKey().getMa_san_pham()).getDon_gia());
                                    
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td class=\"cart_product\"><a href=\"\"><img\r\n");
      out.write("                                                    src=\"images/");
      out.print(ds.getKey().getHinh_anh() );
      out.write("\" alt=\"\" height=\"149px\" width=\"109px\"></a></td>\r\n");
      out.write("                                        <td class=\"cart_description\">\r\n");
      out.write("                                            <h4>\r\n");
      out.write("                                                <a href=\"\">");
      out.print(ds.getKey().getTen_san_pham());
      out.write("</a>\r\n");
      out.write("                                            </h4>\r\n");
      out.write("                                            <p>Mã sản phẩm: ");
      out.print(ds.getKey().getMa_san_pham());
      out.write("</p>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"cart_price\">\r\n");
      out.write("                                            <p>");
      out.print(nf.format(ds.getKey().getDon_gia()));
      out.write(" VNĐ</p>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"cart_quantity\">\r\n");
      out.write("                                            <div class=\"cart_quantity_button\">\r\n");
      out.write("                                                <a class=\"cart_quantity_up\" href=\"GioHangServlet2?command=plus&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> + </a> <input\r\n");
      out.write("                                                    class=\"cart_quantity_input\" type=\"text\" \r\n");
      out.write("                                                    value=\"");
      out.print(ds.getValue());
      out.write("\" autocomplete=\"off\" size=\"2\" disabled=\"\"> <a\r\n");
      out.write("                                                    class=\"cart_quantity_down\" href=\"GioHangServlet2?command=sub&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> - </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"cart_total\">\r\n");
      out.write("                                            <p class=\"cart_total_price\">");
      out.print(nf.format(ds.getValue() * ds.getKey().getDon_gia()));
      out.write(" VNĐ</p>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"cart_delete\"><a class=\"cart_quantity_delete\"  href=\"GioHangServlet2?command=remove&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"><i class=\"fa fa-times\"></i></a></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                    <tr><td>\r\n");
      out.write("                                            <a class=\"btn btn-default update\" href=\"index.jsp\">Tiếp tục mua hàng</a>\r\n");
      out.write("                                        <td></tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <!--/#cart_items-->\r\n");
      out.write("\r\n");
      out.write("                <section id=\"do_action\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"total_area\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("\r\n");
      out.write("                                        <li>TỔNG CỘNG :  <span style=\"font-size:25px;font-weight: bolder  \">");
      out.print(nf.format(total));
      out.write(" VNĐ</span></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <a class=\"btn btn-default update\" href=\"\">Hủy Đơn Hàng</a> <a\r\n");
      out.write("                                        class=\"btn btn-default check_out\" href=\"checkout.jsp\">Thanh Toán</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <!--/#do_action-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer2.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
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
