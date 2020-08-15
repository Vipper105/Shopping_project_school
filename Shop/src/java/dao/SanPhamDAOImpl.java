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
import model.SanPham;

public class SanPhamDAOImpl implements SanPhamDAO {

    @Override
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM san_pham WHERE ma_danh_muc='" + ma_danh_muc
                + "'";
        ArrayList<SanPham> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));

                arr.add(sp);
            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return arr;

    }

    @Override
    public SanPham getChiTietSanPham(String ma_san_pham) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM san_pham WHERE ma_san_pham='" + ma_san_pham
                + "'";
        SanPham sp = new SanPham();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                 sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));

            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return sp;
    }

    @Override
    public void addSanPham(SanPham sp) {
        Connection con = DBConnect.getConnecttion();
        String sql = "insert into san_pham value(?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, sp.getMa_san_pham());
            ps.setString(2, sp.getDanh_muc().getMa_danh_muc());
            ps.setString(3, sp.getTen_san_pham());
            ps.setString(4, sp.getHinh_anh());
            ps.setInt(5, sp.getSo_luong());
            ps.setString(6, sp.getMo_ta());
            ps.setDouble(7, sp.getDon_gia());
            ps.setInt(8, sp.getGiam_gia());

            ps.executeUpdate();
            con.close();
            System.out.println("da add thanh cong");
        } catch (SQLException e) {
            System.out.println("chua the add danh muc ");
            e.printStackTrace();

        }
    }

    @Override
    public ArrayList<SanPham> getList() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM san_pham";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));

                list.add(sp);
            }
            connection.close();
            System.out.println("da lay san pham thanh cong");
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
            System.out.println("chua lay san pham thanh cong");
        }
        return list;
    }

    @Override
    public void delSanPham(String ma_san_pham) {
        Connection con = DBConnect.getConnecttion();
        String sql = "delete from san_pham Where ma_san_pham='" + ma_san_pham
                + "'";
        try {
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ps.executeUpdate();
            con.close();
            System.out.println("da xoa san pham");
        } catch (Exception e) {
            System.out.println("khong the xoa san pham");
            e.printStackTrace();
        }
    }

    @Override
    public SanPham getSanPham(String ma_san_pham) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from san_pham where ma_san_pham='" + ma_san_pham
                + "'";
        SanPham sp = new SanPham();
        try {
            // ResultSet rs = con.createStatement().executeQuery(sql);
            PreparedStatement ps = (PreparedStatement) con
                    .prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String ma_danh_muc = rs.getString("ma_danh_muc");
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                String ten_san_pham = rs.getString("ten_san_pham");
                String hinh_anh = rs.getString("hinh_anh");
                int so_luong = rs.getInt("so_luong");
                String mo_ta = rs.getString("mo_ta");
                double don_gia = rs.getDouble("don_gia");
                int giam_gia = rs.getInt("giam_gia");

                sp = new SanPham(ma_san_pham, dm, ten_san_pham, hinh_anh, so_luong, mo_ta, don_gia, giam_gia);
                // c = new DanhMuc(ma_danh_muc, ten_danh_muc, danh_muc_cha);
            }
            con.close();
            System.out.println("da lay ra danh sach san pham theo ma san pham");
        } catch (SQLException e) {
            System.out.println("khong the lay ra danh sach theo ma san pham");
        }
        return sp;
    }

    @Override
    public void updateSanPham(SanPham sp) {
        Connection con = DBConnect.getConnecttion();
        String sql = "update san_pham set ma_danh_muc=?,ten_san_pham=?,hinh_anh=?,so_luong=?,mo_ta=?,don_gia=?,giam_gia=? where ma_san_pham=?";
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, sp.getDanh_muc().getMa_danh_muc());    // goi ma_danh_muc tu DanhMuc
            ps.setString(2, sp.getTen_san_pham());
            ps.setString(3, sp.getHinh_anh());
            ps.setInt(4, sp.getSo_luong());
            ps.setString(5, sp.getMo_ta());
            ps.setDouble(6, sp.getDon_gia());
            ps.setInt(7, sp.getGiam_gia());

            ps.setString(8, sp.getMa_san_pham());

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
    public ArrayList<SanPham> getListByPage(ArrayList<SanPham> arr, int start, int end) {
       ArrayList<SanPham> list=new ArrayList<>();
       for(int i=start;i<end;i++){
       list.add(arr.get(i));
       
       }return list;
    }

    @Override
    public ArrayList<SanPham> getListProductTop4() {
       Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM san_pham WHERE so_luong>600;";
        ArrayList<SanPham> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));

                arr.add(sp);
            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return arr;
    }
     @Override
    public ArrayList<SanPham> getListProductBotPrice() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM san_pham WHERE don_gia<=6000;";
        ArrayList<SanPham> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));

                arr.add(sp);
            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE,
                    null, e);
        }
        return arr;
    }
     public static void main(String[] args) {
        SanPhamDAOImpl sp = new SanPhamDAOImpl();
        //.out.println(sp.getListProductByCategory("10002").size());
//        System.out.println(sp.getChiTietSanPham("100005"));
        DanhMuc dm = new DanhMuc("10005", "Bóng chuye62n", "10006");
//sp.delSanPham("ab1002");
        // SanPham sanpham = new SanPham("ab1001", 1000001, "aaaaaaa", "8-108437-1372707064_500x0.jpg", 20, "200", 15000, 30);
        SanPham sanpham = new SanPham("ab123", dm, "Báo thanh nie6n", "8-108437-1372707064_500x0.jpg", 90, "10", 50000, 30);
//        sp.updateSanPham(sanpham);
//        System.out.println(sp.getSanPham("Av123"));
//        System.out.println(sp.getList());
System.err.println(sp.getListProductTop4());
    }

   
}
