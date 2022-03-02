package com.javalec.base;

/*
 * date : 2022/02/24
 * name : HyeogDo
 * purpose : study For2
 * 
 */

public class Quiz_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++ ) {
				if ( j % 2 == 1 ) {
					System.out.print("*" + " X " + i + " = " + (i*j) + "\t");			
				} else if (i % 2 == 1){
					System.out.print(j + " X " + "*" + " = " + (i*j) + "\t");
				} else {
					System.out.print(j + " X " + i + " = " + (i*j) + "\t");
					
				}

				
			}
			System.out.println();
			
		}
		
	}

}
