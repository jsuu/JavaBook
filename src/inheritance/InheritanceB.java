package inheritance;

public class InheritanceB extends InheritanceA{
	InheritanceB() {
	//	super();  	//숨겨져있지만 부모생성자를 먼저 자동 호출.
		//super(10);	
		System.out.println("InheritanceB 생성자 실행");	
	}
	
	int memberB = 200;
	void methodB(){};
}
