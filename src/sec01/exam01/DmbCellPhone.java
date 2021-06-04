package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	//field
	int channel;
	
	//생성자
	DmbCellPhone(String model,String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb(){
		System.out.println("채녈"+ channel+"번 dmb 방송수신시작");
	}
	
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("채녈"+ channel+"번 으로 바꿉니다.");		
	}
	
	void turnOffDmb(){
		System.out.println("dmb 방송수신을 멈춥니다.");		
	}
}
