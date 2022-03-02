package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study if
 * 
 */

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 제목
		System.out.println("** 학점 관리 **");
		System.out.println();
		System.out.println();

		// 점수 입력받기
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		// 예외 처리
		if ( score > 100 ) {
			System.out.println("점수가 100점을 넘습니다.");
		} else if (score < 0) {
			System.out.println("점수가 0점보다 낮습니다.");
		} else {
			// 학점 매기기
			if ( score > 80 ) {
				System.out.println("귀하는 A학점 입니다.");
			} else if ( score > 60 ) {
				System.out.println("귀하는 B학점 입니다.");
			} else if ( score > 40 ) {
				System.out.println("귀하는 C학점 입니다.");
			} else if ( score > 20 ) {
				System.out.println("귀하는 D학점 입니다.");		
			} else {
				System.out.println("귀하는 F학점 입니다.");					
			}
		}
		
		scanner.close();
		
	}

}
