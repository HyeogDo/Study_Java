package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/25
 * 최종 수정일 : 2022/02/25
 * 목적 : 배열과 for문의 이해
 */

public class Quiz_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 설정하기
		int[] intNum = {1, 5, 8, 12, 200, 1002};
		int sum = 0;
		double average = 0;
		
		// 평균 구하기
		for (int i = 0; i < intNum.length; i++) {
			sum += intNum[i];
		}
		average = (double) sum / intNum.length;
		
		// 출력하기
		System.out.println(average);
	}

}
