package com.javalec.base;

import java.util.Scanner;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : for문과 배열의 이해
 */
public class Quiz_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 설정
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int[] clientList = new int[5];
		int clientNum = 0;
		int outputMoney = 0;

		
		// 출력문
		while(true) {
			System.out.println("1. 입금\n2. 출금\n3. 현황\n4. 종료");
			System.out.print("번호를 선택하세요 : ");
			choice = scanner.nextInt();
			
			// 1. 입금
			if( choice == 1 ) {
				System.out.print("고객 번호 : ");
				clientNum = scanner.nextInt();
				System.out.print("입금하실 금액을 입력해주세요 : ");
				clientList[clientNum-1] += scanner.nextInt();
				System.out.printf("입금 결과 : 고객 번호 - %d, 잔액 - %d\n", clientNum, clientList[clientNum-1]);
				System.out.println("------------------------------------------------");
			} else if ( choice == 2 ) { // 2. 출금
				System.out.print("고객 번호 : ");
				clientNum = scanner.nextInt();
				System.out.print("출금하실 금액을 입력해주세요 : ");
				outputMoney = scanner.nextInt();
				if (outputMoney > clientList[clientNum]) {
					System.out.println("출금할 잔액 부족!");
				} else {
					clientList[clientNum-1] -= outputMoney;
					System.out.printf("출금 결과 : 고객 번호 - %d, 잔액 - %d\n", clientNum, clientList[clientNum-1]);
					System.out.println("------------------------------------------------");
				}
			} else if ( choice == 3 ) { // 3. 현황
				System.out.println("\t고객명 \t잔액");
				System.out.println("\t---- \t---");
				for (int i = 0; i < clientList.length; i++) {
					System.out.println("\t" + (i+1) + "\t" +  clientList[i]);
				}
				System.out.println("------------------------------------------------");
			} else if (choice == 4) { // 4. 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("1~4의 숫자를 선택해 주세요");
			}
			scanner.close();
			
			
		}

	}

}
