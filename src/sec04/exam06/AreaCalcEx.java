package sec04.exam06;

public class AreaCalcEx {

	public static void main(String[] args) {
		AreaCalc myCalc = new AreaCalc();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10,20);
		
		System.out.println("���簢������= "+result1);
		System.out.println("���簢������= "+result2);
		

	}

}
