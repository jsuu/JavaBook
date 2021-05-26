package sec01.exam01;

public class IfEx {

	public static void main(String[] args) {
		int score = 93;
		
		if (score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A임니다");
		}

		if (score<90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B임니다");
		}
	}

}
