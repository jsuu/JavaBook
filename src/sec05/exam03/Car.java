package sec05.exam03;

public class Car {
	public static int speed;
	
	private static void run(){
		System.out.println(speed + "���� �޸���");
	}

	public static void main(String[] args) {
	//	Car myCar = new Car();		// �������, �޼ҵ尡 static�̹Ƿ� ��ü���� ���ʿ�

//		Car.speed = 60;
		speed = 60;		//����class�ȿ� �����Ƿ� Ŭ������ ��������

//		Car.run();
		run();			//����class�ȿ� �����Ƿ� Ŭ������ ��������
	}
}
