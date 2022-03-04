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
		
		/*
		 * Override
		 * 자식 class가 부모 class로 부터 상속하여 자식 없는 method를 호출하면 부모 class로 가서 찾게 됩니다.
		 * 만약 부모 class로부터 상속받은 method를 자식 class가 재정의하면 해당 method를 호출하면 부모 class로 가지 않고
		 * 자식 class에서 찾게 됩니다. 이것은 오버라이드라고 합니다. 
		 * 
		 * 매서드 오버로딩(Overloading)
		 * overloading(중복정의)은 하나의 클래스 내에서 같은 이름을 가지는 매서드를 여러 개 정의하는 것
		 * 컴파일 시 컴파일러에 의해 정의된 각각의 메서드들이 구별되며 구별의 기준은 인자가 됩니다.
		 * 
		 * 메서드 오버로딩 규칙
		 * 메서드 명은 같고 인자의 타입을 다르게 명시
		 * 타입이 같으면 인자의 갯수를 다르게 명시
		 * 타입과 갯수가 같으면 인자의 순서를 다르게 명시
		 * 
		 * 
		 * 
		 * Package
		 * package 명은 보통 회사의 domain 주소로 사용
		 * 자바에서 이야기 하는 패키지는 서로 관련 있는 클래스와 인터페이스를 하나의 단위로 묶는 것을 의미하며 일종의 library와 비슷합니다.
		 * 클래스이 중복 문제를 해결하기 위한 수단입니다.
		 * 패키지는 폴더로 관리되어 집니다.
		 * 
		 * Import
		 * class 를 import 해야 함
		 * 
		 * 접근 제한 종류
		 * public		
		 * private		
		 * protected	
		 * default		
		 * 
		 * 예외 : 문제가 발생할 만한 곳을 찾아서 문제가 발생하면 이렇게 처리하라고 정의하는 것
		 * 예외 처리의 필요성여러가지 기능을 갖춘 프로그램을 작성하여 진행하였는데 간단한 문제가 발생하여 다음 단계로 넘어가지 못해 어렵게 제작한 기능들을 구현하지 못하는 문제를 회피하기 위해
		 * 
		 * Static
		 * 
		 * 
		 */
				
		
		ChildMenu childMenu = new ChildMenu();
		childMenu.makeChung();
		childMenu.makeDoen();
		childMenu.makeGal();
		childMenu.makeHotDoen();
		childMenu.makeKongNa();
		childMenu.makeKong();
		
	}

}
