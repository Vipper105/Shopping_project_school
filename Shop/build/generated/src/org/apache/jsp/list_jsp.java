package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.SanPham;
import dao.SanPhamDAOImpl;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            SanPhamDAOImpl spDAO = new SanPhamDAOImpl();
            ArrayList<SanPham> arr = spDAO.getList();
            int start = 0, end = 3;
            if (arr.size() < 3) {
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
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-9 padding-right\">\n");
      out.write("                            <div class=\"features_items\"><!--features_items-->\n");
      out.write("                                <h2 class=\"title text-center\">Features Items</h2>\n");
      out.write("                            ");
                                     for (SanPham sp : list) {
                            
      out.write("\n");
      out.write("                        <!--    <div class=\"col-sm-4\" data-href=\"list.jsp?ma_danh_muc=\">   -->\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"product-image-wrapper\">\n");
      out.write("                                    <div class=\"single-products\">\n");
      out.write("                                        <div class=\"productinfo text-center\">\n");
      out.write("                                            <img src=\"images/");
      out.print(sp.getHinh_anh());
      out.write("\" alt=\"\" />\n");
      out.write("                                            <h2>");
      out.print(sp.getDon_gia());
      out.write("</h2>\n");
      out.write("                                            <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"product-overlay\">\n");
      out.write("                                            <div class=\"overlay-content\">\n");
      out.write("                                                <h2>");
      out.print(sp.getDon_gia());
      out.write("</h2>\n");
      out.write("                                                <p>");
      out.print(sp.getTen_san_pham());
      out.write("</p>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"choose\">\n");
      out.write("                                        <ul class=\"nav nav-pills nav-justified\">\n");
      out.write("                                            <li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Add to wishlist</a></li>\n");
      out.write("                                            <li><a href=\"\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <div style=\"clear:both\"></div>\n");
      out.write("                            <ul class=\"pagination\">\n");
      out.write("                                ");

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
                                
      out.write("\n");
      out.write("                                <li><a href=\"list.jsp?start=");
      out.print(a);
      out.write("&end=");
      out.print(b);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!--features_items-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
