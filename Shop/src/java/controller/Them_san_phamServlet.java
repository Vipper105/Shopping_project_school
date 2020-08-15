/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SanPhamDAOImpl;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class Them_san_phamServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private SanPhamDAOImpl sanphamDAO = new SanPhamDAOImpl();

    public Them_san_phamServlet() {
    }

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
        String ma_san_pham = request.getParameter("ma_san_pham");
        String ma_danh_muc = request.getParameter("ma_danh_muc");
        String ten_san_pham = request.getParameter("ten_san_pham");
        String hinh_anh = request.getParameter("hinh_anh");
        String so_luong = request.getParameter("so_luong");
        String mo_ta = request.getParameter("mo_ta");
        String don_gia = request.getParameter("don_gia");
        String giam_gia = request.getParameter("giam_gia");

        System.out.println(ma_san_pham + " - " + ma_danh_muc + " - " + ten_san_pham + " - " + hinh_anh + " - " + so_luong + " - " + mo_ta + " - " + don_gia + " - " + giam_gia);
        String err = "";
        //kiem tra so nguyen-----------------------------------------------

//        String so_luong_err = "";
//        String don_gia_err = "";
//        String giam_gia_err = "";

        //--------------------------------------------------------------------
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
        if (giam_gia.equals("")) {
            err += "Bạn chưa nhập giảm giá";
        }

        // kiem tra so nguyen---------------------------------------------
//        Pattern pattern = Pattern.compile("\\d*");
//        Matcher matcher = pattern.matcher(so_luong);
//        if (matcher.matches()) {
//            System.out.println("Way3 - Is a Number");
//            so_luong_err = "";
//
//        } else {
//            System.out.println("Way2 - Not a Number");
//            so_luong_err = "bạn phải nhập số";
//        }
        //-------------------------------------------------------------------

        if (err.length() > 0) {
            request.setAttribute("err", err);
        }

        String url = "/quan_ly_san_pham.jsp";
        try {
            if (err.length() == 0) {
//                
                DanhMuc dm1 = new DanhMuc();
                dm1.setMa_danh_muc(ma_danh_muc);

                int soluong = Integer.parseInt(so_luong);
                double dongia = Double.parseDouble(don_gia);
                int giamgia = Integer.parseInt(giam_gia);

                SanPham sp = new SanPham(ma_san_pham, dm1, ten_san_pham, hinh_anh, soluong, mo_ta, dongia, giamgia);
//                            DanhMuc c = new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha);
//                SanPham sp = new SanPham(ma_san_pham,dm, ten_san_pham, hinh_anh, so_luong, mo_ta, don_gia);

                sanphamDAO.addSanPham(sp);
                url = "/quan_ly_san_pham.jsp";

            } else {
                url = "/quan_ly_san_pham.jsp";
            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(("quan_ly_san_pham.jsp"));
        }

    }
}
