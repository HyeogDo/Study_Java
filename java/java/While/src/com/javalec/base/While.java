package com.javalec.base;

/*
 * date : 2022/02/24
 * name : HyeogDo
 * purpose : study while
 */

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		int tot = 0;
//		
//		
//		// 1부터 100까지의 합을 구하기
//		while ( true ) {
//			tot += i;
//			i++;
//			if ( i > 100) {
//				break;
//			}
//		}	
		
		
		
//		System.out.println("1부터 100까지의 합은 " + tot + "입니다.");
		
//		for(int i = 0; i <= 100;i++ ) {
//			if ( i == 10) {
//				System.out.println("Find");
//				break;
//			}
//			System.out.println(i);
//		}

		for(int i = 0; i <= 100;i++ ) {
			if ( i == 10) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
