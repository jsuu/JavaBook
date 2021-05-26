package sec01.exam04;

public class SwitchStringEx {

	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			int tax = (int) (700*0.3);		//int tax는 sw문안에서만 유효	
			System.out.println("700만원 tax ="+tax);
			break;
		case "과장":
			tax = (int) (700*0.3);			
			System.out.println("500만원 tax ="+tax);
			break;

		default:
			System.out.println("100만원");
		}
		
	}

}

// 사용자로부터 strNum1 , strN2,  연산장 입력 strOp
//   
//에 따라 
//int result = num1 + num2;
//int result = num1 - num2;
//int result = num1 * num2;
//int result = num1 / num2;

