package sec04.exam01;

import java.util.Scanner;

public class Ex2_4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù���� ��");
		String strNum1 = sc.nextLine();	//String�� ��ȯ            *nextInt() : int�� ��ȯ
		
		System.out.println("�ι��� ��");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("�������= "+result);		
		
	}

}
