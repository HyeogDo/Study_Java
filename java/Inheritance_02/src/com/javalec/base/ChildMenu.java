package com.javalec.base;

/*
* 작성자 : 권혁도
* 생성일 : 2022/03/03
* 최종 수정일 : 2022/03/03
* 목적 : 상속의 이해
*/
public class ChildMenu extends ParentsMenu{
	
	// Field
	
	
	// Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNa() {
		System.out.println("콩나물 국");
	}
	
	// 상속받은 기능을 바꿔서 쓰겠다
	@Override
	public void makeChung() {
		System.out.println("냄새 없는 청국장");
	}

}
