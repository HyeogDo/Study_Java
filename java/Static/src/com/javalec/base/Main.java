package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Static의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstSon firstSon = new FirstSon();
		SecondSon secondSon = new SecondSon();
		
		firstSon.takeChoco();
		secondSon.takeChoco();
		
		secondSon.takeChoco();
		firstSon.takeChoco();
		
		
	}

}
