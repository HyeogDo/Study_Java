package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/22
 * name : HyeogDo
 * purpose : Study Scanner
 * 
 * 
 */

public class ScannerCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int intNum1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int intNum2 = scanner.nextInt();
		
		System.out.println("입력하신 " + intNum1 + "과 " + intNum2 + "의 합은 " + (intNum1 + intNum2) + "입니다. ");
		
		scanner.close();
		
			
	}

}
