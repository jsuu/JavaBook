package sec04.exam03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("���~");
			
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ�����");			
		}else{	
			System.out.println("gas�� �����ؾ� �ؿ�");			
		}
	}	

}
