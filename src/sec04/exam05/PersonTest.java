package sec04.exam05;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("ggg","9999-555", 4);
		Person p2 = new Person("vvv","664-111", 5);
		Person p3 = new Person("www","333-000", 9);
		p1.sn = "7777-4444";
		p1.printInfo();
		String sn = 	p1.getSn();
		System.out.println("주민번호는" +sn);
		
		
		
//		Person p2; //null
//		p2.sn = "9999";
		
		p2 = p1;		//p1의 참조주소를 p2도 같이 가진다
		p2.sn = "2021-898";
//		System.out.println("p2_nmae= "+p2.name);
//		System.out.println("p2_sn= "+p2.sn);
//		System.out.println("p1_sn= "+p1.sn);
		p2.printInfo();
		sn = 	p2.getSn();
		System.out.println("주민번호는" +sn);

	}

}
