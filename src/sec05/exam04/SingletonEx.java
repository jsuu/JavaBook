package sec05.exam04;

public class SingletonEx {

	public static void main(String[] args) {
		
		//�̱����̹Ƿ� �ܺο��� ��ü������ ���Ѵ�
//		Singleton obj1 = new Singleton();	
//		Singleton obj2 = new Singleton();
		
		//��ü�������� Ŭ������ Singleton.���� �����ϹǷ�,  
		//SingletonŬ���� getInstance()�޼ҵ尡 static�� ����Ǿ�� �Ѵ�.
		Singleton obj1 = Singleton.getInstance(); 
		Singleton obj2 = Singleton.getInstance();
		
		//obj1 �� obj2��  �����ּҰ� ����. ���� ��ü�� ����
		System.out.println(obj1);	
		System.out.println(obj2);

	}

}
