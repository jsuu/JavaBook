package sec04.exam01;

import java.util.Scanner;

public class Ex2_4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 수");
		String strNum1 = sc.nextLine();	//String값 반환            *nextInt() : int값 반환
		
		System.out.println("두번쨰 수");
		String strNum2 = sc.nextLine();

		System.out.println(" + - * / 중 연산자 1개를 넣으세요");
		String strOp = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
					
		int result = 0;
		switch (strOp) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 + num2;
			break;			
		}		
		
		System.out.println("num1 "+strOp+" num2= "+result);
	}
}
