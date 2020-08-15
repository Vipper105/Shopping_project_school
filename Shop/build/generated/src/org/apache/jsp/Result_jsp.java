package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("     \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Result</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/404.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/scrollbar.css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <center>\n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("    </center>\n");
      out.write("    <div class='bg-img'></div><div class='container'>\n");
      out.write("            <div class='row content'>\n");
      out.write("                <div class='col-lg-12'></div>\n");
      out.write("                <div class='col-lg-12'>\n");
      out.write("                    <h1>404</h1>\n");
      out.write("                    <h2>Trang bạn đang tìm kiếm không tồn tại</h2>\n");
      out.write("                    <p>\n");
      out.write("                        Bạn có thể trở lại trang chủ\n");
      out.write("                        <br>\n");
      out.write("                        Nếu bạn nghĩ có gì đó bị lỗi hãy thông báo cho chúng tôi\n");
      out.write("                        </br>\n");
      out.write("                    </p>\n");
      out.write("                    <span class='btn'><a href=\"index.jsp\" style=\"text-decoration: none;color: whitesmoke\">RETURN HOME</a></span>\n");
      out.write("                    <span class='btn'><a href=\"contact.jsp\" style=\"text-decoration: none;color: whitesmoke\">REPORT PROBLEM</a></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class='bg-img'></div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
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
