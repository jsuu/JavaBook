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
			System.out.println("1:���� | 2:��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			int n = sc1.nextInt();
			
				switch (n) {
				case 1:				
					System.out.println("���ݾ��� �Ա��ϼ���");
					int n2 = sc2.nextInt();
//					String strmMoney = sc2.nextLine();	// String���� �������.
//					balance += Integer.parseInt(strmMoney);
					balance += n2;
					System.out.println("���ݾ�> "+n2);
					break;
	
				case 2:				
					System.out.println("��ݾ��� �Ա��ϼ���");
					int n3 = sc2.nextInt();
					balance -= n3;
					System.out.println("��ݾ�> "+n3);
					break;
					
				case 3:				
					System.out.println("�ܾ�> "+balance);
					break;
			
				case 4:
					run = false;
					System.out.println("���α׷�����");
					break;
					
				default :
					System.out.println("������ �߸��Ǿ����׿�");
					break;	
				}
		}
		
	}

}
