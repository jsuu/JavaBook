package sec01.exam04;

public class SwitchCharEx {

	public static void main(String[] args) {
		char grade ='B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;

		default:
			break;
		}

	}

}
