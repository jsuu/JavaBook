package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;		// import sec03.exam01에 선언한 enum Week를 임포트후 초기화.  
		
		Calendar cal = Calendar.getInstance();	//Calendar 객체생성
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 숫자 리턴 1~7
		
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
		System.out.println("오늘요일: "+today);
		
		//Week는 참조타입(enum)이지만  SUNDAY 는 열거상수이므로  ==이용
		if (today == Week.SUNDAY) {		
			System.out.println("일요일엔 츅구를 합닏");
		}else {
			System.out.println("열심히 자바공부를 합니다");
		}
	}
}
