package override;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r){
		System.out.println("computer��ü�� areacircle() ����");
		return Math.PI * r * r;
	}	
}
