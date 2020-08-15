
<%@page import="model.DanhMuc"%>
<%@page import="dao.DanhMucDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Danh Mục</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/prettyPhoto.css" rel="stylesheet">
<link href="css/price-range.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.scrollUp.min.js"></script>
<script src="js/price-range.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/main.js"></script>
<script type="text/javascript" src="js/smoothscroll.js"></script>
</head>
<body>
	<%
		DanhMucDAOImpl danhmucDAO = new DanhMucDAOImpl();
	%>
	<div class="col-sm-3">
		<div class="left-sidebar">
                    <h2></h2>
			<div class="panel-group category-products" id="accordian">
				<!--category-productsr-->
				<%
					for (DanhMuc danh_muc_cha : danhmucDAO.getListDanhMucCha()) {
				%>
				<div class="panel panel-default">
					<div class="c">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordian"
								href="#sportswear"> <span class="badge pull-right"><i
									class="fa fa-plus"></i></span> <%=danh_muc_cha.getTen_danh_muc()%>
							</a>
						</h4>
					</div>

					<div class="panel-body">
						<ul>
							<%
								for (DanhMuc danh_muc_con : danhmucDAO
											.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())) {
							%>
							<li><a
								href="index.jsp?ma_danh_muc=<%=danh_muc_con.getMa_danh_muc()%>"><%=danh_muc_con.getTen_danh_muc()%>
							</a></li>
							<%
								}
							%>
						</ul>
					</div>

				</div>
				<%
					}
				%>

			</div>
			<!--/category-products-->




			<!--/price-range-->

			<div class="shipping text-center">
				<!--shipping-->
                                <img src="images/tapthehinh_20150819_160x300.jpg" alt="" height="599" width="200"/>
                                 <img src="images/vothuat_20151006_160x450.gif" alt="" height="490" width="200"/>
			</div>
			<!--/shipping-->
			<div style="clear: both; margin-bottom: 20;"></div>
		</div>
	</div>
</body>
</html>