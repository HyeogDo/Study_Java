package com.javalec.function;


/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 객체 지향 프로그램의 이해
*/
public class Car {
	
	// Field
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	// Constructor
	// 오버로딩(overloading) : 생성자나 메소드를 여러개 생성하는 경우 parameter의 타입이나 개수가 다를때만 성립
	public Car() {
		// TODO Auto-generated constructor stub
		
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	
	
	// Method
	public int add(int num1, int num2, int num3) {
		
		return num1 + num2 + num3;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
