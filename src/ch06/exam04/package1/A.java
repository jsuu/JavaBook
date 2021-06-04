package ch06.exam04.package1;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b){}	//갗은 project내
	A(int b){}				//default 같은 pkg내
	private A(String s){}	//같은 class내
}
