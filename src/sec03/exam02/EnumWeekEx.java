package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;		// import sec03.exam01¿¡ ¼±¾ğÇÑ enum Week¸¦ ÀÓÆ÷Æ®ÈÄ ÃÊ±âÈ­.  
		
		Calendar cal = Calendar.getInstance();	//Calendar °´Ã¼»ı¼º
		int week = cal.get(Calendar.DAY_OF_WEEK);	// ¼ıÀÚ ¸®ÅÏ 1~7
		
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
		System.out.println("¿À´Ã¿äÀÏ: "+today);
		
		//Week´Â ÂüÁ¶Å¸ÀÔ(enum)ÀÌÁö¸¸  SUNDAY ´Â ¿­°Å»ó¼öÀÌ¹Ç·Î  ==ÀÌ¿ë
		if (today == Week.SUNDAY) {		
			System.out.println("ÀÏ¿äÀÏ¿£ ®‚±¸¸¦ ÇÕˆ•");
		}else {
			System.out.println("¿­½ÉÈ÷ ÀÚ¹Ù°øºÎ¸¦ ÇÕ´Ï´Ù");
		}
	}
}
