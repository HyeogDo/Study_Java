package com.javalec.base;

import java.util.Scanner;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/04
* 최종 수정일 : 2022/03/04
* 목적 : ArrayList의 이해
*/
public class DeleteNum {
	
	// Field
	Scanner scanner = new Scanner(System.in);
	int deleteNum = 0;
	// Constructor
	public DeleteNum() {
		// TODO Auto-generated constructor stub
	}
	// Method
	public void deleteNum() {
		while ( true ) {
			System.out.print("몇번째 숫자를 삭제 하시겠습니까? : ");
			deleteNum = scanner.nextInt();
			if (deleteNum < 1 || deleteNum > PutNum.intList.size() ) {
				System.out.println("1~" + PutNum.intList.size() + " 사이의 숫자를 입력해주세요");
			} else {
				PutNum.intList.remove(deleteNum-1);
				break;
			}
		}
	}
}
