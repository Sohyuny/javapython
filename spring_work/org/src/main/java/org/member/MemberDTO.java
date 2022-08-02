package org.member;

public class MemberDTO {
	
	//alt shift s -> r, o, s
	private String name;
	private String email;
	private String pwd;
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	//기본생성자는 직접 적어야 함
	public MemberDTO() {}
	
	public MemberDTO(String name, String email, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}	
	

}
