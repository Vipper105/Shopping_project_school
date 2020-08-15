package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trang_005fgioi_005fthieu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <meta name=\"description\" content=\"Horizontal Accordion\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/reset.css\"> <!-- CSS reset -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/trang_gioi_thieu.css\"> <!-- Resource style -->\n");
      out.write("\t<script src=\"js/modernizr.js\"></script> <!-- Modernizr -->\n");
      out.write("  \t\n");
      out.write("\t<title> Tạo trang giới thiệu ấn tượng với CSS3 và jQuery</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<section class=\"cd-section\">\n");
      out.write("\t\t<div class=\"cd-block\">\n");
      out.write("\t\t\t<h1>Chào Mừng Bạn Đã Ghé Thăm Trang Web Của Chúng Tôi</h1>\n");
      out.write("                        <a href=\"index.jsp\" style=\"font-size: 30px;font-weight:bolder;text-decoration:underline\">ĐẾN TRANG CHỦ   ===>></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!-- .cd-section -->\n");
      out.write("\n");
      out.write("\t<section class=\"cd-section\">\n");
      out.write("\t\t<div class=\"cd-block\">\n");
      out.write("\t\t\t<div class=\"cd-half-block\"></div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"cd-half-block\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("                                      >>>>>>>>>>>    ĐÂY LÀ BÁO !!!   <<<<<<<<<<<<\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!-- .cd-section -->\n");
      out.write("\n");
      out.write("\t<section class=\"cd-section\">\n");
      out.write("\t\t<div class=\"cd-block\">\n");
      out.write("\t\t\t<div class=\"cd-half-block\"></div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"cd-half-block\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t- BÁO CÓ MẶT KHẮP MỌI NƠI</br> - BÁO CUNG CẤP TIN TỨC </br>- BÁO GIÚP BẠN THƯ GIÃN \n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!-- .cd-section -->\n");
      out.write("\n");
      out.write("\t<section class=\"cd-section\">\n");
      out.write("\t\t<div class=\"cd-block\">\n");
      out.write("\t\t\t<div class=\"cd-half-block\"></div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"cd-half-block\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tHÃY NHƯ BÁO ! :DDDDD\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!-- .cd-section -->\n");
      out.write("\n");
      out.write("\t<nav>\n");
      out.write("\t\t<ul class=\"cd-vertical-nav\">\n");
      out.write("\t\t\t<li><a href=\"#0\" class=\"cd-prev inactive\">Next</a></li>\n");
      out.write("\t\t\t<li><a href=\"#0\" class=\"cd-next\">Prev</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</nav> <!-- .cd-vertical-nav -->\n");
      out.write("<script src=\"js/jquery-2.1.1.js\"></script>\n");
      out.write("<script src=\"js/trang_gioi_thieu.js\"></script> <!-- Resource jQuery -->\n");
      out.write("</body>\n");
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
