package ksmart41.mybatis.controller;
//1 객체만들기
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
	
//3 생성자 만들기 - 우클릭 - source - getConstructor using Fields -  생성된것중 super(); <-지우기
	public Member(int id, String username, String password, String email) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
//4 get 요청시에 데이터를 실어 보낼껀데, postman을 켜서 	
	
//2 getter/ setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
