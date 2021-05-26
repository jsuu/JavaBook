package sec02.exam07;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		String[] strings = {"가나다","홍길동","강감찬","이순신"};
		
			Arrays.sort(strings);		//정렬
			
//			for (int i = 0; i < strings.length; i++) {
//				System.out.println(strings[i]);
//			}
			
//		System.out.println(strings);	//   [Ljava.lang.String;@15db9742
		System.out.println(Arrays.toString(strings));	// [가나다, 강감찬, 이순신, 홍길동] 
	}
}
