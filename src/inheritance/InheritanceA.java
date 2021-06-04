package inheritance;

public class InheritanceA {
	
	public InheritanceA() {	
		System.out.println("매개변수없는 InheritanceA 생성자 실행");	
	}
	
	//매개변수없는 기본생성자
	InheritanceA(int a) {
		System.out.println("매개변수있는 InheritanceA 생성자 실행");	
	}
	
	int memberA = 100;
	void methodA(){};

}
