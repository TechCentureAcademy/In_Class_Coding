package Custom_Classes;

public class Getters_Setters {
	
	private String password;
	private String username;
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getUserName() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password, String oldPassword) {
		if(oldPassword.equals(this.password)) {
			this.password = password;
		}
	}
	
	public void printUserName() {
		System.out.println(username);
	}
	

}
