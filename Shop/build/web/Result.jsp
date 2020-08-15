<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Result</title>
   <link rel="stylesheet" href="css/404.css">
         <link rel="stylesheet" type="text/css" href="css/scrollbar.css"/>
<script type="text/javascript" src="js/smoothscroll.js"></script>
</head>
<body>
    <center>
        <h3 style="color: red;font-size:30px ">${requestScope.message}</h3>
    </center>
    <div class='bg-img'></div><div class='container'>
            <div class='row content'>
                <div class='col-lg-12'></div>
                <div class='col-lg-12'>
                   
                    <span class='btn'><a href="index.jsp" style="text-decoration: none;color: whitesmoke">RETURN HOME</a></span>
                    <span class='btn'><a href="contact.jsp" style="text-decoration: none;color: whitesmoke">REPORT PROBLEM</a></span>
                </div>
            </div>
        </div>
        <div class='bg-img'></div>
    
    
</body>
</html>