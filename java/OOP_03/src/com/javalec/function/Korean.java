package com.javalec.function;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class Korean {
	
	// Field
	String nation = "대한민국";
	String name;
	String phone;
	
	
	// Constructor
	public Korean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Korean( String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}




	// Method
	
	public void printName () {
		System.out.println("국적 : " + nation);
		System.out.println("이름 : " + name );
		System.out.println("번호 : " + phone );
	}
	

}
