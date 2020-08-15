/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import model.HoaDon;

/**
 *
 * @author dinhhuy
 */
public class HoaDonDAOImpl implements HoaDonDAO {

    @Override
    public void themHoaDon(HoaDon hd) {
        Connection con = DBConnect.getConnecttion();
        String sql = "insert into hoa_don value(?,?,?,?,?,?)"; // cau lenh sql
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, hd.getMa_hoa_don());
            ps.setString(2, hd.getTai_khoan().getUser_id());
            ps.setString(3, hd.getDia_chi_giao_hang());
            ps.setString(4, hd.getPhuong_thuc_thanh_toan());
            ps.setTimestamp(5, hd.getNgay_mua_hang());
            ps.setInt(6, hd.getTinh_trang_don_hang());

            ps.executeUpdate();
            con.close();
            System.out.println("da them hoa don");
        } catch (SQLException e) {
            System.out.println("chua them duoc hoa don");
            e.printStackTrace();

        }
    }

}
