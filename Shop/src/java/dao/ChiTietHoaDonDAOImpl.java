/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import model.ChiTietHoaDon;

/**
 *
 * @author dinhhuy
 */


public class ChiTietHoaDonDAOImpl implements ChiTietHoaDonDAO{

    @Override
    public void themChiTietHD(ChiTietHoaDon cthd) {
       Connection con = DBConnect.getConnecttion();
        String sql = "insert into chi_tiet_hoa_don value(?,?,?,?,?,?)"; // cau lenh sql
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, cthd.getMa_chi_tiet_hoa_don());
            ps.setString(2, cthd.getHoa_don().getMa_hoa_don());
            ps.setString(3, cthd.getSan_pham().getMa_san_pham());
            ps.setInt(4, cthd.getSo_luong());
            ps.setDouble(5, cthd.getDon_gia());
            ps.setInt(6, cthd.getGiam_gia());

            ps.executeUpdate();
            con.close();
            System.out.println("da them chi tiet hoa don");
        } catch (SQLException e) {
            System.out.println("chua them chi tite hoa don");
            e.printStackTrace();

        }
    }
    
    
}
