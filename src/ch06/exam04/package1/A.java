package ch06.exam04.package1;

public class A {
	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//������
	public A(boolean b){}	//���� project��
	A(int b){}				//default ���� pkg��
	private A(String s){}	//���� class��
}
