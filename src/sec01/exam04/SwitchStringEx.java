package sec01.exam04;

public class SwitchStringEx {

	public static void main(String[] args) {
		String position = "����";
		
		switch (position) {
		case "����":
			int tax = (int) (700*0.3);		//int tax�� sw���ȿ����� ��ȿ	
			System.out.println("700���� tax ="+tax);
			break;
		case "����":
			tax = (int) (700*0.3);			
			System.out.println("500���� tax ="+tax);
			break;

		default:
			System.out.println("100����");
		}
		
	}

}

// ����ڷκ��� strNum1 , strN2,  ������ �Է� strOp
//   
//�� ���� 
//int result = num1 + num2;
//int result = num1 - num2;
//int result = num1 * num2;
//int result = num1 / num2;

