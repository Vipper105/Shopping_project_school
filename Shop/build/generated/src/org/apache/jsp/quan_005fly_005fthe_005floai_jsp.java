package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import model.DanhMuc;
import dao.DanhMucDAOImpl;

public final class quan_005fly_005fthe_005floai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <title>Quan ly the loai</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/scrollbar.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\"\r\n");
      out.write("              media=\"screen\" />\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/ie.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("                <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("                <![endif]-->\r\n");
      out.write("        <script src=\"js/jquery-1.5.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/hideshow.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.tablesorter.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.equalHeight.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            \r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $(\".tablesorter\").tablesorter();\r\n");
      out.write("            });\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("                //When page loads...\r\n");
      out.write("                $(\".tab_content\").hide(); //Hide all content\r\n");
      out.write("                $(\"ul.tabs li:first\").addClass(\"active\").show(); //Activate first tab\r\n");
      out.write("                $(\".tab_content:first\").show(); //Show first tab content\r\n");
      out.write("\r\n");
      out.write("                //On Click Event\r\n");
      out.write("                $(\"ul.tabs li\").click(function () {\r\n");
      out.write("\r\n");
      out.write("                    $(\"ul.tabs li\").removeClass(\"active\"); //Remove any \"active\" class\r\n");
      out.write("                    $(this).addClass(\"active\"); //Add \"active\" class to selected tab\r\n");
      out.write("                    $(\".tab_content\").hide(); //Hide all tab content\r\n");
      out.write("\r\n");
      out.write("                    var activeTab = $(this).find(\"a\").attr(\"href\"); //Find the href attribute value to identify the active tab + content\r\n");
      out.write("                    $(activeTab).fadeIn(); //Fade in the active ID content\r\n");
      out.write("                    return false;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('.column').equalHeight();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <header id=\"header\"> <hgroup>\r\n");
      out.write("            <h1 class=\"site_title\">\r\n");
      out.write("                <a href=\"#\">Admin</a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <h2 class=\"section_title\">Quản Lý Thể Loại</h2>\r\n");
      out.write("           \r\n");
      out.write("        </hgroup> </header>\r\n");
      out.write("    <!-- end of header bar -->\r\n");
      out.write("\r\n");
      out.write("    <section id=\"secondary_bar\">\r\n");
      out.write("        <div class=\"user\">\r\n");
      out.write("            <p>\r\n");
      out.write("                John Doe (<a href=\"#\">3 Messages</a>)\r\n");
      out.write("            </p>\r\n");
      out.write("            <!-- <a class=\"logout_user\" href=\"#\" title=\"Logout\">Logout</a> -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"breadcrumbs_container\">\r\n");
      out.write("            <article class=\"breadcrumbs\"> <a href=\"index.html\">Trang\r\n");
      out.write("                    Admin</a>\r\n");
      out.write("                <div class=\"breadcrumb_divider\"></div>\r\n");
      out.write("                <a class=\"current\">Quản Lý Thể Loại</a></article>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- end of secondary bar -->\r\n");
      out.write("\r\n");
      out.write("    <aside id=\"sidebar\" class=\"column\">\r\n");
      out.write("        <form class=\"quick_search\">\r\n");
      out.write("            <input type=\"text\" value=\"Quick Search\"\r\n");
      out.write("                   onfocus=\"if (!this._haschanged) {\r\n");
      out.write("                                    this.value = ''};this._haschanged = true;\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <hr />\r\n");
      out.write("        <h3>Nội Dung</h3>\r\n");
      out.write("        <ul class=\"toggle\">\r\n");
      out.write("            <li class=\"icn_new_article\"><a href=\"quan_ly_the_loai.jsp\">Thể Loại</a></li>\r\n");
      out.write("            <li class=\"icn_edit_article\"><a href=\"quan_ly_san_pham.jsp\">Sản Phẩm</a></li>\r\n");
      out.write("            <li class=\"icn_categories\"><a href=\"#\">Quản Lý Sản Phẩm</a></li>\r\n");
      out.write("            <li class=\"icn_tags\"><a href=\"#\">Sửa Sản Phẩm</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h3>Users</h3>\r\n");
      out.write("        <ul class=\"toggle\">\r\n");
      out.write("            <li class=\"icn_add_user\"><a href=\"#\">Add New User</a></li>\r\n");
      out.write("            <li class=\"icn_view_users\"><a href=\"#\">View Users</a></li>\r\n");
      out.write("            <li class=\"icn_profile\"><a href=\"#\">Your Profile</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h3>Media</h3>\r\n");
      out.write("        <ul class=\"toggle\">\r\n");
      out.write("            <li class=\"icn_folder\"><a href=\"#\">File Manager</a></li>\r\n");
      out.write("            <li class=\"icn_photo\"><a href=\"#\">Gallery</a></li>\r\n");
      out.write("            <li class=\"icn_audio\"><a href=\"#\">Audio</a></li>\r\n");
      out.write("            <li class=\"icn_video\"><a href=\"#\">Video</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h3>Admin</h3>\r\n");
      out.write("        <ul class=\"toggle\">\r\n");
      out.write("            <li class=\"icn_settings\"><a href=\"#\">Options</a></li>\r\n");
      out.write("            <li class=\"icn_security\"><a href=\"#\">Security</a></li>\r\n");
      out.write("            <li class=\"icn_jump_back\"><a href=\"RegisterServlet?command=logout\">Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("            <hr />\r\n");
      out.write("          \r\n");
      out.write("           \r\n");
      out.write("        </footer> </aside>\r\n");
      out.write("    <!-- end of sidebar -->\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\" class=\"column\">\r\n");
      out.write("\r\n");
      out.write("        <h4 class=\"alert_info\">Chào mừng bạn đến với trang quản lí :D</h4>\r\n");
      out.write("\r\n");
      out.write("        <article class=\"module width_full\"> <header>\r\n");
      out.write("                <h3>Stats</h3>\r\n");
      out.write("            </header>\r\n");
      out.write("            <div class=\"module_content\">\r\n");
      out.write("                <article class=\"stats_graph\"> <img\r\n");
      out.write("                        src=\"http://chart.apis.google.com/chart?chxr=0,0,3000&chxt=y&chs=520x140&cht=lc&chco=76A4FB,80C65A&chd=s:Tdjpsvyvttmiihgmnrst,OTbdcfhhggcTUTTUadfk&chls=2|2&chma=40,20,20,30\"\r\n");
      out.write("                        width=\"520\" height=\"140\" alt=\"\" /> </article>\r\n");
      out.write("\r\n");
      out.write("                <article class=\"stats_overview\">\r\n");
      out.write("                    <div class=\"overview_today\">\r\n");
      out.write("                        <p class=\"overview_day\">Today</p>\r\n");
      out.write("                        <p class=\"overview_count\">1,876</p>\r\n");
      out.write("                        <p class=\"overview_type\">Hits</p>\r\n");
      out.write("                        <p class=\"overview_count\">2,103</p>\r\n");
      out.write("                        <p class=\"overview_type\">Views</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"overview_previous\">\r\n");
      out.write("                        <p class=\"overview_day\">Yesterday</p>\r\n");
      out.write("                        <p class=\"overview_count\">1,646</p>\r\n");
      out.write("                        <p class=\"overview_type\">Hits</p>\r\n");
      out.write("                        <p class=\"overview_count\">2,054</p>\r\n");
      out.write("                        <p class=\"overview_type\">Views</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </article>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </article><!-- end of stats article --> <article class=\"module width_full\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <h3 class=\"tabs_involved\">Nội Dung Quản Lý</h3>\r\n");
      out.write("                <ul class=\"tabs\">\r\n");
      out.write("                    <li><a href=\"#tab1\">Đăng sản phẩm</a></li>\r\n");
      out.write("                    <li><a href=\"#tab2\"> Bình luận </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tab_container\">\r\n");
      out.write("                <div id=\"tab1\" class=\"tab_content\">\r\n");
      out.write("                    <table class=\"tablesorter\" cellspacing=\"0\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                                <th>Mã thể loại</th>\r\n");
      out.write("                                <th>Tên thể loại</th>\r\n");
      out.write("                                <th>Mô tả</th>\r\n");
      out.write("                                <th>Sửa</th>\r\n");
      out.write("                                <th>Xóa</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            DanhMucDAOImpl danhmucDAO = new DanhMucDAOImpl();
                            List<DanhMuc> list = new ArrayList<DanhMuc>();
                            list = danhmucDAO.getList();
                        
      out.write("\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                for (DanhMuc c : list) {
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>");
      out.print(c.getMa_danh_muc());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(c.getTen_danh_muc());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(c.getDanh_muc_cha());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <td><a href=\"sua_the_loai.jsp?ma_danh_muc=");
      out.print(c.getMa_danh_muc() );
      out.write("\"><img\r\n");
      out.write("                                            src=\"images/icn_edit.png\" alt=\"\" title=\"\" /></a></td>\r\n");
      out.write("                                <td><a href=\"XoaTheLoai?ma_danh_muc=");
      out.print(c.getMa_danh_muc() );
      out.write("\"><img\r\n");
      out.write("                                            src=\"images/icn_trash.png\" alt=\"\" title=\"\" /></a></td>\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end of #tab1 -->\r\n");
      out.write("\r\n");
      out.write("                <div id=\"tab2\" class=\"tab_content\">\r\n");
      out.write("                    <table class=\"tablesorter\" cellspacing=\"0\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                                <th>Comment</th>\r\n");
      out.write("                                <th>Posted by</th>\r\n");
      out.write("                                <th>Posted On</th>\r\n");
      out.write("                                <th>Actions</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>Lorem Ipsum Dolor Sit Amet</td>\r\n");
      out.write("                                <td>Mark Corrigan</td>\r\n");
      out.write("                                <td>5th April 2011</td>\r\n");
      out.write("                                <td><input type=\"image\" src=\"images/icn_edit.png\"\r\n");
      out.write("                                           title=\"Edit\"><input type=\"image\"\r\n");
      out.write("                                           src=\"images/icn_trash.png\" title=\"Trash\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>Ipsum Lorem Dolor Sit Amet</td>\r\n");
      out.write("                                <td>Jeremy Usbourne</td>\r\n");
      out.write("                                <td>6th April 2011</td>\r\n");
      out.write("                                <td><input type=\"image\" src=\"images/icn_edit.png\"\r\n");
      out.write("                                           title=\"Edit\"><input type=\"image\"\r\n");
      out.write("                                           src=\"images/icn_trash.png\" title=\"Trash\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end of #tab2 -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- end of .tab_container --> </article><!-- end of content manager article -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        ");

            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");

            }
        
      out.write(" <article class=\"module width_full\"> <header>\r\n");
      out.write("                <h3>THÊM THỂ LOẠI MỚI</h3>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"module_content\">\r\n");
      out.write("                <h2 style=\"color: red;\">");
      out.print(err );
      out.write("</h2>\r\n");
      out.write("                <form action=\"Them_the_loai\" method=\"post\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <label>Mã danh mục </label> <input type=\"text\" class=\"form_input\"\r\n");
      out.write("                                                           name=\"ma_danh_muc\" />\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <label>Tên danh mục </label> <input type=\"text\" class=\"form_input\"\r\n");
      out.write("                                                            name=\"ten_danh_muc\" />\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <label>Danh mục cha</label>\r\n");
      out.write("                        <textarea rows=\"9\" class=\"form_textarea\" name=\"danh_muc_cha\"></textarea>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"submit_link\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Lưu dữ liệu\" class=\"form_submit\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Reset\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </footer> </article><!-- end of post new article -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"spacer\"></div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
