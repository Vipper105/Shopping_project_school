package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_005fngang_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>Pure CSS3 LavaLamp Menu | Script Tutorials</title>\n");
      out.write("        <link href=\"css/layout_1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("\n");
      out.write("            <ul id=\"nav\">\n");
      out.write("                \n");
      out.write("                <li><a href=\"index.jsp\"> HOME </a></li>\n");
      out.write("                \n");
      out.write("                <li><a class=\"hsubs\" href=\"#\"> GIỚI THIỆU </a>\n");
      out.write("                    <ul class=\"subs\">\n");
      out.write("                        <li><a href=\"#\"> Tin Tức </a></li>\n");
      out.write("                         <li><a href=\"#\"> Hoạt Động </a></li>\n");
      out.write("                         <li><a href=\"#\"> Hướng Dẫn Mua Hàng </a></li>\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"hsubs\" href=\"#\"> SHOP </a>\n");
      out.write("                    <ul class=\"subs\">\n");
      out.write("                        <li><a href=\"#\"> Sản Phẩm</a></li>\n");
      out.write("                        <li><a href=\"#\"> Chi Tiết Sản Phẩm</a></li>\n");
      out.write("                        <li><a href=\"#\"> Thanh Toán</a></li>\n");
      out.write("                        <li><a href=\"#\"> Giỏ Hàng</a></li>\n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                   <li><a href=\"#\">KHUYẾN MÃI</a></li>\n");
      out.write("                   <li><a href=\"login.jsp\">ĐĂNG NHẬP</a></li>\n");
      out.write("                   <li><a href=\"Shop/register.jsp\">ĐĂNG KÝ</a></li>\n");
      out.write("                   <li><a href=\"contact.jsp\">LIÊN HỆ</a></li>\n");
      out.write("                   <li><a href=\"404.jsp\" style=\"font-weight: bolder; \">404</a></li>\n");
      out.write("                \n");
      out.write("                <div id=\"lavalamp\"></div>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
