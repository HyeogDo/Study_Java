package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calc;
import com.javalec.function.ConstructorCalc;
import com.javalec.function.MethodCalc;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class Main {

	public static void main(String[] args) {
		
		// --------------------------------//
		// 두개의 정수를 입력받아 덧셈 기능 구현하기
		// --------------------------------//
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		

		// 두개의 수를 입력받기
		System.out.print("첫번째 수를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		scanner.close();
		
//		// 덧셈 기능 구현하기
//		// Case 1: Field 를 이용하여 계산하기
//		Addition addition = new Addition();
//		addition.num1 = num1;
//		addition.num2 = num2;
////		addition.addAction();
//		int sum = addition.addReturn();
//		System.out.println(num1 + " + " + num2 + " = " + sum);
//		
//		System.out.println("--------------------");
//		// 계산기 기능
//		Calc calc = new Calc();
//		calc.num1 = num1;
//		calc.num2 = num2;
//		
//		calc.calcAll();
//		
//		
//		// ------------------
//		System.out.println("--------------------");
//		
//		System.out.println(calc.additionNum());
//		System.out.println(calc.subtractionNum());
//		System.out.println(calc.multiplicationNum());
//		System.out.println(calc.divisionNum());
//		
//		
//		
//		
////		int[] returnNum = new int[3];
////		double divisionReturnNum;
////		returnNum[0] = calc.additionNumReturn();
////		returnNum[1] = calc.subtractionNumReturn();
////		returnNum[2] = calc.multiplicationNumReturn();
////		divisionReturnNum = calc.divisionNumReturn();
////		
////		System.out.println(num1 + " + " + num2 + " = " + (returnNum[0]) );
////		System.out.println(num1 + " - " + num2 + " = " + (returnNum[1]) );
////		System.out.println(num1 + " * " + num2 + " = " + (returnNum[2]) );
////		System.out.println(num1 + " / " + num2 + " = " + (divisionReturnNum) );
////		
		
		
//		// method를 이용한 계산기
//		MethodCalc methodCalc = new MethodCalc();
//		System.out.println(methodCalc.additionPrint(num1, num2));
//		System.out.println(methodCalc.subtractionPrint(num1, num2));
//		System.out.println(methodCalc.multiplicationPrint(num1, num2));
//		System.out.println(methodCalc.divisionPrint(num1, num2));
//		
//		System.out.println("------------------");
//		methodCalc.calcAll(num1, num2);
//		
		
		ConstructorCalc constructorCalc = new ConstructorCalc(num1, num2);
		System.out.println(constructorCalc.additionPrint());
		System.out.println(constructorCalc.subtractionPrint());
		System.out.println(constructorCalc.multiplicationPrint());
		System.out.println(constructorCalc.divisionPrint());
		
		System.out.println("----------------------");
		
		constructorCalc.calcAll(num1, num2);

		
	}

}
