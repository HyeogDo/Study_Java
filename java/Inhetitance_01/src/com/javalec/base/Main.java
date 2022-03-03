package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		System.out.print("아버님 성함 : ");
		child.getFather();
		
		System.out.print("어머님 성함 : ");
		child.getMother();
		
		System.out.print("본인 이름 : ");
		child.getMe();
		
	}

}
