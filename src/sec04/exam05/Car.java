package sec04.exam05;

public class Car {
	int speed;
	
	int getSpeed(){
		return speed;
	}
	
	void keyTurnOn(){
		System.out.println("키를 돌려요");
	}
	void run(){
		for(int i=10;i<=50;i+=10){
			speed = i;
			System.out.println("달려요.:(시속" + speed+"km/h");
		}
	}
}
