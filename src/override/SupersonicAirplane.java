package override;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flymode = NORMAL;	//�ʱⰪ 1
	
	@Override
	public void fly(){
		if (flymode == SUPERSONIC) {
			System.out.println("�����Ӻ���~");
		}else{
			super.fly();// �θ�Ŭ���� �޼ҵ�ȣ��
		}
	}
	
}
