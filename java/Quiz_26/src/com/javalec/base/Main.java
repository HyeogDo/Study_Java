package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		PutNum putNum = new PutNum();
		DeleteNum deleteNum = new DeleteNum();
		PrintResult printResult = new PrintResult();

		
		// 숫자 입력받기
		putNum.putNum();
		
		// 숫자 삭제하기
		deleteNum.deleteNum();
		
		// 결과 출력하기
		printResult.printResult();
		
	}

}
