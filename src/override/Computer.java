package override;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r){
		System.out.println("computer°´Ã¼ÀÇ areacircle() ½ÇÇà");
		return Math.PI * r * r;
	}	
}
