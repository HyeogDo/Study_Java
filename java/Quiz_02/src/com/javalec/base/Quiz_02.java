package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study if
 * 
 */

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		System.out.print("국어 점수를 입력하세요! : ");
		int score_korean = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요! : ");
		int score_english = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요! : ");
		int score_math = scanner.nextInt();
		
		// 예외 처리
		if ( score_korean > 100 ) {
			System.out.println("국어 점수가 100보다 높습니다.");
		}
		
		if ( score_english > 100 ) {
			System.out.println("영어 점수가 100보다 높습니다.");
		} 
		
		if ( score_math > 100 ) {
			System.out.println("수학 점수가 100보다 높습니다.");
		} 
		
		if ( score_korean < 0 ) {
			System.out.println("국어 점수가 0보다 작습니다.");
		}
		
		if ( score_english < 0 ) {
			System.out.println("영어 점수가 0보다 작습니다.");
		}
		
		if ( score_math < 0 ) {
			System.out.println("수학 점수가 0보다 작습니다.");
		}
		
		
		// 정상적인 값을 받았을때
		if ((score_korean <= 100 && score_korean >= 0 ) && (score_english <= 100 && score_english >= 0 ) && (score_math <= 100 && score_math >= 0 )) {
			
			// 평균값
			double score_average = (score_korean + score_english + score_math) / 3.0;
			
			
			System.out.printf("평균 점수 : %.2f\n", score_average);
			
			
			// 국어 점수 판단
			if ( score_korean > score_average ) {
				System.out.println("국어 점수는 평균 보다 높습니다.");
			} else if ( score_korean == score_average ) {
				System.out.println("국어 점수는 평균 점수입니다.");
			} else {
				System.out.println("국어 점수는 평균 보다 낮습니다.");
			}
			
			// 영어 점수 판단
			if ( score_english > score_average ) {
				System.out.println("영어 점수는 평균 보다 높습니다.");
			} else if ( score_english == score_average ) {
				System.out.println("영어 점수는 평균 점수입니다.");
			} else {
				System.out.println("영어 점수는 평균 보다 낮습니다.");
			}
			
			// 수학 점수 판단
			if ( score_math > score_average ) {
				System.out.println("수학 점수는 평균 보다 높습니다.");
			} else if ( score_math == score_average ) {
				System.out.println("수학 점수는 평균 점수입니다.");
			} else {
				System.out.println("수학 점수는 평균 보다 낮습니다.");
			}
		}
		
	
		
		scanner.close();
		
		
	}

}
