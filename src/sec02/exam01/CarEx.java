package sec02.exam01;

public class CarEx {

	public static void main(String[] args) {
		//객체생성
		Car myCar = new Car();
		
		//필드값읽기
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델:"+myCar.model);
		System.out.println("색상:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);

		//필드값변경
		myCar.speed = 60;
		System.out.println(":"+myCar.speed);
	}

}
