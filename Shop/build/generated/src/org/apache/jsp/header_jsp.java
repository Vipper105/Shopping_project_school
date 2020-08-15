package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    </head>\r\n");
      out.write("    <!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"header\"><!--header-->\r\n");
      out.write("    <div class=\"header_top\">\r\n");
      out.write("        <!--header_top-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <div class=\"contactinfo\">\r\n");
      out.write("                        <ul class=\"nav nav-pills\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <div class=\"social-icons pull-right\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!--/header_top-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header-middle\">\r\n");
      out.write("        <!--header-middle-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <div class=\"logo pull-left\">\r\n");
      out.write("                        <a href=\"index.html\"><img src=\"images/0-thiet-ke-logo-shop-thiet-ke-bang-hieu-shop (1).png\" alt=\"\" height=\"90\" width=\"190\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <div class=\"shop-menu pull-right\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\" ></i> ");
      out.print(session.getAttribute("username"));
      out.write("</a></li>\r\n");
      out.write("                            <li><a href=\"RegisterServlet?command=logout\"><i class=\"fa fa-star\"></i>Logout</a></li>\r\n");
      out.write("                            <li><a href=\"checkout.jsp\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\r\n");
      out.write("                            <li><a href=\"cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\r\n");
      out.write("                            <li><a href=\"login.jsp\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!--/header-middle-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header-bottom\">\r\n");
      out.write("        <!--header-bottom-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                    <div class=\"search_box pull-right\">\r\n");
      out.write("                       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "style_search.jsp", out, false);
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("              \r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu_ngang.jsp", out, false);
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("    </div><!--/header-bottom-->\r\n");
      out.write("</header>\r\n");
      out.write("<!--/header-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
