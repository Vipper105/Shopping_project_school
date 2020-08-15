package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.DanhMuc;

public class DanhMucDAOImpl implements DanhMucDAO {

    @Override
    public ArrayList<DanhMuc> getListDanhMucCha() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM danh_muc WHERE danh_muc_cha='null'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
        } catch (SQLException e) {
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return arr;
    }

    @Override
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM danh_muc WHERE danh_muc_cha='" + ma_danh_muc + "'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
        } catch (SQLException e) {
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return arr;

    }

    public void delDanhMuc(String ma_danh_muc) {
        Connection con = DBConnect.getConnecttion();
        String sql = "delete from danh_muc Where ma_danh_muc='" + ma_danh_muc
                + "'";
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("khong the xoa the  loai");
            e.printStackTrace();
        }

    }

    @Override
    public DanhMuc getDanhMuc(String id) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from danh_muc where ma_danh_muc='" + id
                + "'";
        DanhMuc c = new DanhMuc();
        try {
            // ResultSet rs = con.createStatement().executeQuery(sql);
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String ma_danh_muc = rs.getString("ma_danh_muc");
                String ten_danh_muc = rs.getString("ten_danh_muc");
                String danh_muc_cha = rs.getString("danh_muc_cha");

                c = new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha);

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("khong the lay ra danh sach");
        }
        return c;

    }

    public void updateDanhMuc(DanhMuc c) {
        Connection con = DBConnect.getConnecttion();
        String sql = "update danh_muc set ten_danh_muc=?,danh_muc_cha=? where ma_danh_muc=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1, c.getTen_danh_muc());
            ps.setString(2, c.getDanh_muc_cha());
            ps.setString(3, c.getMa_danh_muc());
            ps.executeUpdate();
            con.close();
            System.out.println("san pham da dc cap nhật");
        } catch (SQLException e) {
            System.out.println("chua the chinh sua san pham");
            e.printStackTrace();

            // TODO: handle exception
        }

    }

    @Override
    public List<DanhMuc> getList() {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from danh_muc";
        List<DanhMuc> list = new ArrayList<DanhMuc>();
        try {
            // ResultSet rs = con.createStatement().executeQuery(sql);
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ma_danh_muc = rs.getString("ma_danh_muc");
                String ten_danh_muc = rs.getString("ten_danh_muc");
                String danh_muc_cha = rs.getString("danh_muc_cha");

                list.add(new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha));

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("khong the lay ra danh sach");
            e.printStackTrace();
        }
        return list;

    }

    public void addDanhMuc(DanhMuc c) {
        Connection con = DBConnect.getConnecttion();
        String sql = "insert into danh_muc value(?,?,?)";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, c.getMa_danh_muc());
            ps.setString(2, c.getTen_danh_muc());
            ps.setString(3, c.getDanh_muc_cha());

            ps.executeUpdate();
            con.close();
            System.out.println("da add thanh cong");
        } catch (SQLException e) {
            System.out.println("chua the add danh muc ");
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        DanhMucDAOImpl dm = new DanhMucDAOImpl();
//        System.out.println(dm.getListDanhMucCha().size());
        System.out.println(dm.getListDanhMucCon("10001").size());
        DanhMuc c = new DanhMuc("10007", "Báo bóng đá Pháp ^^__^^",
                "100010");
//		dm.addDanhMuc(c);
//		System.out.println("lấy ra danh sách" + dm.getList());
//
//		dm.delDanhMuc("0");
        dm.updateDanhMuc(c);

    }
}
