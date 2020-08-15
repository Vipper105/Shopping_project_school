
<%@ page import="net.tanesha.recaptcha.ReCaptchaImpl"%>
<%@ page import="net.tanesha.recaptcha.ReCaptchaResponse"%>

<html>
<head>
<title>CAPTCHA in Java using reCAPTCHA</title>
</head>
<body>
<h2>CAPTCHA in Java Application using reCAPTCHA</h2>
<p>
	<%
		String remoteAddr = request.getRemoteAddr();
		ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
		reCaptcha.setPrivateKey("6LdlHOsSAAAAACe2WYaGCjU2sc95EZqCI9wLcLXY");

		String challenge = request
				.getParameter("recaptcha_challenge_field");
		String uresponse = request.getParameter("recaptcha_response_field");
		ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(
				remoteAddr, challenge, uresponse);

		if (reCaptchaResponse.isValid()) {
//			String user = request
//					.getParameter("user");
//			out.print("CAPTCHA Validation Success! User "+user+" registered.");
                        response.sendRedirect("index.jsp");
		} else {
//			out.print("CAPTCHA Validation Failed! Try Again.");
response.sendRedirect("indexCAPCHA.jsp");
		}
	%>
</p>
<a href="index.jsp">Home</a>	
</body>
</html>