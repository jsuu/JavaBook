package sec01.exam04;

public class SwitchCharEx {

	public static void main(String[] args) {
		char grade ='B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;

		default:
			break;
		}

	}

}
