package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/22
 * name : HyeogDo
 * purpose : study IF, Scanner
 * 
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner를 이용한 입력 받기
		Scanner scanner = new Scanner(System.in);
		
		// Console 에서 data 받아오기
		System.out.print("숫자를 입력해 주세요 : ");
		int intNum1 = scanner.nextInt();
		
		// 가져온 데이터 출력하기
		System.out.println("입력한 숫자는 " + intNum1 + "입니다.");
		
		// 입력하시 숫자는 짝수입니다 or 홀수입니다
		System.out.print("숫자를 입력해주세요 : ");
		int intNum2 = scanner.nextInt();
		
		
		if ( intNum2 % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다. ");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다. ");
		}
		scanner.close();
	}

}
