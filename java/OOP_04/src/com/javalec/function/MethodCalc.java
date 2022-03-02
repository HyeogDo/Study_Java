package com.javalec.function;


/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/
public class MethodCalc {
	
	// Field;
	int num1;
	int num2;
	
	// Constructor
	public MethodCalc() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public int addition(int num1 , int num2) {
		return num1 + num2;
	}
	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	public double division(int num1, int num2) {
		return (double) num1 / num2;
	}
	
	public String additionPrint(int num1, int num2) {
		return num1 + " + " + num2 + " = " + addition(num1, num2);
	}
	public String subtractionPrint(int num1, int num2) {
		return num1 + " - " + num2 + " = " + subtraction(num1, num2);
	}
	public String multiplicationPrint(int num1, int num2) {
		return num1 + " * " + num2 + " = " + multiplication(num1, num2);
	}
	public String divisionPrint(int num1, int num2) {
		return num1 + " / " + num2 + " = " + division(num1, num2);
	}
	
	public void calcAll(int num1, int num2) {
		System.out.println(additionPrint(num1, num2));
		System.out.println(subtractionPrint(num1, num2));
		System.out.println(multiplicationPrint(num1, num2));
		System.out.println(divisionPrint(num1, num2));
	}
}
