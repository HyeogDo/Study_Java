package com.javalec.base;

/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : API(application programming interface) 공부
 */

public class StringBuilder_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
//		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		
		stringBuilder.append("hijklmn"); // 추가
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "ZZZ"); // 삽입
		stringBuilder.delete(3, 5); // 제거
		System.out.println(stringBuilder);

	}

}
