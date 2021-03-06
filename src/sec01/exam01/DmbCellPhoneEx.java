package sec01.exam01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		//객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("java폰","검정",10);
		
		//CellPhone클래스로부터 상속받은 필드
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		//DmbCellPhone클래스 
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone클래스로부터 상속받은  메소드호출
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("네, 반가워여");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone클래스 의 메소드호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
