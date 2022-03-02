package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/24
 * name : HyeogDo
 * purpose : study For
 * 
 */

public class Quiz_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		// 환경 변수 설정
//		Scanner scanner = new Scanner(System.in);
//		int startNum = 0;
//		int endNum = 0;
//		int restNum = 0;
//		int sum = 0;
//		int count = 0;
//		double average = 0;
//		int numMax = 0;
//		int numMin = 0;
//		
//		
//		// 변수 받아오기
//		System.out.print("시작하는 숫자를 정하세요 : ");
//		startNum = scanner.nextInt();
//		System.out.print("범위의 끝 숫자를 정하세요 : ");
//		endNum = scanner.nextInt();
//		System.out.print("원하는 나머지 값은? : ");
//		restNum = scanner.nextInt();
//		
//
//		// 예외 처리 - 잘못 입력한 경우
//		if (startNum > endNum) {
//			int temp = startNum;
//			startNum = endNum;
//			endNum = temp;
//		}
//		if (restNum > 9 || restNum < 0 || startNum < 0) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//		} else {
//			// 최솟값 에러 해결
//			if ( (startNum % 10 > restNum ) && (startNum - endNum < 10) ) {
//				numMin = 0;
//			} else {
//				numMin = endNum;
//			}
//			// 분석하기
//			for (int i = startNum; i <= endNum; i++) {
//				if ( i % 10 == restNum) {
//					// 최대 최소 정하기
//					if (numMin >= i) {
//						numMin = i;
//					}
//					numMax = i;
//					sum += i;
//					count++;
//				}
//			}
//			
//			if ( count != 0 ) {
//				average = (double) sum / count;
//			}
//			
//			System.out.printf("%d부터 %d까지의 범위 중 나머지가 %d인 숫자의 개수는 %d개이고, "
//					+ "합은 %d입니다. "
//					+ "그리고 나머지가 %d인 숫자의 평균은 %.2f이고, "
//					+ "나머지가 %d인 숫자 중 최대 숫자는 %d이고 "
//					+ "최소 숫자는 %d입니다.",
//					startNum, endNum, restNum, count, sum, restNum, average, restNum, numMax, numMin);
//			
//		}
//		
//		
//		scanner.close();
		
		// 변수
		Scanner scanner = new Scanner(System.in);
		int startNum = 0; 		// 시작 숫자
		int endNum = 0; 		// 끝 숫자
		int remainNum = 0; 		// 나머지 숫자
		String resultMent = "";
		int count = 0; 			// 조건에 맞는 갯수
		int sum = 0; 			// 조건에 맞느 수의 합
		int maxNum = 0; 		// 조건의 최댓값
		int minNum = 0; 		// 조건의 최소값
		int temp = 0;			// 시작과 끝의 임시 변수
		
		String check = "start"; // 최소값 check하기
		// ---------------------------
		// 사용자로 부터 Data 받아오기
		// ---------------------------
		System.out.print("1. 시작하는 숫자를 정하세요 : ");
		startNum = scanner.nextInt();
		
		System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
		endNum = scanner.nextInt();
		
		System.out.print("3. 원하는 나머지 값은? : ");
		remainNum = scanner.nextInt();
		
		// ---------------------------
		// 시작 숫자가 끝 숫자보다 큰 경우 
		// ---------------------------
		if (startNum > endNum) {
			temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		
		// ---------------------------
		// 처리
		// ---------------------------
		for (int num = startNum ; num <= endNum; num++ ) {
			if ( num % 10 == remainNum ) {
				count += 1; // 갯수
				sum += num; // 합
				maxNum = num; // 최대값
				
				
				if (check.equals("start")) { // 최소값 찾기
					minNum = num;
					check = "end";
				}
//				
//				if (minNum == 0) {
//					minNum = num;
//				}
				
			}
			
		}
		
		
		
		
		// ---------------------------
		// 결과물 출력하기
		// ---------------------------
		resultMent = "\n" + startNum + "부터 " + endNum + "의 범위 중 나머지가 " + remainNum + "인 숫자의 개수는 ";
		resultMent += "숫자의 갯수는 " + count + "개이고 ";
		resultMent += "합은 " + sum + "입니다.\n";
		resultMent += "나머지가 " + remainNum + "인 숫자의 평균은 " + ((double) sum / count) + " 이고, \n";
		resultMent += "나머지가 " + remainNum + "인 숫자 중 최대숫자는 " + maxNum + "이고 ";
		resultMent += "나머지가 " + remainNum + "인 숫자 중 최소숫자는 " + minNum + "입니다. ";
		
		System.out.println(resultMent);
		
		scanner.close();
		
		
		
	}

}
