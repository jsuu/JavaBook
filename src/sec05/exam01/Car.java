package sec05.exam01;

public class Car {
	//�������
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;		
	}
	
	//�޼ҵ�
	void setSpeed(int speed){
		this.speed = speed;
	}
	
	void run(){
		for (int i = 10; i < 50; i+=10) {
			this.setSpeed(i);	// this��������.
			System.out.println(this.model + "�� �޸���.(�ü�:" + this.speed + "km/h");
		}
	}
}
