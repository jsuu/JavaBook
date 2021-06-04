package sec04.exam05;

public class Person {
	String name;
	String sn;
	int age;
	
//	Person(String s, String sn, int a){
//		name = s;
//		this.sn = sn;
//		age = a;
//		System.out.println("Person생성자");
//	}
	
	
	//constructor - 객체생성시 한번 사용 . 멤버변수 값 초기화
	public Person(String name, String sn, int age) {
		this.name = name;
		this.sn = sn;
		this.age = age;
	}
	
	//생성자 오버로딩 (매개변수는 달라야 함.)
	Person(){		
	}
	
	
	void printInfo(){
		System.out.println(name);
		System.out.println(age);
	}
	

	public String getSn(){
		return sn;
	}
	
	//메소드 오버로딩 (매개변수는 달라야 함.)
	public String getSn(int a){
		return "a";
	}


}
