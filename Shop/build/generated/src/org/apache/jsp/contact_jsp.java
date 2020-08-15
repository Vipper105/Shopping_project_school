package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Liên Hệ</title>\r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <div id=\"contact-page\" class=\"container\">\r\n");
      out.write("                <div class=\"bg\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <div class=\"contact-form\">\r\n");
      out.write("                                <h2 class=\"title text-center\"> LIÊN LẠC </h2>\r\n");
      out.write("                                <div class=\"status alert alert-success\" style=\"display: none\"></div>\r\n");
      out.write("                                <form id=\"main-contact-form\" class=\"contact-form row\"\r\n");
      out.write("                                      method=\"post\" action=\"SendMailAttachServlet\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <input type=\"email\"  class=\"form-control\"\r\n");
      out.write("                                               required=\"required\" placeholder=\"Email nhận \" name=\"recipient\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\"\r\n");
      out.write("                                               required=\"required\" placeholder=\"Chủ đề . . .\" name=\"subject\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                                        <textarea  id=\"message\" required=\"required\"\r\n");
      out.write("                                                   class=\"form-control\" rows=\"9\" placeholder=\"Nội dung tin nhắn . . .\" name=\"content\"></textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                                       \r\n");
      out.write("                                        <td style=\"font-size:228 px;font-weight: bolder\">File Đính Kèm </td>\r\n");
      out.write("                                        <td><input type=\"file\" name=\"file\" size=\"290\" /></td>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                                        <input type=\"submit\" \r\n");
      out.write("                                               class=\"btn btn-primary pull-right\" value=\" Gởi Phản Hồi \">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"contact-info\">\r\n");
      out.write("                                <h2 class=\"title text-center\">Contact Info</h2>\r\n");
      out.write("                                <address>\r\n");
      out.write("                                    <p>E-Shopper Inc.</p>\r\n");
      out.write("                                    <p>935 W. Webster Ave New Streets Chicago, IL 60614, NY</p>\r\n");
      out.write("                                    <p>Newyork USA</p>\r\n");
      out.write("                                    <p>Mobile: +2346 17 38 93</p>\r\n");
      out.write("                                    <p>Fax: 1-714-252-0026</p>\r\n");
      out.write("                                    <p>Email: info@e-shopper.com</p>\r\n");
      out.write("                                </address>\r\n");
      out.write("                                <div class=\"social-networks\">\r\n");
      out.write("                                    <h2 class=\"title text-center\">Social Networking</h2>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/#contact-page-->\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
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
