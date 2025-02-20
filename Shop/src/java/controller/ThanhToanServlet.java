/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ChiTietHoaDonDAOImpl;
import dao.HoaDonDAOImpl;
import dao.UserDAOImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ChiTietHoaDon;
import model.GioHang;
import model.HoaDon;
import model.SanPham;
import model.User;



/**
 *
 * @author dinhhuy
 */
public class ThanhToanServlet extends HttpServlet {

    private HoaDonDAOImpl hdDAO = new HoaDonDAOImpl();
    private ChiTietHoaDonDAOImpl cthdDAO = new ChiTietHoaDonDAOImpl();
    private UserDAOImpl tkDAO=new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String dia_chi_giao_hang = request.getParameter("dia_chi_giao_hang");
        String phuong_thuc_thanh_toan = request.getParameter("phuong_thuc_thanh_toan");
        String tai_khoan = request.getParameter("tai_khoan");

        HttpSession session = request.getSession();
        GioHang cart = (GioHang) session.getAttribute("cart");

        try {

            Date date = new Date();
            String mhd = "" + date.getTime();
            User tk = new User();
//            tk.setUser_id(tkDAO.getTaiKhoan(tai_khoan).getUser_id());
            tk.setUser_id(tai_khoan);
            HoaDon hd = new HoaDon(mhd,tk , dia_chi_giao_hang, phuong_thuc_thanh_toan, new Timestamp(new Date().getTime()), 0);
            hd.setMa_hoa_don(mhd);
            hdDAO.themHoaDon(hd);
            TreeMap<SanPham,Integer> list=cart.getList();
            for(Map.Entry<SanPham,Integer> ds:list.entrySet()){
                SanPham sp=new SanPham();
                sp.setMa_san_pham(ds.getKey().getMa_san_pham());
                cthdDAO.themChiTietHD(new ChiTietHoaDon(0, hd,sp, ds.getValue(), ds.getKey().getDon_gia(),ds.getKey().getGiam_gia()));
            }
                response.sendRedirect("/Shop/404.jsp");
                
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
