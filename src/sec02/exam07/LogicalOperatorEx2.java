package sec02.exam07;

public class LogicalOperatorEx2 {

	public static void main(String[] args) {
		String sNum1 = "100";
		String sNum2 = "abc";
		
//		if (Integer.parseInt(sNum1)>50 | Integer.parseInt(sNum2)>300) {  //오류! 모두검사, 두번쨰 숫자형이 아니라서 parse가 안된다.
		 
		//&&  ||  -->  short circuit operator	두개중 1개만 검사해도 가능하면  다음은 연산 안함.
		if (Integer.parseInt(sNum1)>50 || Integer.parseInt(sNum2)>300) {  //처음에만 검사한다
			System.out.println("if문 작동");
		}
		System.out.println("정상 메인종료");		

	}

}
