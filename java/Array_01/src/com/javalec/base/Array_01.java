package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : array 공부
 * 
 */


public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 배열 7개를 생성
		String[] str = new String[7];
		
		// 데이터 입력
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println(str.length);
		
		System.out.println(str[str.length-1]);
		
		for (int i = 1; i < str.length; i +=2) {
			System.out.println(str[i]);
		}
		
		// --------------------------
		
//		String[] str1 = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
//		int[] intNum = {1,2,3};
//		double[] doubleNum = {1.1, 1.2};
//		boolean[] boolNum = {true, false, true};
		
		
	}

}
