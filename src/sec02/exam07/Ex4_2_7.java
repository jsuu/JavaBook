package sec02.exam07;

import java.util.Scanner;

public class Ex4_2_7 {

	public static void main(String[] args) {
		
		
		int balance =0;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1:예금 | 2:출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int n = sc1.nextInt();
			
				switch (n) {
				case 1:				
					System.out.println("예금액을 입금하세요");
					int n2 = sc2.nextInt();
//					String strmMoney = sc2.nextLine();	// String으로 받을경우.
//					balance += Integer.parseInt(strmMoney);
					balance += n2;
					System.out.println("예금액> "+n2);
					break;
	
				case 2:				
					System.out.println("출금액을 입금하세요");
					int n3 = sc2.nextInt();
					balance -= n3;
					System.out.println("출금액> "+n3);
					break;
					
				case 3:				
					System.out.println("잔액> "+balance);
					break;
			
				case 4:
					run = false;
					System.out.println("프로그램종료");
					break;
					
				default :
					System.out.println("선택이 잘못되었ㅎ네욧");
					break;	
				}
		}
		
	}

}
