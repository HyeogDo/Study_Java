package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class PutNum {
	
	// Field
	Scanner scanner = new Scanner(System.in);
	int listSize = 0;
	public static ArrayList<Integer> intList = new ArrayList<Integer>();
	// Constructor
	public PutNum() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void putNum() {
		System.out.print("입력할 숫자의 개수 ? : ");
		listSize = scanner.nextInt();
		System.out.println(listSize + "개의 숫자를 입력하세요 !");
		for (int i = 0; i < listSize; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			PutNum.intList.add(scanner.nextInt());
		}
	}
	


}
