/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DanhMuc;

/**
 *
 * @author dinhhuy
 */
public class Them_the_loai extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private DanhMucDAOImpl categoryDAO = new DanhMucDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Them_the_loai() {
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
        String ma_danh_muc = request.getParameter("ma_danh_muc");
        String ten_danh_muc = request.getParameter("ten_danh_muc");
        String danh_muc_cha = request.getParameter("danh_muc_cha");

        System.out.println(ma_danh_muc + " - " + ten_danh_muc + " - " + danh_muc_cha);
        String err = "";
        if (ma_danh_muc.equals("")) {
            err += "Bạn chưa nhập mã danh mục";

        }
        if (ten_danh_muc.equals("")) {
            err += "Bạn chưa nhập tên danh mục";

        }
        if (danh_muc_cha.equals("")) {
            err += "Bạn chưa nhập danh mục cha ";
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);

        }
        String url = "/quan_ly_the_loai.jsp";
        try {
            if (err.length() == 0) {
                DanhMuc c = new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha);
                categoryDAO.addDanhMuc(c);
                url = "/quan_ly_the_loai.jsp";

            } else {
                url = "/quan_ly_the_loai.jsp";
            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(("quan_ly_the_loai.jsp"));
        }

    }

}
