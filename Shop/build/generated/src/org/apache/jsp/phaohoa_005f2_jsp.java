package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phaohoa_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <script language=\"JavaScript1.2\">\n");
      out.write("var Ymax=8; //MAX # OF PIXEL STEPS IN THE \"X\" DIRECTION\n");
      out.write("var Xmax=8; //MAX # OF PIXEL STEPS IN THE \"Y\" DIRECTION\n");
      out.write("var Tmax=10000; //MAX # OF MILLISECONDS BETWEEN PARAMETER CHANGES\n");
      out.write("//FLOATING IMAGE URLS FOR EACH IMAGE. ADD OR DELETE ENTRIES. KEEP ELEMENT NUMERICAL ORDER STARTING WITH \"0\" !!\n");
      out.write("var floatimages=new Array();\n");
      out.write("floatimages[0]='http://4pvn.com.vn/img/Type/193.gif';\n");
      out.write("floatimages[1]='http://4pvn.com.vn/img/Type/193.gif';\n");
      out.write("floatimages[2]='http://4pvn.com.vn/img/Type/193.gif';\n");
      out.write("floatimages[3]='http://4pvn.com.vn/img/Type/193.gif';\n");
      out.write("//*********DO NOT EDIT BELOW***********\n");
      out.write("var NS4 = (navigator.appName.indexOf(\"Netscape\")>=0 && parseFloat(navigator.appVersion) >= 4 && parseFloat(navigator.appVersion) < 5)? true : false;\n");
      out.write("var IE4 = (document.all)? true : false;\n");
      out.write("var NS6 = (parseFloat(navigator.appVersion) >= 5 && navigator.appName.indexOf(\"Netscape\")>=0 )? true: false;\n");
      out.write("var wind_w, wind_h, t='', IDs=new Array();\n");
      out.write("for(i=0; i<floatimages.length; i++){\n");
      out.write("t+=(NS4)?'<layer name=\"pic'+i+'\" visibility=\"hide\" width=\"10\" height=\"10\"><a href=\"javascript:hidebutterfly()\">' : '<div id=\"pic'+i+'\" style=\"position:absolute; visibility:hidden;width:10px; height:10px\"><a href=\"javascript:hidebutterfly()\">';\n");
      out.write("t+='<img src=\"'+floatimages[i]+'\" name=\"p'+i+'\" border=\"0\">';\n");
      out.write("t+=(NS4)? '</a></layer>':'</a></div>';\n");
      out.write("}\n");
      out.write("document.write(t);\n");
      out.write("function moveimage(num){\n");
      out.write("if(getidleft(num)+IDs[num].W+IDs[num].Xstep >= wind_w+getscrollx())IDs[num].Xdir=false;\n");
      out.write("if(getidleft(num)-IDs[num].Xstep<=getscrollx())IDs[num].Xdir=true;\n");
      out.write("if(getidtop(num)+IDs[num].H+IDs[num].Ystep >= wind_h+getscrolly())IDs[num].Ydir=false;\n");
      out.write("if(getidtop(num)-IDs[num].Ystep<=getscrolly())IDs[num].Ydir=true;\n");
      out.write("moveidby(num, (IDs[num].Xdir)? IDs[num].Xstep : -IDs[num].Xstep , (IDs[num].Ydir)? IDs[num].Ystep: -IDs[num].Ystep);\n");
      out.write("}\n");
      out.write("function getnewprops(num){\n");
      out.write("IDs[num].Ydir=Math.floor(Math.random()*2)>0;\n");
      out.write("IDs[num].Xdir=Math.floor(Math.random()*2)>0;\n");
      out.write("IDs[num].Ystep=Math.ceil(Math.random()*Ymax);\n");
      out.write("IDs[num].Xstep=Math.ceil(Math.random()*Xmax)\n");
      out.write("setTimeout('getnewprops('+num+')', Math.floor(Math.random()*Tmax));\n");
      out.write("}\n");
      out.write("function getscrollx(){\n");
      out.write("if(NS4 || NS6)return window.pageXOffset;\n");
      out.write("if(IE4)return document.body.scrollLeft;\n");
      out.write("}\n");
      out.write("function getscrolly(){\n");
      out.write("if(NS4 || NS6)return window.pageYOffset;\n");
      out.write("if(IE4)return document.body.scrollTop;\n");
      out.write("}\n");
      out.write("function getid(name){\n");
      out.write("if(NS4)return document.layers[name];\n");
      out.write("if(IE4)return document.all[name];\n");
      out.write("if(NS6)return document.getElementById(name);\n");
      out.write("}\n");
      out.write("function moveidto(num,x,y){\n");
      out.write("if(NS4)IDs[num].moveTo(x,y);\n");
      out.write("if(IE4 || NS6){\n");
      out.write("IDs[num].style.left=x+'px';\n");
      out.write("IDs[num].style.top=y+'px';\n");
      out.write("}}\n");
      out.write("function getidleft(num){\n");
      out.write("if(NS4)return IDs[num].left;\n");
      out.write("if(IE4 || NS6)return parseInt(IDs[num].style.left);\n");
      out.write("}\n");
      out.write("function getidtop(num){\n");
      out.write("if(NS4)return IDs[num].top;\n");
      out.write("if(IE4 || NS6)return parseInt(IDs[num].style.top);\n");
      out.write("}\n");
      out.write("function moveidby(num,dx,dy){\n");
      out.write("if(NS4)IDs[num].moveBy(dx, dy);\n");
      out.write("if(IE4 || NS6){\n");
      out.write("IDs[num].style.left=(getidleft(num)+dx)+'px';\n");
      out.write("IDs[num].style.top=(getidtop(num)+dy)+'px';\n");
      out.write("}}\n");
      out.write("function getwindowwidth(){\n");
      out.write("if(NS4 || NS6)return window.innerWidth;\n");
      out.write("if(IE4)return document.body.clientWidth;\n");
      out.write("}\n");
      out.write("function getwindowheight(){\n");
      out.write("if(NS4 || NS6)return window.innerHeight;\n");
      out.write("if(IE4)return document.body.clientHeight;\n");
      out.write("}\n");
      out.write("function init(){\n");
      out.write("wind_w=getwindowwidth();\n");
      out.write("wind_h=getwindowheight();\n");
      out.write("for(i=0; i<floatimages.length; i++){\n");
      out.write("IDs[i]=getid('pic'+i);\n");
      out.write("if(NS4){\n");
      out.write("IDs[i].W=IDs[i].document.images[\"p\"+i].width;\n");
      out.write("IDs[i].H=IDs[i].document.images[\"p\"+i].height;\n");
      out.write("}\n");
      out.write("if(NS6 || IE4){\n");
      out.write("IDs[i].W=document.images[\"p\"+i].width;\n");
      out.write("IDs[i].H=document.images[\"p\"+i].height;\n");
      out.write("}\n");
      out.write("getnewprops(i);\n");
      out.write("moveidto(i , Math.floor(Math.random()*(wind_w-IDs[i].W)), Math.floor(Math.random()*(wind_h-IDs[i].H)));\n");
      out.write("if(NS4)IDs[i].visibility = \"show\";\n");
      out.write("if(IE4 || NS6)IDs[i].style.visibility = \"visible\";\n");
      out.write("startfly=setInterval('moveimage('+i+')',Math.floor(Math.random()*100)+100);\n");
      out.write("}}\n");
      out.write("function hidebutterfly(){\n");
      out.write("for(i=0; i<floatimages.length; i++){\n");
      out.write("if (IE4)\n");
      out.write("eval(\"document.all.pic\"+i+\".style.visibility='hidden'\")\n");
      out.write("else if (NS6)\n");
      out.write("document.getElementById(\"pic\"+i).style.visibility='hidden'\n");
      out.write("else if (NS4)\n");
      out.write("eval(\"document.pic\"+i+\".visibility='hide'\")\n");
      out.write("clearInterval(startfly)\n");
      out.write("}\n");
      out.write("}\n");
      out.write("if (NS4||NS6||IE4){\n");
      out.write("window.onload=init;\n");
      out.write("window.onresize=function(){ wind_w=getwindowwidth(); wind_h=getwindowheight(); }\n");
      out.write("}\n");
      out.write("</script>\n");
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
