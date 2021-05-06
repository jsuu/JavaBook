package sec01.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
			int v1 = 15;
			if (v1 >10) {
				int v2;
				v2 =v1 -10;
			}
		//  int v3 = v1 + v2 +5;	v2 는 if문안에서만 사용
			
			
			int value10 =  10;	//10진수	
			int value2 = 0b10;	//2진수	
			int value8 = 010;	//8진수
			int value16 = 0x10;	//16진수
			
			System.out.println(value10);
			
			System.out.println(value2);
			System.out.println(value8);
			System.out.println(value16);
	}

}
