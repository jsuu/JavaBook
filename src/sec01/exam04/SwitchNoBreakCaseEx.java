package sec01.exam04;

public class SwitchNoBreakCaseEx {

	public static void main(String[] args) {
		int time = (int) ((Math.random()*4) + 8);
				System.out.println("[����ð�: "+time+"��]");
		
		switch (time) {
		case 8:		//break �����Ƿ�  ����case�� ������� break���Ë����� �Ʒ����๮ ���ʷ� ����
			System.out.println("���");			
		case 9:
			System.out.println("ȸ��");			
		case 10:
			System.out.println("����");			
			
		default:
			System.out.println("�ܱ�");			
		}

	}

}
