package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int[] putNum = new int[10];
		int temp = 0;
//		String count = "";
////		String[] histogram = new String[putNum.length];
//		String[] histogram = {"","","","","","","","","",""};
//		
//		// 점수 받기
//		System.out.println("Input score(0~99) ");
//		for (int i = 0; i < putNum.length; i++) {
//			System.out.print((i + 1) + "의 score : ");			
//			putNum[i] = scanner.nextInt();
//			if(putNum[i] >= 100 || putNum[i] < 0) {
//				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
//				i--;
//				continue;
//			}
//			
//			// 점수 나누기 - switch
////			switch(putNum[i] / 10) {
////			case 9:
////				histogram[9] += "#";
////				break;
////			case 8:
////				histogram[8] += "#";
////				break;
////			case 7:
////				histogram[7] += "#";
////				break;
////			case 6:
////				histogram[6] += "#";
////				break;
////			case 5:
////				histogram[5] += "#";
////				break;
////			case 4:
////				histogram[4] += "#";
////				break;
////			case 3:
////				histogram[3] += "#";
////				break;
////			case 2:
////				histogram[2] += "#";
////				break;
////			case 1:
////				histogram[1] += "#";
////				break;
////			case 0:
////				histogram[0] += "#";
////				break;
////			default:
////				break;	
////			}
//			
//			// 점수 나누기 - for문 사용
//			for (int j = 0; j < histogram.length; j++) {
//				if (putNum[i] / 10 == j) {
//					histogram[j] += "#";
//				}
//			}
//			
//		}
//				
//				
//		
//		// 히스토그램 그리기
//		for (int i = putNum.length-1; i >= 0; i--) {
//			System.out.println((i*10) + " : " + histogram[i]);
//		}
		
		
//		// 두번쨰 방법(배열 사용 X)
//		System.out.println("Input score(0~99) ");
//		for (int i = 0; i < putNum.length; i++) {
//			System.out.print((i + 1) + "의 score : ");			
//			putNum[i] = scanner.nextInt();
//			if(putNum[i] >= 100 || putNum[i] < 0) {
//				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
//				i--;
//				continue;
//			}
//		}
//		
//		// 점수 나누기 && 출력하기
//		for (int i = putNum.length-1; i >= 0; i-- ) {
//			for (int j = 0; j < 10; j++) {
//				if(putNum[j] / 10 == i) {
//					count += "#";
//				}
//			}
//			System.out.println((i*10) + " : " + count);
//			count = "";
//		}
//		
//		
		
		// 세번째 방법
		
		System.out.println("Input score : ");
		for (int i = 0; i < putNum.length ; i ++) {
			System.out.println((i+1) + "의 score : ");
			temp = scanner.nextInt();
			if(temp >= 100 || temp < 0) {
			System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
			i--;
			continue;
		}
			putNum[temp/10]++;
			
		}
		
		for (int i = putNum.length - 1; i >= 0; i--) {
//			System.out.print((i*10) + " : ");
			System.out.print(String.format("%3d : ", (i*10)));
			for (int j = 0 ; j < putNum[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

			
		
		scanner.close();

	}

}
