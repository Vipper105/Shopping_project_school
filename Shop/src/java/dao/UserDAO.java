package dao;

import model.User;

public interface UserDAO {

	// them user
	public void addUser(User u);

	// kiem tra user co ton tai khong
	public boolean checkUser(String userName);

	// kiem tra dang nhap
	public boolean login(String username, String password);
        
        public User getTaiKhoan(String ten_dang_nhap);
        
     
}
