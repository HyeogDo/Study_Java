package com.javalec.base;

import java.util.ArrayList;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(">>>>>> ArrayList <<<<<<");
		
		
		// 구성
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// 추가
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		
		// 확인하기
		System.out.println(arrayList.toString());
		
		// 불러오기
		String no1 = arrayList.get(0);
		System.out.println(no1);
		
		// 변경하기
		arrayList.set(2, "str333");
		System.out.println(arrayList.toString());
		
		// 삭제하기
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		// 크기 알기
		int size = arrayList.size();
		System.out.println(size);
		
		
		
		// Quiz ArrayList intList 에 1부터 100까지 수를 넣으세요
		// 구성
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		// 추가
		for (int i = 1; i <= 100; i++) {
			intList.add(i);
		}
		
		// 확인하기
	//	System.out.println(intList);

	}

}
