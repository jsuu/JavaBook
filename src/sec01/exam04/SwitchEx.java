package sec01.exam04;

public class SwitchEx {

	public static void main(String[] args) {
		int num = (int) ((Math.random()*6) +1);
		
		switch (num) {
		case 1:
			System.out.println("1���� ���Ծ�� ");
			break;
		case 2:
			System.out.println("2���� ���Ծ�� ");
			break;
		case 3:
			System.out.println("3���� ���Ծ�� ");
			break;
		case 4:
			System.out.println("4���� ���Ծ�� ");
			break;
		case 5:
			System.out.println("5���� ���Ծ�� ");
			break;

		default:
			System.out.println("6���� ���Ծ�� ");
			break;
		}

	}

}
