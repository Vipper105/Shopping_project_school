package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"css/404.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='container'>\n");
      out.write("            <div class='row content'>\n");
      out.write("                <div class='col-lg-12'></div>\n");
      out.write("                <div class='col-lg-12'>\n");
      out.write("                    <h1>404</h1>\n");
      out.write("                    <h2>Oops, the page you're looking for does not exist.</h2>\n");
      out.write("                    <p>\n");
      out.write("                        You may want to head back to the homepage.\n");
      out.write("                        <br>\n");
      out.write("                        If you think something is broken, report a problem.\n");
      out.write("                        </br>\n");
      out.write("                    </p>\n");
      out.write("                    <span class='btn'>RETURN HOME</span>\n");
      out.write("                    <span class='btn'>REPORT PROBLEM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class='bg-img'></div><div class='container'>\n");
      out.write("            <div class='row content'>\n");
      out.write("                <div class='col-lg-12'></div>\n");
      out.write("                <div class='col-lg-12'>\n");
      out.write("                    <h1>404</h1>\n");
      out.write("                    <h2>Oops, the page you're looking for does not exist.</h2>\n");
      out.write("                    <p>\n");
      out.write("                        You may want to head back to the homepage.\n");
      out.write("                        <br>\n");
      out.write("                        If you think something is broken, report a problem.\n");
      out.write("                        </br>\n");
      out.write("                    </p>\n");
      out.write("                    <span class='btn'>RETURN HOME</span>\n");
      out.write("                    <span class='btn'>REPORT PROBLEM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class='bg-img'></div>\n");
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
