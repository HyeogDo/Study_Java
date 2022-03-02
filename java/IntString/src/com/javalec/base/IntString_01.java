package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : API(application programming interface) 공부
 */
public class IntString_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1);
		System.out.println(str3 + str2);
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num1 + num2);
	}

}
