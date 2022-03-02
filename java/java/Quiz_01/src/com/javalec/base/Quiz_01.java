package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study IF, Scanner
 */


public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경설정
		Scanner scanner = new Scanner(System.in);
		
		// 금액 입력 받기
		System.out.print("금액을 입력하세요 : ");
		int price = scanner.nextInt();
		
		// 처리하기
		if ( price > 8000 ) {
			System.out.println("너무 비쌉니다");
		} else if ( price > 5000) {
			System.out.println("조금 비쌉니다");
		} else if ( price > 3000) {
			System.out.println("적당한 금액 입니다");
		} else {
			System.out.println("싼편입니다");
		}
		
		scanner.close();
	}

}
