package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection getConnecttion(){
		Connection cons=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//                        cons=DriverManager.getConnection("jdbc:mysql://node31600-env-9341097.jelastic.skali.net/doancuoiky","root","ELAbbv84947");
			cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/doancuoiky","root","123");
			System.out.println("ket noi thanh cong database");
		} catch (Exception e) {
			System.out.println("ket noi ko thanh cong database");
			e.printStackTrace();
		}
		return cons;

	}
	public static void main(String[] args) {
		System.out.println(getConnecttion());
	}

}

