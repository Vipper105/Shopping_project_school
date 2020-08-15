package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SliderVIP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Multi-Item Slider v?i CSS3 animation và jQuery</title>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/SliderVIP.css\" media=\"all\" />\n");
      out.write("    <link rel=\"icon\" href=\"http://www.thuthuatweb.net/wp-content/themes/HostingSite/favicon.ico\" type=\"image/x-ico\"/>\n");
      out.write("    <script src=\"js/modernizr.custom.63321.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"mi-slider\" class=\"mi-slider\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/1.jpg\" alt=\"img01\"><h4>Boots</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/2.jpg\" alt=\"img02\"><h4>Oxfords</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/3.jpg\" alt=\"img03\"><h4>Loafers</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/4.jpg\" alt=\"img04\"><h4>Sneakers</h4></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/5.jpg\" alt=\"img05\"><h4>Belts</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/6.jpg\" alt=\"img06\"><h4>Hats &amp; Caps</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/7.jpg\" alt=\"img07\"><h4>Sunglasses</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/8.jpg\" alt=\"img08\"><h4>Scarves</h4></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/9.jpg\" alt=\"img09\"><h4>Casual</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/10.jpg\" alt=\"img10\"><h4>Luxury</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/11.jpg\" alt=\"img11\"><h4>Sport</h4></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/12.jpg\" alt=\"img12\"><h4>Carry-Ons</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/13.jpg\" alt=\"img13\"><h4>Duffel Bags</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/14.jpg\" alt=\"img14\"><h4>Laptop Bags</h4></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/15.jpg\" alt=\"img15\"><h4>Briefcases</h4></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Shoes</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Accessories</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Watches</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Bags</a>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.catslider.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function() {\n");
      out.write("\n");
      out.write("        $( '#mi-slider' ).catslider();\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
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
