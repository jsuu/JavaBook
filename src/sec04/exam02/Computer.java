package sec04.exam02;

public class Computer {
	int sum1(int[] values){
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values){	//호출하는 메서드에서  인자수를 가변적으로 할 수 있다
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}
}
