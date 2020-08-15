package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memu_005fdoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Slide Down Box Menu with jQuery and CSS3</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"description\" content=\"Slide Down Box Menu with jQuery and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"jquery, css3, sliding, box, menu, cube, navigation, portfolio, thumbnails\"/>\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu_animation_beautiful.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("        <style>\n");
      out.write("\t\t\tbody{\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tfont-family:Arial;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tspan.reference{\n");
      out.write("\t\t\t\tposition:fixed;\n");
      out.write("\t\t\t\tleft:10px;\n");
      out.write("\t\t\t\tbottom:10px;\n");
      out.write("\t\t\t\tfont-size:12px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tspan.reference a{\n");
      out.write("\t\t\t\tcolor:#aaa;\n");
      out.write("\t\t\t\ttext-transform:uppercase;\n");
      out.write("\t\t\t\ttext-decoration:none;\n");
      out.write("\t\t\t\ttext-shadow:1px 1px 1px #000;\n");
      out.write("\t\t\t\tmargin-right:30px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tspan.reference a:hover{\n");
      out.write("\t\t\t\tcolor:#ddd;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tul.sdt_menu{\n");
      out.write("\t\t\t\tmargin-top:-350px;\n");
      out.write("                               \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\th1.title{\n");
      out.write("\t\t\t\ttext-indent:-9000px;\n");
      out.write("\t\t\t\tbackground:transparent url(title.png) no-repeat top left;\n");
      out.write("\t\t\t\twidth:633px;\n");
      out.write("\t\t\t\theight:69px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<h1 class=\"title\">Slide Down Box Menu with jQuery and CSS3</h1>\n");
      out.write("\t\t\t<ul id=\"sdt_menu\" class=\"sdt_menu\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/2.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">About me</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">Get to know me</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/1.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">Portfolio</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">My work</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"sdt_box\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Websites</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Illustrations</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Photography</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/3.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">Inspiration</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">Where ideas get born</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/4.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">Photos</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">I like to photograph</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/5.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">Blog</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">I write about design</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/6.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_active\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"sdt_wrap\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_link\">Projects</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sdt_descr\">I like to code</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"sdt_box\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Job Board Website</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Shopping Cart</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Interactive Maps</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("        <div>\n");
      out.write("            <span class=\"reference\">\n");
      out.write("                <a href=\"http://tympanus.net/codrops/2010/07/16/slide-down-box-menu/\">back to the Codrops Tutorial</a>\n");
      out.write("\t\t\t\t<a href=\"http://www.flickr.com/photos/arcticpuppy/sets/72157622090180990/\">Images by tibchris</a>\n");
      out.write("            </span>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("        <!-- The JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("\t\t\t\t/**\n");
      out.write("\t\t\t\t* for each menu element, on mouseenter, \n");
      out.write("\t\t\t\t* we enlarge the image, and show both sdt_active span and \n");
      out.write("\t\t\t\t* sdt_wrap span. If the element has a sub menu (sdt_box),\n");
      out.write("\t\t\t\t* then we slide it - if the element is the last one in the menu\n");
      out.write("\t\t\t\t* we slide it to the left, otherwise to the right\n");
      out.write("\t\t\t\t*/\n");
      out.write("                $('#sdt_menu > li').bind('mouseenter',function(){\n");
      out.write("\t\t\t\t\tvar $elem = $(this);\n");
      out.write("\t\t\t\t\t$elem.find('img')\n");
      out.write("\t\t\t\t\t\t .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({\n");
      out.write("\t\t\t\t\t\t\t'width':'170px',\n");
      out.write("\t\t\t\t\t\t\t'height':'170px',\n");
      out.write("\t\t\t\t\t\t\t'left':'0px'\n");
      out.write("\t\t\t\t\t\t },400,'easeOutBack')\n");
      out.write("\t\t\t\t\t\t .andSelf()\n");
      out.write("\t\t\t\t\t\t .find('.sdt_wrap')\n");
      out.write("\t\t\t\t\t     .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({'top':'140px'},500,'easeOutBack')\n");
      out.write("\t\t\t\t\t\t .andSelf()\n");
      out.write("\t\t\t\t\t\t .find('.sdt_active')\n");
      out.write("\t\t\t\t\t     .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({'height':'170px'},300,function(){\n");
      out.write("\t\t\t\t\t\tvar $sub_menu = $elem.find('.sdt_box');\n");
      out.write("\t\t\t\t\t\tif($sub_menu.length){\n");
      out.write("\t\t\t\t\t\t\tvar left = '170px';\n");
      out.write("\t\t\t\t\t\t\tif($elem.parent().children().length == $elem.index()+1)\n");
      out.write("\t\t\t\t\t\t\t\tleft = '-170px';\n");
      out.write("\t\t\t\t\t\t\t$sub_menu.show().animate({'left':left},200);\n");
      out.write("\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}).bind('mouseleave',function(){\n");
      out.write("\t\t\t\t\tvar $elem = $(this);\n");
      out.write("\t\t\t\t\tvar $sub_menu = $elem.find('.sdt_box');\n");
      out.write("\t\t\t\t\tif($sub_menu.length)\n");
      out.write("\t\t\t\t\t\t$sub_menu.hide().css('left','0px');\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t$elem.find('.sdt_active')\n");
      out.write("\t\t\t\t\t\t .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({'height':'0px'},300)\n");
      out.write("\t\t\t\t\t\t .andSelf().find('img')\n");
      out.write("\t\t\t\t\t\t .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({\n");
      out.write("\t\t\t\t\t\t\t'width':'0px',\n");
      out.write("\t\t\t\t\t\t\t'height':'0px',\n");
      out.write("\t\t\t\t\t\t\t'left':'85px'},400)\n");
      out.write("\t\t\t\t\t\t .andSelf()\n");
      out.write("\t\t\t\t\t\t .find('.sdt_wrap')\n");
      out.write("\t\t\t\t\t\t .stop(true)\n");
      out.write("\t\t\t\t\t\t .animate({'top':'25px'},500);\n");
      out.write("\t\t\t\t});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("               \n");
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
