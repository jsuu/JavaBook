package ch06;

public class Test {
//	int a = math.f(100, 200);	//���๮�� �޼ҵ� �ȿ� ��ġ�ؾ���.  class���� �ȵȴ�.
	
	public static void main(String[] args) {
		
		MyMath math = new MyMath();   //��ü����
		int a = math.f(100, 200);		//���๮�� �޼ҵ� �ȿ� ��ġ�ؾ���. 
		
		math.toInt("10000");
		
		int b = math.f(2, 3);
		System.out.println(a+"  "+b);

	}

}
