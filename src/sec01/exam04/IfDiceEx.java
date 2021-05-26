package sec01.exam04;

public class IfDiceEx {

	public static void main(String[] args) {
		
		double r = Math.random();
//		int i = (int)(r*10);	// 0~9
		int i = (int)(r*10) + 1;	// 1~10
		
		System.out.println(i);
		
//		 1~ n까지  정수 나오게:  (int)(Math.random()*n) + 1;    
		
//		double num = Math.floor(Math.random()*6) + 1;
//		int num = (int)(Math.random()*6) + 1;
//		
//		if (num == 1) {
//			System.out.println("1번이 나왔어요");
//		
//		} else if (num == 2) {
//			System.out.println("2번이 나왔어요");			
//		
//		} else if(num == 3){
//			System.out.println("3번이 나왔어요");			
//		
//		} else if(num ==4){
//			System.out.println("4번이 나왔어요");			
//			
//		} else if(num == 5){
//			System.out.println("5번이 나왔어요");			
//			
//		} else if(num ==6){
//			System.out.println("6번이 나왔어요");				
//		} 
	}
}
