package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;		// import sec03.exam01�� ������ enum Week�� ����Ʈ�� �ʱ�ȭ.  
		
		Calendar cal = Calendar.getInstance();	//Calendar ��ü����
		int week = cal.get(Calendar.DAY_OF_WEEK);	// ���� ���� 1~7
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("���ÿ���: "+today);
		
		//Week�� ����Ÿ��(enum)������  SUNDAY �� ���Ż���̹Ƿ�  ==�̿�
		if (today == Week.SUNDAY) {		
			System.out.println("�Ͽ��Ͽ� ������ �Ո�");
		}else {
			System.out.println("������ �ڹٰ��θ� �մϴ�");
		}
	}
}
