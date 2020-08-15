<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Multi-Item Slider với CSS3 animation và jQuery</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1" />
    <link rel="stylesheet" type="text/css" href="css/SliderVIP.css" media="all" />
    <link rel="icon" href="http://www.thuthuatweb.net/wp-content/themes/HostingSite/favicon.ico" type="image/x-ico"/>
    <script src="js/modernizr.custom.63321.js"></script>
</head>
<body>
<div class="container">

				<div id="mi-slider" class="mi-slider">
					<ul>
						<li><a href="#"><img src="images/28_1.jpg" alt="img01"><h4></h4></a></li>
                                               
						<li><a href="#"><img src="images/j2.jpg" alt="img03"><h4></h4></a></li>
                                                <li><a href="#"><img src="images/j03.jpeg" alt="img04"><h4></h4></a></li>
					</ul>
					<ul>
						<li><a href="#"><img src="images/j6.jpg" alt="img05"><h4></h4></a></li>
						
                                                <li><a href="#"><img src="images/j8.png" alt="img07"><h4></h4></a></li>
						<li><a href="#"><img src="images/j9.jpg" alt="img08"><h4></h4></a></li>
					</ul>
					<ul>
						<li><a href="#"><img src="images/j32.jpg" alt="img09"><h4></h4></a></li>
						<li><a href="#"><img src="images/j39.jpg" alt="img10"><h4></h4></a></li>
						<li><a href="#"><img src="images/j9.jpg" alt="img11"><h4></h4></a></li>
					</ul>
					<ul>
						<li><a href="#"><img src="images/j20.jpg" alt="img12"><h4></h4></a></li>
                                                <li><a href="#"><img src="images/j20.jpg" alt="img13"><h4></h4></a></li>
						<li><a href="#"><img src="images/j24.jpg" alt="img14"><h4></h4></a></li>
						
					</ul>
					<nav>
						<a href="#">Thể Thao</a>
						<a href="#">Tin Hằng Ngày</a>
						<a href="#">Du lịch</a>
						<a href="#">Hậu Trường</a>
					</nav>
				</div>
</div>




<script src="js/jquery.min.js"></script>
<script src="js/jquery.catslider.js"></script>
<script type="text/javascript">
    $(function() {

        $( '#mi-slider' ).catslider();

	});
</script>

</body>
</html>
