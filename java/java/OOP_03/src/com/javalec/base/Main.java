package com.javalec.base;

import com.javalec.function.Korean;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/02
* 최종 수정일 : 2022/03/02
* 목적 : 객체지향 프로그래밍 연습
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kor이라는 인스턴스를 만든다.
		Korean kor = new Korean("홍길동","010-1234-5678");
		
		
		// Field의 name에는 홍길동, phone에는 010-1234-5678을 추가하여 출력하기
//		kor.name = "홍길동";
//		kor.phone = "010-1234-5678";
		
//		System.out.println("국적 : " + kor.nation);
//		System.out.println("이름 : " + kor.name);
//		System.out.println("번호 : " + kor.phone);
		

		kor.printName();
		
		
		

	}

}
