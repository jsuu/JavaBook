package inheritance;

public class InheritanceB extends InheritanceA{
	InheritanceB() {
	//	super();  	//������������ �θ�����ڸ� ���� �ڵ� ȣ��.
		//super(10);	
		System.out.println("InheritanceB ������ ����");	
	}
	
	int memberB = 200;
	void methodB(){};
}
