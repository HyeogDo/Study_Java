package com.javalec.base;

import java.util.Random;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : API(application programming interface) 공부
 */
public class Random_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int temp = random.nextInt(3) + 1;
		if (temp == 1) {
			System.out.println("가위");
		} else if (temp == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
	}

}
