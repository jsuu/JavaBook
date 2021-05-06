package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// int value;	// 선언은 되었지만 초기화가 안되어 메모리번지 할당안됨.
		int value = 0;	//초기화.  번지값 할당되어 변수가 생성되어 변수에 저장
		
		int result = value + 10;
		
		System.out.println(result);

	}

}
