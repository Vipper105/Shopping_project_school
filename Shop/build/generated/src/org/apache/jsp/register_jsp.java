package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/scrollbar.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("<link href=\"css/register.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	String err="";
	if(request.getAttribute("err")!=null){
		err=(String) request.getAttribute("err");
	}
	
      out.write("\r\n");
      out.write("\t<div class=\"login-02\">\r\n");
      out.write("\t\t<div class=\"two-login  hvr-float-shadow\">\r\n");
      out.write("\t\t\t<div class=\"two-login-head\">\r\n");
      out.write("\t\t\t\t<img src=\"images/top-note.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<h2>Đăng kí</h2>\r\n");
      out.write("\t\t\t\t<lable></lable>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("\t\t\t<li style=\"color: red\">");
      out.print(err );
      out.write("</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" class=\"text\" value=\"Username\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Username';}\"\r\n");
      out.write("\t\t\t\t\tname=\"username\"><a href=\"#\" class=\" icon2 user2\"></a></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"password\" value=\"Password\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Password';}\"\r\n");
      out.write("\t\t\t\t\tname=\"password\"><a href=\"#\" class=\" icon2 lock2\"></a></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" value=\"Fullname\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Fullname';}\"\r\n");
      out.write("\t\t\t\t\tname=\"fullname\"><a href=\"#\" class=\" icon2 lock2\"></a></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"submit two\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"SIGN UP\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\tAlready a member ?<a href=\"login.jsp\"> Login Here</a>\r\n");
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
