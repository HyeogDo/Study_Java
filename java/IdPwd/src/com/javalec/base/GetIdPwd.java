package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Static의 이해
*/
public class GetIdPwd {
	
	// Field
	String id;
	String pwd;
	
	// Constructor
	public GetIdPwd() {
		// TODO Auto-generated constructor stub
	}

	
	// Method
	public void printGetId() {
		System.out.print("ID를 입력하세요 : ");
	}
	
	public void getId(String id) {
		this.id = id;
	}

	public void printGetPwd() {
		System.out.print("암호를 입력하세요 : ");
	}
	
	public void getPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setIdPwd() {
		SetIdPwd.id = id;
		SetIdPwd.pwd = pwd;
	}

}