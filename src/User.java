

public class User {
	 private String name;
	private String LastName;
	private String Email;
	private String password;
	

	public User(String name, String LastName, String Email, String password) {
		 this.name= name;
		 this.LastName= LastName;
		 this.Email= Email;
		 this.password= password;
	 }
	



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
