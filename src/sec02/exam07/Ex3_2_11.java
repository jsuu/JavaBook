package sec02.exam07;

import java.util.Scanner;

public class Ex3_2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵�: ");
		String name = sc.nextLine();
		
		System.out.println("�н�����: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
			if (name.equals("java")) {	//String ��  .equals("") ��  �Ѵ�.
					if (password == 12345) {
						System.out.println("login ����");
					}else{
						System.out.println("login ����: �н����� Ʋ��");
					}
			}else{				
				System.out.println("login ����: ���̵��������� ����");
			}
	}//main
}