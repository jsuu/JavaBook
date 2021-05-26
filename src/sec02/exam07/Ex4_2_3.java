package sec02.exam07;

public class Ex4_2_3 {

	public static void main(String[] args) {
			
		int sum = 0;
		while (sum !=5) {
			int n1 = (int) ((Math.random()*6)+1);
			int n2 = (int) ((Math.random()*6)+1);
			sum =n1 + n2;
			System.out.println("(" +n1+","+n2+")");
			
				if (sum == 5) {
					break;
				}
		}
	}

}
