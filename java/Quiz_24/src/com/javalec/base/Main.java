package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiplicaitonTableMethod;
import com.javalec.function.MultiplicationTableArray;
import com.javalec.function.MultiplicationTableConstructor;
import com.javalec.function.MultiplicationTableField;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 환경 변수 선언
		Scanner scanner = new Scanner(System.in);
		int startNum = 0;
		
		// 몇단 출력할 것인지 받아오기
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		startNum = scanner.nextInt();
		System.out.println("------------------------");
		scanner.close();
		
		// 1. Field를 이용한 방법
		MultiplicationTableField multiplicationTableField = new MultiplicationTableField();
		multiplicationTableField.startNum = startNum;
		multiplicationTableField.makeTable();
		
		// --------------------------
		System.out.println("========================");
		
		// 2. Method를 이용한 방법
		MultiplicaitonTableMethod multiplicaitonTableMethod = new MultiplicaitonTableMethod();
		multiplicaitonTableMethod.makeTable(startNum);

		// --------------------------
		System.out.println("========================");
		
		// 3. Constructor를 이용한 방법
		MultiplicationTableConstructor multiplicationTableConstructor = new MultiplicationTableConstructor(startNum);
		multiplicationTableConstructor.makeTable();
		
		// --------------------------
		System.out.println("========================");
		
		// 4. String 배열로 return 하는 방법
		MultiplicationTableArray multiplicationTableArray = new MultiplicationTableArray(startNum);
		for (int i = 0; i < multiplicationTableArray.makeTable().length; i++) {
			System.out.println(multiplicationTableArray.makeTable()[i]);
		}
		
	}

}
