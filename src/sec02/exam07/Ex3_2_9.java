package sec02.exam07;

import java.util.Scanner;

public class Ex3_2_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력히세요");
		String str1 = sc.nextLine();
		
		System.out.println("두번쨰 숫자를 입력히세요");
		String str2 = sc.nextLine();
		
		double sc1 = Double.parseDouble(str1);
		double sc2 = Double.parseDouble(str2);
		
		System.out.println("첫번쨰 수: "+sc1);
		System.out.println("두번쨰 수: "+sc2);
		System.out.println("-----------------------");
		
		if (sc2 == 0 || sc2 == 0.0) {
			System.out.println("결과: 무한대");			
		}else{
		System.out.println("결과:"+ sc1/sc2);
		}
	}

}
