package sec01.exam01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		//��ü����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("java��","����",10);
		
		//CellPhoneŬ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		//DmbCellPhoneŬ���� 
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		//CellPhoneŬ�����κ��� ��ӹ���  �޼ҵ�ȣ��
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��, �ݰ�����");
		dmbCellPhone.hangUp();
		
		//DmbCellPhoneŬ���� �� �޼ҵ�ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
