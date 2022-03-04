package com.javalec.base;

import java.util.Scanner;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : Static의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);

		
		// id pwd 받아오기
		GetIdPwd getIdPwd = new GetIdPwd();
		
		getIdPwd.printGetId();
		getIdPwd.getId(scanner.next());
		
		getIdPwd.printGetPwd();
		getIdPwd.getPwd(scanner.next());
		
		scanner.close();
		
		// id pwd static으로 저장하기
		getIdPwd.setIdPwd();
		
		// id pwd 출력하기
		PrintIdPwd printIdPwd = new PrintIdPwd();
		printIdPwd.printIdPwd();
		
		

	}

}