package com.javalec.base;

import java.util.Scanner;

/*
 * date : 2022/02/23
 * name : HyeogDo
 * purpose : study if
 */

public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 변수 선언
		String id = "root";
		String pw = "1234";
		
		// 제목
		System.out.println("** Log In Check **\n\n");
		
		// id, pw 입력받기
		System.out.print("User id : ");
		String user_id = scanner.next();
		System.out.print("Password : ");
		String password = scanner.next();
		
		// id, pw 값과 대조하기
		if ( user_id.equals(id) && password.equals(pw) ) {
			System.out.println("** 환영합니다. **");
		} else {
			System.out.println("** 등록된 사용자가 아닙니다. **");
		}
		

		
		scanner.close();
		
		
	}

}
