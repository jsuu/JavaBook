package sec01.exam04;

public class SwitchNoBreakCaseEx {

	public static void main(String[] args) {
		int time = (int) ((Math.random()*4) + 8);
				System.out.println("[현재시각: "+time+"시]");
		
		switch (time) {
		case 8:		//break 없으므로  다음case와 상관없이 break나올떄까지 아래실행문 차례로 수행
			System.out.println("출근");			
		case 9:
			System.out.println("회의");			
		case 10:
			System.out.println("업무");			
			
		default:
			System.out.println("외근");			
		}

	}

}
