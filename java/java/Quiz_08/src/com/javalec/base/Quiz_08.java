package com.javalec.base;



/*
 * date : 2022/02/24
 * name : HyeogDo
 * purpose : study for
 */

public class Quiz_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 환경 변수 선언
//		Scanner scanner = new Scanner(System.in);
//		int danNum = 0; // 몇단인지
//		
//		
//		while (true) {
//			// 몇단 할건지 받아오기
//			System.out.print("몇 단을 출력하시겠습니까? : ");
//			danNum = scanner.nextInt();
//			
//			// 잘못된 숫자 입력 예외 처리
//			if (danNum > 9 || danNum < 2) {
//				System.out.println("잘못된 숫자를 입력하셨습니다.");
//				System.out.println("2~9 사이의 숫자를 입력해주세요\n");
//			} else {
//				// 출력하기
//				System.out.println("**** " + danNum + "단 ****");
//				for (int i = 1; i < 10; i++) {
//					System.out.println(danNum + " X " + i + " = " + (danNum*i) );
//				}
//				break;
//			}
//			
//		}
//		
//		
//		scanner.close();
		
		for (int i = 2; i < 10; i++) {
			System.out.println("\n------------- " + i + "단 -----------");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		
	}

}
