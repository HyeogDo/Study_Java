package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : API(application programming interface) 공부
 */
public class Time_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "a";
		
		long startTime1 = System.currentTimeMillis();
		for ( int i = 1; i <= 50000; i++ ) {
			str1 = str1 + "a";
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("Term : " + (endTime1 - startTime1));
		
		
		// -------------
		
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime2 = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("Term : " + (endTime2 - startTime2));
		
	}

}
