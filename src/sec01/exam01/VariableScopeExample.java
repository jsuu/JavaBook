package sec01.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
			int v1 = 15;
			if (v1 >10) {
				int v2;
				v2 =v1 -10;
			}
		//  int v3 = v1 + v2 +5;	v2 �� if���ȿ����� ���
			
			
			int value10 =  10;	//10����	
			int value2 = 0b10;	//2����	
			int value8 = 010;	//8����
			int value16 = 0x10;	//16����
			
			System.out.println(value10);
			
			System.out.println(value2);
			System.out.println(value8);
			System.out.println(value16);
	}

}
