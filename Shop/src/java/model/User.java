package model;

public class User {
	private String user_id;
	private String username;
	private String password;
	private String fullname;
	private String role;

	public User() {
		super();
	}

	public User(String user_id, String username, String password, String fullname,
			String role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.role = role;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    public String getMa_tai_khoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
