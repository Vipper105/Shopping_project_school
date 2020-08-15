package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.tanesha.recaptcha.ReCaptchaFactory;
import net.tanesha.recaptcha.ReCaptcha;
import facebook.FBConnection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
request.setCharacterEncoding("utf-8"); 
      out.write('\r');
      out.write('\n');
response.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	FBConnection fbConnection = new FBConnection();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"css/login.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/scrollbar.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String err="";
	if(request.getAttribute("err")!=null){
		err=(String) request.getAttribute("err");
	}
	
      out.write("\r\n");
      out.write("\t<!--/start-login-one-->\r\n");
      out.write("\t<div class=\"login-01\">\r\n");
      out.write("\t\t<div class=\"one-login  hvr-float-shadow\">\r\n");
      out.write("\t\t\t<div class=\"one-login-head\">\r\n");
      out.write("\t\t\t\t<img src=\"images/top-lock.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<h1>Đăng nhập</h1>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<form action=\"LoginAdminServlet\" method=\"post\">\r\n");
      out.write("\t\t\t<li style=\"color: red\">");
      out.print(err );
      out.write("</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" class=\"text\" value=\"Username\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Username';}\" name=\"username\"><a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\" icon user\"></a></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"password\" value=\"Password\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Password';}\" name=\"password\"><a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\" icon lock\"></a></li>\r\n");
      out.write("\t\t\t\t ");

          ReCaptcha c = ReCaptchaFactory.newReCaptcha("6LdlHOsSAAAAAM8ypy8W2KXvgMtY2dFsiQT3HVq-", "6LdlHOsSAAAAACe2WYaGCjU2sc95EZqCI9wLcLXY", false);
          out.print(c.createRecaptchaHtml(null, null));
        
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"submit\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\"  value=\"SIGN IN\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t<p>Hoặc bạn có thể đăng nhập theo các cách sau</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"soc_icons2\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"pic\"><a href=\"");
      out.print(fbConnection.getFBAuthUrl());
      out.write("\"><i class=\"icon_4\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"pic\"><a href=\"#\"><i class=\"icon_5\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"pic\"><a href=\"#\"><i class=\"icon_6\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\tBạn không có tài khoản ?<a href=\"register.jsp\"> Đăng kí </a>\r\n");
      out.write("\t\t\t\t</h5>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
