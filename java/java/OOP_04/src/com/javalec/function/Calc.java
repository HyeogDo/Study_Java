package com.javalec.function;


/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class Calc {
	
	// Field
	public int num1;
	public int num2;

	// Constructor
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void calcAll() {
		System.out.println(additionNum());
		System.out.println(subtractionNum());
		System.out.println(multiplicationNum());
		System.out.println(divisionNum());
	}
	
	public String additionNum() {
		return (num1 + " + " + num2 + " = " +  additionNumReturn());
	}
	public String subtractionNum() {
		return (num1 + " - " + num2 + " = " + subtractionNumReturn());
	}
	public String multiplicationNum() {
		return (num1 + " * " + num2 + " = " +  multiplicationNumReturn());
	}
	public String divisionNum() {
		return (num1 + " / " + num2 + " = " + divisionNumReturn() );
	}
	
	// 리턴값 주는 방법
	private int additionNumReturn() {
		return num1 + num2;
	}
	private int subtractionNumReturn() {
		return num1 - num2;
	}
	private int multiplicationNumReturn() {
		return num1 * num2;
	}
	private double divisionNumReturn() {
		return  num1 / (double) num2;
	}
	
	
	

}
