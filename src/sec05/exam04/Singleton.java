package sec05.exam04;

public class Singleton {
	//필드 
	private static Singleton singleton = new Singleton();	
	
	//생성자를 생략하면 public으로 자동생성되어 외부에서 객체생성이 가능하게 되므로
	//외부에서 호출할수 없도록 private로  생성,
	private Singleton(){}
	
	 static Singleton getInstance(){	//static 메소드는  static으로 선언된 필드만 가져올 수 있다
		return singleton;
	}
}
