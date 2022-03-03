package com.javalec.function;

public class MultiCalc {
	
	// Field
	
	
	
	// Constructor
	public MultiCalc() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void calc(int choiceNumber, int firstNum, int secondNum) {
		if (choiceNumber > 3 || choiceNumber < 1) {
			System.out.println("잘못된 수를 선택하셨습니다.");
		} else if (choiceNumber == 1) {
			addition(firstNum, secondNum);
		} else if (choiceNumber == 2) {
			subtraction(firstNum, secondNum);
		} else if (choiceNumber == 3) {
			multiplication(firstNum, secondNum);
		}
	}
	
	// 덧셈 출력
	private void addition(int firstNum, int secondNum) {
		System.out.printf("%d + %d = %d\n", firstNum, secondNum, (firstNum + secondNum));
	}
	// 뺄셈 출력
	private void subtraction(int firstNum, int secondNum) {
		System.out.printf("%d - %d = %d\n", firstNum, secondNum, (firstNum - secondNum));
	}
	// 곱셈 출력
	private void multiplication(int firstNum, int secondNum) {
		System.out.printf("%d * %d = %d\n", firstNum, secondNum, (firstNum * secondNum));
	}
	

}
