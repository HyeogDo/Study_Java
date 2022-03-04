package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class Customer {
	
	// Field
	int number;
	String name;
	String phone;
	
	// Cunstructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int number, String name, String phone) {
		super();
		this.number = number;
		this.name = name;
		this.phone = phone;
	}

	
	// Method

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
