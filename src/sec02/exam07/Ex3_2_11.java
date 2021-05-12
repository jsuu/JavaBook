package sec02.exam07;

import java.util.Scanner;

public class Ex3_2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = sc.nextLine();
		
		System.out.println("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
			if (name.equals("java")) {	//String 은  .equals("") 로  한다.
					if (password == 12345) {
						System.out.println("login 성공");
					}else{
						System.out.println("login 실패: 패스워드 틀림");
					}
			}else{				
				System.out.println("login 실패: 아이디존재하지 않음");
			}
	}//main
}