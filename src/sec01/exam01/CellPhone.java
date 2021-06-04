package sec01.exam01;

public class CellPhone {
	//field
	String model;
	String color;
	
	//기본생성자
	
	//메소드
	void poweron(){System.out.println("전원켭니다");}
	void poweroff(){System.out.println("전원끕니다");}
	void bell(){System.out.println("벨이울립니다");}
	void sendVoice(String message){System.out.println("자기: "+message);}
	void receiveVoice(String message){System.out.println("상대방"+message);}
	void hangUp(){System.out.println("전화 끊습니다");}
}
