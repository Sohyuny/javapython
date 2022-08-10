package com.dip.mycompany.member;

public class MemberDto {

	private String email;
	private String name;
	private String pwd;

	// alt shift s -> o 생성자
	public MemberDto(String email, String name, String pwd) {
		super();
		this.email = email;
		this.name = name;
		this.pwd = pwd;
	}

	// alt shift s -> s tostring
	@Override
	public String toString() {
		return "MemberDto [email=" + email + ", name=" + name + ", pwd=" + pwd + "]";
	}

	// alt shift s -> r getter setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
