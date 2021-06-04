package sec05.exam03;

public class Car {
	public static int speed;
	
	private static void run(){
		System.out.println(speed + "으로 달린다");
	}

	public static void main(String[] args) {
	//	Car myCar = new Car();		// 멤버변수, 메소드가 static이므로 객체생성 불필요

//		Car.speed = 60;
		speed = 60;		//같은class안에 있으므로 클래스명 생략가능

//		Car.run();
		run();			//같은class안에 있으므로 클래스명 생략가능
	}
}
