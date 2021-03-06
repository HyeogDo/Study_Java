package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study_switch
 * 
 */

public class Switch_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 선언
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char score_hakjeom = 'a';
		
		// 점수 받기
		System.out.print("점수를 입력해주세요 : ");
		score = scanner.nextInt();
		
		
		// 점수 분별
		switch( score / 10) {
		case 10:
		case 9:
			score_hakjeom = 'A';
			break;
		case 8:
		case 7:
			score_hakjeom = 'B';
			break;
		case 6:
		case 5:
			score_hakjeom = 'C';
			break;
		case 4:
		case 3:
			score_hakjeom = 'D';
			break;
		default:
			score_hakjeom = 'F';
			break;
		}
		
		
		// 출력
		System.out.println("당신의 점수 " + score + "점에 따른 학점은 " + score_hakjeom + "입니다.");
		scanner.close();
		
		
		
		
	}

}
