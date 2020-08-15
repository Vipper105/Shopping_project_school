package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

import com.mysql.jdbc.PreparedStatement;

public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser(User u) {
        Connection con = DBConnect.getConnecttion();
        String sql = "insert into users value(?,?,?,?,?)"; // cau lenh sql
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, u.getUser_id());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getFullname());
            ps.setString(5, u.getRole());

            ps.executeUpdate();
            con.close();
            System.out.println("user da duoc add");
        } catch (SQLException e) {
            System.out.println("chua the add user");
            e.printStackTrace();

        }
    }

    public boolean checkUser(String user_name) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from users where username='" + user_name + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                con.close();
                return true;

            }

        } catch (SQLException e) {

            e.printStackTrace();
            // TODO: handle exception
        }

        return false;

    }

    @Override
    public boolean login(String username, String password) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from users where username='" + username
                + "' and password='" + password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                con.close();
                return true;

            }

        } catch (SQLException e) {

            e.printStackTrace();
            // TODO: handle exception
        }

        return false;
    }

    @Override
    public User getTaiKhoan(String ten_dang_nhap) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from users where username='" + ten_dang_nhap + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User tk = new User();
                tk.setUser_id(rs.getString("username"));
                return tk;

            }

        } catch (SQLException e) {

            e.printStackTrace();
            // TODO: handle exception
        }

        return null;
    }

//     @Override
//    public boolean register(String name, String facebookID, String facebookLink) {
//       PreparedStatement stm=null;
//       Connection con=null;
//         try {
//             con=DBConnect.getConnecttion();
//             String sql="INSERT INTO []"
//             
//         } catch (Exception e) {
//         }
//         return false;
//    }
//    @Override
//    public boolean checkAdminUser(String admin) {
//        Connection con = DBConnect.getConnecttion();
//        String sql = "select * from users where role='" + admin + "'";
//        PreparedStatement ps;
//        try {
//            ps = (PreparedStatement) con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                con.close();
//                return true;
//
//            }
//
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//            // TODO: handle exception
//        }
//
//        return false;
//    }

    public static void main(String[] args) {
        UserDAOImpl dao = new UserDAOImpl();
        dao.addUser(new User("5", "ad@gmail.com", "12345", "admin", "1"));
//        System.out.println(dao.checkUser("admin"));
//        System.out.println(dao.login("admin", "1234"));

//        System.out.println(dao.getTaiKhoan("babykute@gmail.com"));
    }

}
