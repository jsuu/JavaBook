package sec02.exam07;

import java.util.Scanner;

public class Ex3_2_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù���� ���ڸ� �Է�������");
		String str1 = sc.nextLine();
		
		System.out.println("�ι��� ���ڸ� �Է�������");
		String str2 = sc.nextLine();
		
		double sc1 = Double.parseDouble(str1);
		double sc2 = Double.parseDouble(str2);
		
		System.out.println("ù���� ��: "+sc1);
		System.out.println("�ι��� ��: "+sc2);
		System.out.println("-----------------------");
		
		if (sc2 == 0 || sc2 == 0.0) {
			System.out.println("���: ���Ѵ�");			
		}else{
		System.out.println("���:"+ sc1/sc2);
		}
	}

}
