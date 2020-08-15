/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAOImpl;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author dinhhuy
 */
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAOImpl userDAO = new UserDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("command").equals("logout")){
            HttpSession session=request.getSession();
            session.invalidate();
            response.sendRedirect("/Shop/index.jsp");
            
        }
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
        String fullname = request.getParameter("fullname");

        String err = "";
        String url = "/register.jsp";

        if (username.equals("") || password.equals("") || fullname.equals("")) {
            err += "Phải đăng nhập đầy đủ thông tin";

        } else if (userDAO.checkUser(username) == true) {
            err += "Tài khoản đã tồn tại";
        } else {
            Pattern pattenObj = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcherObj = pattenObj.matcher(username);

            if (!matcherObj.matches()) {
                err += "Email sai định dạng";

            }

        }
        if (err.length() > 0) {
            request.setAttribute("err", err);

        }

        try {
            if (err.length() == 0) {
                
                userDAO.addUser(new User("5", username, password, fullname, "2"));
                url = "/index.jsp";
            } else {
                url = "/register.jsp";

            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            response.sendRedirect("/register.jsp");
        }

    }

}
