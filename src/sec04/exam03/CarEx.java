package sec04.exam03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발~");
			
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요없어요");			
		}else{	
			System.out.println("gas를 주입해야 해요");			
		}
	}	

}
