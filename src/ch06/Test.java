package ch06;

public class Test {
//	int a = math.f(100, 200);	//실행문은 메소드 안에 위치해야함.  class에는 안된다.
	
	public static void main(String[] args) {
		
		MyMath math = new MyMath();   //객체생성
		int a = math.f(100, 200);		//실행문은 메소드 안에 위치해야함. 
		
		math.toInt("10000");
		
		int b = math.f(2, 3);
		System.out.println(a+"  "+b);

	}

}
