package sec02.exam06;

import java.math.BigDecimal;

public class BigDecimal2 {


	public static void main(String[] args) {
		double d1= 2.0;
		double d2= 1.1;
		System.out.println(d1-d2);

		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		
		float f1= 2.0f;
		float f2=1.1f;	 
		System.out.println(f1-f2);
 
	}

}
