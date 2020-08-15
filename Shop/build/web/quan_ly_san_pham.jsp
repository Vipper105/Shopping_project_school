

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.SanPham"%>
<%@page import="dao.SanPhamDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <title>quan ly san pham</title>
        <link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>
        <script type="text/javascript" src="js/smoothscroll.js"></script>

        <link rel="stylesheet" href="css/layout.css" type="text/css"
              media="screen" />
        <!--[if lt IE 9]>
                <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
                <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
                <![endif]-->
        <script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
        <script src="js/hideshow.js" type="text/javascript"></script>
        <script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/jquery.equalHeight.js"></script>
        <script type="text/javascript">

            $(document).ready(function () {
                $(".tablesorter").tablesorter();
            });
            $(document).ready(function () {

                //When page loads...
                $(".tab_content").hide(); //Hide all content
                $("ul.tabs li:first").addClass("active").show(); //Activate first tab
                $(".tab_content:first").show(); //Show first tab content

                //On Click Event
                $("ul.tabs li").click(function () {

                    $("ul.tabs li").removeClass("active"); //Remove any "active" class
                    $(this).addClass("active"); //Add "active" class to selected tab
                    $(".tab_content").hide(); //Hide all tab content

                    var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
                    $(activeTab).fadeIn(); //Fade in the active ID content
                    return false;
                });

            });
        </script>
        <script type="text/javascript">
            $(function () {
                $('.column').equalHeight();
            });
        </script>

    </head>


    <body>





    <header id="header"> <hgroup>
            <h1 class="site_title">
                <a href="index.html">Trang Admin</a>
            </h1>
            <h2 class="section_title">Quản Lý Sản Phẩm</h2>

        </hgroup> </header>
    <!-- end of header bar -->

    <section id="secondary_bar">
        <div class="user">
            <p>
                John Doe (<a href="#">3 Messages</a>)
            </p>
            <!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
        </div>
        <div class="breadcrumbs_container">
            <article class="breadcrumbs"> <a href="index.html">Website
                    Admin</a>
                <div class="breadcrumb_divider"></div>
                <a class="current">Quản Lý Sản Phẩm</a></article>
        </div>
    </section>
    <!-- end of secondary bar -->

    <aside id="sidebar" class="column">
        <form class="quick_search">
            <input type="text" value="Quick Search"
                   onfocus="if (!this._haschanged) {
                               this.value = ''
                           }
                           ;
                           this._haschanged = true;">
        </form>
        <hr />
        <h3>Nội Dung</h3>
        <ul class="toggle">
            <li class="icn_new_article"><a href="quan_ly_the_loai.jsp">Thể Loại </a></li>
            <li class="icn_edit_article"><a href="quan_ly_san_pham.jsp">Sản Phẩm</a></li>
            <li class="icn_categories"><a href="#">Categories</a></li>
            <li class="icn_tags"><a href="#">Tags</a></li>
        </ul>
        <h3>Users</h3>
        <ul class="toggle">
            <li class="icn_add_user"><a href="#">Add New User</a></li>
            <li class="icn_view_users"><a href="#">View Users</a></li>
            <li class="icn_profile"><a href="#">Your Profile</a></li>
        </ul>
        <h3>Media</h3>
        <ul class="toggle">
            <li class="icn_folder"><a href="#">File Manager</a></li>
            <li class="icn_photo"><a href="#">Gallery</a></li>
            <li class="icn_audio"><a href="#">Audio</a></li>
            <li class="icn_video"><a href="#">Video</a></li>
        </ul>
        <h3>Admin</h3>
        <ul class="toggle">
            <li class="icn_settings"><a href="#">Options</a></li>
            <li class="icn_security"><a href="#">Security</a></li>
            <li class="icn_jump_back"><a href="RegisterServlet?command=logout">Logout</a></li>
        </ul>

        <footer>
            <hr />


        </footer> </aside>
    <!-- end of sidebar -->

    <section id="main" class="column">

        <h4 class="alert_info">Chào mừng bạn đến với trang quản lí :D</h4>

        <article class="module width_full"> <header>
                <h3>Stats</h3>
            </header>
            <div class="module_content">
                <article class="stats_graph"> <img
                        src="http://chart.apis.google.com/chart?chxr=0,0,3000&chxt=y&chs=520x140&cht=lc&chco=76A4FB,80C65A&chd=s:Tdjpsvyvttmiihgmnrst,OTbdcfhhggcTUTTUadfk&chls=2|2&chma=40,20,20,30"
                        width="520" height="140" alt="" /> </article>

                <article class="stats_overview">
                    <div class="overview_today">
                        <p class="overview_day">Today</p>
                        <p class="overview_count">1,876</p>
                        <p class="overview_type">Hits</p>
                        <p class="overview_count">2,103</p>
                        <p class="overview_type">Views</p>
                    </div>
                    <div class="overview_previous">
                        <p class="overview_day">Yesterday</p>
                        <p class="overview_count">1,646</p>
                        <p class="overview_type">Hits</p>
                        <p class="overview_count">2,054</p>
                        <p class="overview_type">Views</p>
                    </div>
                </article>
                <div class="clear"></div>
            </div>
        </article><!-- end of stats article --> <article class="module width_full">
            <header>
                <h3 class="tabs_involved">Nội Dung Quản Lý</h3>
                <ul class="tabs">
                    <li><a href="#tab1">Đăng sản phẩm</a></li>
                    <li><a href="#tab2"> Bình luận </a></li>
                </ul>
            </header>

            <div class="tab_container">
                <div id="tab1" class="tab_content">
                    <table class="tablesorter" cellspacing="0">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Mã sản phẩm</th>
                                <th>Mã danh mục</th>
                                <th>Tên sản phẩm</th>
                                <th>Hình ảnh</th>
                                <th>Số lượng</th>
                                <th>Mô tả</th>
                                <th>Đơn giá</th>
                                <th>Giảm giá</th>
                                <th>Sửa</th>
                                <th>Xóa</th>


                            </tr>
                        </thead>

                        <%
                            SanPhamDAOImpl sanphamDAO = new SanPhamDAOImpl();
                            List<SanPham> list = new ArrayList<SanPham>();
                            list = sanphamDAO.getList();
                        %>
                        <tbody>
                            <%
                                for (SanPham sp : list) {
                            %>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td><%=sp.getMa_san_pham()%></td>
                                <td><%=sp.getDanh_muc().getMa_danh_muc()%></td>
                                <td><%=sp.getTen_san_pham()%></td>
                                <td><%=sp.getHinh_anh()%></td>
                                <td><%=sp.getSo_luong()%></td>
                                <td><%=sp.getMo_ta()%></td>
                                <td><%=sp.getDon_gia()%></td>
                                <td><%=sp.getGiam_gia()%></td>


                                <td><a href="sua_san_pham.jsp?ma_san_pham=<%=sp.getMa_san_pham()%>"><img
                                            src="images/icn_edit.png" alt="" title="" /></a></td>
                                <td><a href="Xoa_san_phamServlet?ma_san_pham=<%=sp.getMa_san_pham()%>"><img
                                            src="images/icn_trash.png" alt="" title="" /></a></td>

                            </tr>
                            <%
                                }
                            %>

                        </tbody>
                    </table>
                </div>
                <!-- end of #tab1 -->

                <div id="tab2" class="tab_content">
                    <table class="tablesorter" cellspacing="0">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Comment</th>
                                <th>Posted by</th>
                                <th>Posted On</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td>Lorem Ipsum Dolor Sit Amet</td>
                                <td>Mark Corrigan</td>
                                <td>5th April 2011</td>
                                <td><input type="image" src="images/icn_edit.png"
                                           title="Edit"><input type="image"
                                           src="images/icn_trash.png" title="Trash"></td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td>Ipsum Lorem Dolor Sit Amet</td>
                                <td>Jeremy Usbourne</td>
                                <td>6th April 2011</td>
                                <td><input type="image" src="images/icn_edit.png"
                                           title="Edit"><input type="image"
                                           src="images/icn_trash.png" title="Trash"></td>
                            </tr>

                        </tbody>
                    </table>

                </div>
                <!-- end of #tab2 -->

            </div>
            <!-- end of .tab_container --> </article><!-- end of content manager article -->





        <div class="clear"></div>
        <%
            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");

            }
        %> <article class="module width_full"> <header>
                <h3>THÊM SẢN PHẨM</h3>
            </header>

            <div class="module_content">
                <h2 style="color: red;"><%=err%></h2>
                <form action="Them_san_phamServlet" method="post">
                    <fieldset>
                        <label>Mã sản phẩm </label> <input type="text" class="form_input"
                                                           name="ma_san_pham" />
                    </fieldset>
                    <fieldset>
                        <label>Mã danh mục </label> <input type="text" class="form_input"
                                                           name="ma_danh_muc" />
                    </fieldset>
                    <fieldset>
                        <label>Tên sản phẩm </label> <input type="text" class="form_input"
                                                            name="ten_san_pham" />
                    </fieldset>
                    <fieldset>
                        <label>Hình ảnh </label> <input type="text" class="form_input"
                                                        name="hinh_anh" />
                    </fieldset>
                    <fieldset>
                        <label>Số lượng </label> <input type="text" class="form_input"
                                                        name="so_luong" />
                    </fieldset>
                    <fieldset>
                        <label>Mô tả</label> <input type="text" class="form_input"
                                                    name="mo_ta" />
                    </fieldset>
                    <fieldset>
                        <label>Đơn giá </label> <input type="text" class="form_input"
                                                       name="don_gia" />
                    </fieldset>
                    <fieldset>
                        <label>Giảm giá </label> <input type="text" class="form_input"
                                                        name="giam_gia" />
                    </fieldset>


                    <div class="clear"></div>
            </div>
            <footer>
                <div class="submit_link">
                    <input type="submit" value="Lưu dữ liệu" class="form_submit">
                    <input type="submit" value="Reset">

                </div>
                </form>
            </footer> </article><!-- end of post new article -->




        <div class="spacer"></div>
    </section>


</body>

</html>