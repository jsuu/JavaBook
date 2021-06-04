package override;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flymode = NORMAL;	//초기값 1
	
	@Override
	public void fly(){
		if (flymode == SUPERSONIC) {
			System.out.println("초음속비행~");
		}else{
			super.fly();// 부모클래스 메소드호출
		}
	}
	
}
