package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiCalc;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 객체 지향 프로그램의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int choiceNumber;
		int firstNum, secondNum;
		// 변수 받기
		
		System.out.println("1. 덧셈");
		System.out.println("2. 뺼셈");
		System.out.println("3. 곱셈");
		System.out.print("\n 번호를 선택 하세요 : ");
		choiceNumber = scanner.nextInt();
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		scanner.close();
		
		// 출력하기
		MultiCalc multi = new MultiCalc();
		multi.calc(choiceNumber, firstNum, secondNum);
		
	}

}
