package sec01.exam01;

public abstract class Test {

	public static void main(String[] args) {
		String s1 = new String("������");
//		s1 = "������";
		
		String s2 = new String("������");
//		s2 = "������";
		
//		if (s1 == s2){			//�������� �ּҸ� ��  :�ٸ���   
		if (s1.equals(s2)) {  	// ���� ��     		: ����
			System.out.println("����");
		}else System.out.println("�ٸ���");
		
		int i =0;			//int �ʱ�ȭ
//		String s = "";		//String ���ڿ��� �����ִ� (�̰͵� ���ڿ��̴�)
		String s = null;	// ���� ����.     String �ʱ�ȭ
		
		
		System.out.println(s.equals(""));		//  null���� ����� �Ҽ�����.    NullPointerException
	}

}
