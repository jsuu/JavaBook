package sec05.exam04;

public class Singleton {
	//�ʵ� 
	private static Singleton singleton = new Singleton();	
	
	//�����ڸ� �����ϸ� public���� �ڵ������Ǿ� �ܺο��� ��ü������ �����ϰ� �ǹǷ�
	//�ܺο��� ȣ���Ҽ� ������ private��  ����,
	private Singleton(){}
	
	 static Singleton getInstance(){	//static �޼ҵ��  static���� ����� �ʵ常 ������ �� �ִ�
		return singleton;
	}
}
