package sec04.exam05;

public class Person {
	String name;
	String sn;
	int age;
	
//	Person(String s, String sn, int a){
//		name = s;
//		this.sn = sn;
//		age = a;
//		System.out.println("Person������");
//	}
	
	
	//constructor - ��ü������ �ѹ� ��� . ������� �� �ʱ�ȭ
	public Person(String name, String sn, int age) {
		this.name = name;
		this.sn = sn;
		this.age = age;
	}
	
	//������ �����ε� (�Ű������� �޶�� ��.)
	Person(){		
	}
	
	
	void printInfo(){
		System.out.println(name);
		System.out.println(age);
	}
	

	public String getSn(){
		return sn;
	}
	
	//�޼ҵ� �����ε� (�Ű������� �޶�� ��.)
	public String getSn(int a){
		return "a";
	}


}
