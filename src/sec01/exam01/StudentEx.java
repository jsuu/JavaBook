package sec01.exam01;

public class StudentEx {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1변수가 Student객체를 참조합니다");
		System.out.println(s1);
		System.out.println(s1.toString());
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student객체를 참조합니다");
		System.out.println(s2);
		

	}

}
