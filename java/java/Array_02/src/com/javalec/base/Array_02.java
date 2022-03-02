package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : scanner 와 array를 결합하여 생각
 */

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ** 사용자가 입력하는 숫자 5개 받아서 합계를 구하기 **
		
		// 변수
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[5];
		int total = 0; //합계구하기
		
		// 입력 받아오기
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번의 숫자를 입력하세요 : ");
			number[i] = scanner.nextInt();
		}
		
		// 합계 구해서 출력하기
		for (int i = 0; i < number.length; i++) {
			total += number[i];
		}
		System.out.println("입력하신 숫자의 합계는 " + total + "입니다.");
		
		scanner.close();
	}

}
