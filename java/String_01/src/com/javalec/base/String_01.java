package com.javalec.base;


/*
 * 작성자 : 권혁도
 * 생성일 : 2022/02/28
 * 최종 수정일 : 2022/02/28
 * 목적 : API(application programming interface) 공부
 */
public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// API (Application Program Interface)
		// 개발자들이 편리하게 사용할 수 있도록 정의한 클래스들의 집합
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
	//	String str3 = "opqrstu";
		String str4 = "   abc   def   ghi   ";
		String str5 = "   abcdefg   ";
		
		System.out.println(str1.concat(str2)); // 이어붙히기
		System.out.println(str1.substring(3)); // 일부만 출력
		System.out.println(str1.substring(3, 5));
		
		String abc = str1.substring(3,5);
		System.out.println(abc);
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase()); // 대문자로 변환
		System.out.println(str2.toLowerCase()); // 소문자로 변환
		System.out.println(str1.equals(str4));
		System.out.println(str4.trim()); // 앞뒤 공백 제거
		
		System.out.println(str5.trim().equals(str1));
		System.out.println(str1.replace('a', 'b')); // 내용 변경
		System.out.println(str1.replaceAll( "abc", "ZZZZZZZZ")); // 묶음으로 변경
		System.out.println(str1.replaceAll("a", "" )); // 내용 일부 지우기
		
		
	}

}
