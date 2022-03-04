package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : 상속의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		
		
		System.out.println("Add :" + (i + j));
		System.out.println("Sub :" + (i - j));
		System.out.println("Mul :" + (i * j));
		
		try {
			System.out.println("Div :" + (i / j));
		} catch (Exception exception) {
			System.out.println("0으로 나누기는 불가합니다.");
		}

	}

}
