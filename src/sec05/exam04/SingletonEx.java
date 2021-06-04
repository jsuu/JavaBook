package sec05.exam04;

public class SingletonEx {

	public static void main(String[] args) {
		
		//싱글톤이므로 외부에서 객체생성을 못한다
//		Singleton obj1 = new Singleton();	
//		Singleton obj2 = new Singleton();
		
		//객체생성없이 클래스명 Singleton.으로 접근하므로,  
		//Singleton클래스 getInstance()메소드가 static이 선언되어야 한다.
		Singleton obj1 = Singleton.getInstance(); 
		Singleton obj2 = Singleton.getInstance();
		
		//obj1 과 obj2의  참조주소가 같다. 같은 객체를 참조
		System.out.println(obj1);	
		System.out.println(obj2);

	}

}
