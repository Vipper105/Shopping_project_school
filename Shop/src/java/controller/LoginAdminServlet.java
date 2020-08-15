/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

/**
 *
 * @author dinhhuy
 */
public class LoginAdminServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAOImpl userDAO = new UserDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String remoteAddr = request.getRemoteAddr();
        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
        reCaptcha.setPrivateKey("6LdlHOsSAAAAACe2WYaGCjU2sc95EZqCI9wLcLXY");

        String challenge = request
                .getParameter("recaptcha_challenge_field");
        String uresponse = request.getParameter("recaptcha_response_field");
        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(
                remoteAddr, challenge, uresponse);
        String err = "";
        if (username.equals("") || password.equals("")) {
            err += "Phải nhập đầy đủ thông tin!";

        } else if (userDAO.login(username, password) == false) {
            err += "Tên đăng nhập,mật khẩu không đúng!";

        }else if(!(reCaptchaResponse.isValid())){
        err += "Nhập capcha sai!";
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);

        }
        String url = "/login.jsp";
        try {
            if (username.equals("admin") || password.equals("admin")) {
                url = "/quan_ly_the_loai.jsp";
            } else if (!(reCaptchaResponse.isValid())) {
                url = "/login.jsp";
//            }else{response.sendRedirect("login.jsp");}

            } else if (err.length() == 0) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                userDAO.login(username, password);
                url = "/index.jsp";

            } else {
                url = "/login.jsp";

            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/login.jsp");
        }

    }

}
