package com.javalec.base;

/*
 * date : 2022/02/22
 * name : HyeogDo
 * purpose : study IF
 * 
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교문, 조건문
		int i = 10, j = 20, k = 10;
		
		// i가 j보다 크면 ...
		if ( i > j ) {
			System.out.println("i가 j보다 큽니다.");
		} 
		
		// i가 k와 같으면 ...
		if ( i == k ) {
			System.out.println("i와 k가 같습니다.");
		}
		
		// ----------------
		
		if (i > j) {
			System.out.println("i는 j보다 " + (i-j) + "만큼 큽니다.");
		} else {
			System.out.println("j는 i보다 " + (j-i) + "만큼 큽니다.");
		}
		
		if ( i > j ) {
			System.out.println("i는 j보다 " + (i-j) + "만큼 큽니다.");
		} else if ( j > i ) {
			System.out.println("j는 i보다 " + (j-i) + "만큼 큽니다.");
		} else {
			System.out.println("i와 j는 같습니다.");
		}
		
		// End
		System.out.println("---End---");
	}

}
