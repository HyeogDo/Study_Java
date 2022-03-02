package com.javalec.function;


/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class ConstructorCalc {
	// Field
	
	int num1;
	int num2;
	
	public ConstructorCalc() {
		// TODO Auto-generated constructor stub
	}

	public ConstructorCalc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int addition() {
		return num1 + num2;
	}
	public int subtraction() {
		return num1 - num2;
	}
	public int multiplication() {
		return num1 * num2;
	}
	public double division() {
		return (double) num1 / num2;
	}
	
	public String additionPrint() {
		return num1 + " + " + num2 + " = " + addition();
	}
	public String subtractionPrint() {
		return num1 + " - " + num2 + " = " + subtraction();
	}
	public String multiplicationPrint() {
		return num1 + " * " + num2 + " = " + multiplication();
	}
	public String divisionPrint() {
		return num1 + " / " + num2 + " = " + division();
	}
	
	public void calcAll(int num1, int num2) {
		System.out.println(additionPrint());
		System.out.println(subtractionPrint());
		System.out.println(multiplicationPrint());
		System.out.println(divisionPrint());
	}
}
