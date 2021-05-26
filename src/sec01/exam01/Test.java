package sec01.exam01;

public abstract class Test {

	public static void main(String[] args) {
		String s1 = new String("가나다");
//		s1 = "가나다";
		
		String s2 = new String("가나다");
//		s2 = "가나다";
		
//		if (s1 == s2){			//참조변수 주소를 비교  :다르다   
		if (s1.equals(s2)) {  	// 값을 비교     		: 같다
			System.out.println("같다");
		}else System.out.println("다르다");
		
		int i =0;			//int 초기화
//		String s = "";		//String 빈문자열의 값이있다 (이것도 문자열이다)
		String s = null;	// 값이 없다.     String 초기화
		
		
		System.out.println(s.equals(""));		//  null값은 기능을 할수없다.    NullPointerException
	}

}
