
public class RegistrationDto {
	
	String username;
	String pwd ;
	String email;
	String role ;
	
	public void RegistrationDto(String username,String pwd,String email,String role) 
	{
		this.username=username;
		this.pwd=pwd;
		this.email=email;
		this.role=role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}
