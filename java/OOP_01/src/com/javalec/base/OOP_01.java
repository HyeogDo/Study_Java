package com.javalec.base;
/*
* 작성자 : 권혁도
* 생성일 : 2022/02/28
* 최종 수정일 : 2022/02/28
* 목적 : 절차지향형 프로그램과 객체지향 프로그램의 비교
*/
public class OOP_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 캡슐화
		 * 정보은익
		 * 상속
		 * 다형성
		 * 
		 */
		
//		// 환경 변수 선언
//		int sum = 0;
//		
//		// 합구하기
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		// 짝홀 판단
//		if (sum % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		// 시작값, 끝값
		int i = 1, j = 100;
		
		// 클래스 선언
		Sum_1 sumEvenOdd = new Sum_1();
		EvenOdd evenOdd = new EvenOdd();
		
		// 환경 변수 선언
		int sum = sumEvenOdd.sumCalc(i, j);
		String str = evenOdd.evenOdd(sum);
		
		// 출력
		System.out.println(i + " ~ " + j + " 의 합은 " + sum);
		
		System.out.println(str);
		
	}

}
