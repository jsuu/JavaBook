package sec01.exam04;

public class IfDiceEx {

	public static void main(String[] args) {
		
		double r = Math.random();
//		int i = (int)(r*10);	// 0~9
		int i = (int)(r*10) + 1;	// 1~10
		
		System.out.println(i);
		
//		 1~ n����  ���� ������:  (int)(Math.random()*n) + 1;    
		
//		double num = Math.floor(Math.random()*6) + 1;
//		int num = (int)(Math.random()*6) + 1;
//		
//		if (num == 1) {
//			System.out.println("1���� ���Ծ��");
//		
//		} else if (num == 2) {
//			System.out.println("2���� ���Ծ��");			
//		
//		} else if(num == 3){
//			System.out.println("3���� ���Ծ��");			
//		
//		} else if(num ==4){
//			System.out.println("4���� ���Ծ��");			
//			
//		} else if(num == 5){
//			System.out.println("5���� ���Ծ��");			
//			
//		} else if(num ==6){
//			System.out.println("6���� ���Ծ��");				
//		} 
	}
}
