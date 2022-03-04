package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1, j = 10;
		SumEvenOdd seo = new SumEvenOdd();
		
		int sum = seo.sumCalc(i, j);
		String chk = seo.evenodd(sum);
		
		System.out.println(i + " ~ " + j + " 의 합은 " + sum + " 입니다.");
		System.out.println(chk + " 입니다.");

	}

}
