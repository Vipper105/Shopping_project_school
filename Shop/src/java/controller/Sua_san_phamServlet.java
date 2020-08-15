/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAOImpl;
import dao.SanPhamDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DanhMuc;

import model.SanPham;

/**
 *
 * @author dinhhuy
 */
public class Sua_san_phamServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private SanPhamDAOImpl sanphamDAO = new SanPhamDAOImpl();
   

    public Sua_san_phamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String ma_san_pham = request.getParameter("ma_san_pham");
        String ma_danh_muc = request.getParameter("ma_danh_muc");
        String ten_san_pham = request.getParameter("ten_san_pham");
        String hinh_anh = request.getParameter("hinh_anh");
        String so_luong = request.getParameter("so_luong");
        String mo_ta = request.getParameter("mo_ta");
        String don_gia = request.getParameter("don_gia");
        String giam_gia = request.getParameter("giam_gia");

        System.out.println(ma_san_pham + " - " + ma_danh_muc + " - " + ten_san_pham + " - " + hinh_anh + " - " + so_luong + " - " + mo_ta + " - " + don_gia + " - "+ giam_gia);
        String err = "";
        if (ma_san_pham.equals("")) {
            err += "Bạn chưa nhập mã sản phẩm, ";

        }
        if (ma_danh_muc.equals("")) {
            err += "Bạn chưa nhập mã danh mục, ";

        }
        if (ten_san_pham.equals("")) {
            err += "Bạn chưa nhập tên sản phẩm, ";
        }
        if (hinh_anh.equals("")) {
            err += "Bạn chưa nhập tên hình ảnh, ";
        }
        if (so_luong.equals("")) {
            err += "Bạn chưa nhập tên số lượng, ";
        }
        if (mo_ta.equals("")) {
            err += "Bạn chưa nhập mô tả, ";
        }
        if (don_gia.equals("")) {
            err += "Bạn chưa nhập đơn giá";
        }
         if (don_gia.equals("")) {
            err += "Bạn chưa nhập giảm giá";
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);

        }
        String url = "/sua_san_pham.jsp";
        try {
            if (err.length() == 0) {
               DanhMuc dm2=new DanhMuc();
               dm2.setMa_danh_muc(ma_danh_muc);
                  
                 int soluong = Integer.parseInt(so_luong);
                double dongia = Double.parseDouble(don_gia);
                int giamgia = Integer.parseInt(giam_gia);

                SanPham sp2 = new SanPham(ma_san_pham, dm2, ten_san_pham, hinh_anh, soluong, mo_ta, dongia, giamgia);
//                SanPham sp = new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha);
                sanphamDAO.updateSanPham(sp2);

                url = "/quan_ly_san_pham.jsp";

            } else {
                url = "/sua_san_pham.jsp";
            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(("/quan_ly_san_pham.jsp"));
        }
    }
}
